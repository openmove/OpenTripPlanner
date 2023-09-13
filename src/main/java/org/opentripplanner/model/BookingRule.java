/* This file is based on code copied from project OneBusAway, see the LICENSE file for further information. */
package org.opentripplanner.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public final class BookingRule extends IdentityBean<FeedScopedId> {

    private static final long serialVersionUID = 1L;

    private static final int MISSING_VALUE = -999;

    private FeedScopedId id;

    private int type;

    private String infoUrl;
    private String url;
    private String message;
    private String phoneNumber;

    
    public BookingRule() {

    }

    public BookingRule(BookingRule obj) {
        this.id = obj.id;
        this.type = obj.type;
        this.infoUrl = obj.infoUrl;
        this.phoneNumber = obj.phoneNumber;
        this.url = obj.url;
        this.message = obj.message;
        
    }

    public FeedScopedId getId() {
        return id;
    }

    public void setId(FeedScopedId id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
      }

      public void setMessage(String message) {
        this.message = message;
      }

      public String getPhoneNumber() {
        return phoneNumber;
      }

      public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
      }

      public String getInfoUrl() {
        return infoUrl;
      }

      public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
      }

      public String getUrl() {
        return url;
      }

      public void setUrl(String url) {
        this.url = url;
      }

      @Override
      public String toString() {
        return "<BookingRule " + this.id + ">";
      }
}
