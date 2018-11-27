package com.bug.b;

import java.io.Serializable;

/**
 * @author One on 03.07.17.
 */
public interface AuthTokenInfo extends Serializable {

    AuthToken getAuthToken();

}
