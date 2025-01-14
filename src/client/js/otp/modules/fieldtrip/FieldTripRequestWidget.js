/* This program is free software: you can redistribute it and/or
   modify it under the terms of the GNU Lesser General Public License
   as published by the Free Software Foundation, either version 3 of
   the License, or (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

otp.namespace("otp.modules.fieldtrip");

otp.modules.fieldtrip.FieldTripRequestWidget =
    otp.Class(otp.widgets.Widget, {

    module : null,

    initialize : function(id, module, request) {
        var this_ = this;

        this.module = module;
        this.request = request;
        //console.log("request "+request.id+":");
        //console.log(request);
        otp.widgets.Widget.prototype.initialize.call(this, id, module, {
            cssClass : 'otp-fieldTrip-requestWidget',
            title : "Field Trip Request #"+request.id,
            resizable : true,
            closeable : true,
        });

        //this.contentDiv  = $('<div class="otp-fieldTrip-requestWidget-content notDraggable" />').appendTo(this.mainDiv);
        this.render();
        this.centerX();
    },

    render : function() {
        var this_ = this;

        var context = _.clone(this.request);
        context.widgetId = this.id;
        context.dsUrl = otp.config.datastoreUrl;
        if(this.request.travelDate) {
            var m = moment(this.request.travelDate);
            context.travelDate = m.format("dddd, MMMM D, YYYY");
            context.travelDay = m.date();
            context.travelMonth = m.month()+1;
            context.travelYear = m.year();
        }
        if(this.request.arriveDestinationTime) context.arriveDestinationTime = moment(this.request.arriveDestinationTime).format(otp.config.timeFormat);
        if(this.request.leaveDestinationTime) context.leaveDestinationTime = moment(this.request.leaveDestinationTime).format(otp.config.timeFormat);
        if(this.request.arriveSchoolTime) context.arriveSchoolTime = moment(this.request.arriveSchoolTime).format(otp.config.timeFormat);

        if(this.request.ticketType === "own_tickets") context.ticketType = "Will use own tickets";
        else if(this.request.ticketType === "hop_new") context.ticketType = "Will purchase new Hop Card";
        else if(this.request.ticketType === "hop_reload") context.ticketType = "Will reload existing Hop Card";

        context.paymentPreference = "N/A";
        if(this.request.paymentPreference === "request_call") context.paymentPreference = "Call requested at provided phone number";
        else if(this.request.paymentPreference === "phone_cc") context.paymentPreference = "Will call in credit card info to TriMet";
        else if(this.request.paymentPreference === "fax_cc") context.paymentPreference = "Will fax credit card info to TriMet";
        else if(this.request.paymentPreference === "mail_check") context.paymentPreference = "Will mail check to TriMet";

        var outboundTrip = otp.util.FieldTrip.getOutboundTrip(this.request);
        if(outboundTrip) context.outboundPlanInfo = otp.util.FieldTrip.constructPlanInfo(outboundTrip);
        var inboundTrip = otp.util.FieldTrip.getInboundTrip(this.request);
        if(inboundTrip) context.inboundPlanInfo = otp.util.FieldTrip.constructPlanInfo(inboundTrip);

        context.internalNotes = [];
        context.operationalNotes = [];
        for(var i = 0; i < context.notes.length; i++) {
            if(context.notes[i].type === "internal") context.internalNotes.push(context.notes[i]);
            else if(context.notes[i].type === "operational") context.operationalNotes.push(context.notes[i]);
        }

        // Populate number paid & free students
        if(!context.numFreeStudents) context.numFreeStudents = 0
        context.numPaidStudents = context.numStudents - context.numFreeStudents

        if(this.content) this.content.remove();
        this.content = ich['otp-fieldtrip-request'](context).appendTo(this.mainDiv);

        if(outboundTrip) {
            this.content.find('.outboundPlanInfo').css('cursor', 'pointer').click(function() {
                this_.module.renderTrip(outboundTrip);
            });
        }

        if(inboundTrip) {
            this.content.find('.inboundPlanInfo').css('cursor', 'pointer').click(function() {
                this_.module.renderTrip(inboundTrip);
            });
        }

        //$('#' + this.id + '-outboundPlanButton').click(function(evt) {
        this.content.find('.outboundPlanButton').click(function(evt) {
            this_.module.planOutbound(this_.request);
        });

        this.content.find('.outboundSaveButton').click(function(evt) {
            this_.module.saveRequestTrip(this_.request, "outbound");
        });

        this.content.find('.inboundPlanButton').click(function(evt) {
            this_.module.planInbound(this_.request);
        });

        this.content.find('.inboundSaveButton').click(function(evt) {
            this_.module.saveRequestTrip(this_.request, "inbound");
        });

        this.content.find('.changeDateLink').click(function(evt) {
            otp.widgets.Dialogs.showDateDialog("Select the new travel date:", "Select Date", function(date) {
                if(otp.util.FieldTrip.getOutboundTrip(this_.request) || otp.util.FieldTrip.getInboundTrip(this_.request)) {
                    var msg = "This action will delete any itineraries previously planned for this request on the original date. Do you wish to continue?";
                    otp.widgets.Dialogs.showYesNoDialog(msg, "Continue?", function() {
                        this_.module.setRequestDate(this_.request, date);
                    });
                }
                else {
                    this_.module.setRequestDate(this_.request, date);
                }
            });
        });

        this.content.find('.changeGroupSizeLink').click(function(evt) {
            this_.showGroupSizeDialog();
        });

        this.content.find('.editTeacherNotesLink').click(function(evt) {
            this_.showTeacherNotesDialog();
        });

        this.content.find('.printablePlanLink').click(function(evt) {
            evt.preventDefault();
            var req = this_.request;
            var printWindow = window.open('','Group Plan','toolbar=yes, scrollbars=yes, height=500, width=800');
            var context = _.clone(req);
            var outboundItinIndex = 0; inboundItinIndex = 0;
            context["outboundItinIndex"] = function() {
                return outboundItinIndex++;
            };
            context["inboundItinIndex"] = function() {
                return inboundItinIndex++;
            };

            var outboundTrip = otp.util.FieldTrip.getOutboundTrip(req);
            var inboundTrip = otp.util.FieldTrip.getInboundTrip(req);
            if(outboundTrip) context.outboundItineraries = outboundTrip.groupItineraries;
            if(inboundTrip) context.inboundItineraries = inboundTrip.groupItineraries;

            // Populate number paid & free students
            if(!context.numFreeStudents) context.numFreeStudents = 0
            context.numPaidStudents = context.numStudents - context.numFreeStudents

            var content = ich['otp-fieldtrip-printablePlan'](context);

            // populate itin details
            if(outboundTrip) {
                var itins = outboundTrip.groupItineraries;
                for(var i = 0; i < itins.length; i++) {
                    var itinData = otp.util.FieldTrip.readItinData(itins[i]);
                    var itin = new otp.modules.planner.Itinerary(itinData, null);
                    if(req.classpassId) itin.fareDisplayOverride = '(Class Pass Hop Card # ' + req.classpassId + ')';
                    content.find('.outbound-itinBody-'+i).html(itin.getHtmlNarrative());
                }
            }

            if(inboundTrip) {
                var itins = inboundTrip.groupItineraries;
                for(var i = 0; i < itins.length; i++) {
                    var itinData = otp.util.FieldTrip.readItinData(itins[i]);
                    var itin = new otp.modules.planner.Itinerary(itinData, null);
                    if(req.classpassId) itin.fareDisplayOverride = '(Class Pass Hop Card # ' + req.classpassId + ')';
                    content.find('.inbound-itinBody-'+i).html(itin.getHtmlNarrative());
                }
            }

            var html = "";
            html += '<link rel="stylesheet" href="js/otp/modules/planner/planner-style.css" />';
            html += '<link rel="stylesheet" href="js/otp/modules/fieldtrip/fieldtrip-style.css" />';

            html += content.html();
            printWindow.document.write(html);
        });

        this.content.find('.cancelRequestButton').click(function(evt) {
            if(confirm("Are you sure you want to cancel this request? Any associated trips will be deleted.")) {
                this_.module.cancelRequest(this_.request);
                this_.hide();
            }
        });
        this.content.find('.setClasspassButton').click(function(evt) {
            var classpassId = prompt("Specify the Class Pass ID (to clear a previously set Class Pass, leave the field blank):");
            if(classpassId !== null) {
                this_.module.setClasspassId(this_.request, classpassId);
            }
        });
        this.content.find('.updatePaymentButton').click(function(evt) {
            this_.showUpdatePaymentDialog();
        });
        this.content.find('.addNoteButton').click(function(evt) {
            this_.showNoteDialog();
        });

        for(var i = 0; i < this.request.notes.length; i++) {
            //console.log("note "+this.request.notes[i].id);
            var note = this.request.notes[i];
            this.content.find(".deleteNoteButton-" + note.id).data("note", note).click(function() {
                var note = $(this).data("note");
                var msg = 'Are you sure you want to delete the note "' + note.note + '" from Field Trip Request #' + this_.request.id + '?';
                otp.widgets.Dialogs.showYesNoDialog(msg, 'Confirm Note Delete', function() {
                    this_.module.deleteNote(note);
                });
            });
        }

    },

    onClose : function() {
        delete this.module.requestWidgets[this.request.id];
    },

    tripPlanned : function() {
        $('#' + this.id + '-outboundSaveButton').removeAttr("disabled");
        $('#' + this.id + '-inboundSaveButton').removeAttr("disabled");
    },

    showNoteDialog : function() {
        var this_ = this;

        var dialog = ich['otp-fieldtrip-noteDialog']({
            message : "Note to be attached to this request:",
            showTypeSelection : true
        }).dialog({
            title : "Add Note",
            appendTo: 'body',
            modal: true,
            zIndex: 100000,
            height: 180
        });

        dialog.find(".okButton").button().click(function() {
            var text = dialog.find(".textarea").val();
            var type = dialog.find('input:radio[name=type]:checked').val();
            this_.module.addNote(this_.request, text, type);
            dialog.dialog("close");
        });

        dialog.find(".cancelButton").button().click(function() {
            dialog.dialog("close");
        });
    },

    showUpdatePaymentDialog : function() {
        var this_ = this;

        var dialog = ich['otp-fieldtrip-paymentDialog']({
            classpassId: this.request.classpassId,
            paymentPreference: this.request.paymentPreference,
            ccName: this.request.ccName,
            ccType: this.request.ccType,
            ccLastFour: this.request.ccLastFour,
            checkNumber: this.request.checkNumber,
        }).dialog({
            title : "Update Payment Info",
            appendTo: 'body',
            modal: true,
            zIndex: 100000,
            height: 400
        });

        dialog.find(".okButton").button().click(function() {
            this_.module.setPaymentInfo(this_.request,
              dialog.find(".classpassId").val(),
              dialog.find(".paymentPreference").val(),
              dialog.find(".ccType").val(),
              dialog.find(".ccName").val(),
              dialog.find(".ccLastFour").val(),
              dialog.find(".checkNumber").val()
            );

            dialog.dialog("close");
        });

        dialog.find(".cancelButton").button().click(function() {
            dialog.dialog("close");
        });
    },

    showTeacherNotesDialog : function() {
        var this_ = this;

        var dialog = ich['otp-fieldtrip-noteDialog']({
            message : "Teacher notes:",
            showTypeSelection : false,
            text : this_.request.submitterNotes
        }).dialog({
            title : "Edit Teacher Notes",
            appendTo: 'body',
            modal: true,
            zIndex: 100000,
            height: 180
        });

        dialog.find(".okButton").button().click(function() {
            var text = dialog.find(".textarea").val();
            this_.module.editTeacherNotes(this_.request, text);
            dialog.dialog("close");
        });

        dialog.find(".cancelButton").button().click(function() {
            dialog.dialog("close");
        });
    },

    showGroupSizeDialog : function() {
        var this_ = this;
        var dialog = ich['otp-fieldtrip-groupSizeDialog']({
            numPaidStudents : this_.request.numStudents - (this_.request.numFreeStudents || 0),
            numFreeStudents : this_.request.numFreeStudents || 0,
            numChaperones : this_.request.numChaperones
        }).dialog({
            title : "Edit Group Size",
            appendTo: 'body',
            modal: true,
            zIndex: 100000,
            height: 240
        });

        dialog.find(".okButton").button().click(function() {
            var numPaidStudents = parseInt(dialog.find(".numPaidStudents").val());
            numPaidStudents = isNaN(numPaidStudents) ? 0 : numPaidStudents

            var numFreeStudents = parseInt(dialog.find(".numFreeStudents").val());
            numFreeStudents = isNaN(numFreeStudents) ? 0 : numFreeStudents

            var numChaperones = parseInt(dialog.find(".numChaperones").val());
            numChaperones = isNaN(numChaperones) ? 0 : numChaperones

            this_.module.editGroupSize(this_.request, (numPaidStudents + numFreeStudents), numFreeStudents, numChaperones);
            dialog.dialog("close");
        });

        dialog.find(".cancelButton").button().click(function() {
            dialog.dialog("close");
        });
    },

    savingTrip : function(requestOrder) {
        console.log('saving ' + requestOrder);
        if(requestOrder === 0) this.content.find('.outboundPlanInfo').html('Saving...');
        if(requestOrder === 1) this.content.find('.inboundPlanInfo').html('Saving...');
    }

});
