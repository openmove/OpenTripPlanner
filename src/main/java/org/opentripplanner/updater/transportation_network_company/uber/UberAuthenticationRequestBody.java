/* This program is free software: you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public License
as published by the Free Software Foundation, either version 3 of
the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.updater.transportation_network_company.uber;

/**
 * Data structure for requesting an Uber access token.
 */
public class UberAuthenticationRequestBody {

    public final String clientId;
    public final String clientSecret;
    public final String grantType;
    public final String scope;

    public UberAuthenticationRequestBody(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        // Defaults needed for price/time estimates.
        this.grantType = "client_credentials";
        this.scope = "ride_request.estimate";
    }

    /**
     * Converts this object to application/x-www-form-urlencoded format ("name1=value1&name2=value2").
     * (There should be no need to url-encode as there are no special characters in the values passed.)
     */
    public String toRequestParamString() {
        return String.format(
            "client_id=%s&client_secret=%s&grant_type=%s&scope=%s",
            clientId,
            clientSecret,
            grantType,
            scope
        );
    }
}
