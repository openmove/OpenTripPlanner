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

import java.net.URLEncoder;

/**
 * Data structure for requesting an Uber access token.
 */
public class UberAuthenticationRequestBody {

    public String clientId;
    public String clientSecret;
    public String grant_type;
    public String scope;

    public UberAuthenticationRequestBody(String clientId, String clientSecret, String grant_type, String scope) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.grant_type = grant_type;
        this.scope = scope;
    }

    /**
     * Converts this object to application/x-www-form-urlencoded format ("name1=value1&name2=value2" encoded).
     */
    public String toFormUrlEncoded() {
        return URLEncoder.encode(String.format(
            "client_id:%s&client_secret:%s&grant_type:%s&scope:%s",
            clientId,
            clientSecret,
            grant_type,
            scope
        ));
    }
}
