package com.bug.b;

import org.immutables.value.Value;

import java.io.Serializable;

/**
 * @author One on 30.06.17.
 */
@Value.Style(allParameters = true, overshadowImplementation = true)
@Value.Immutable(builder = false, copy = false)
public interface AuthToken extends Serializable {

    String getAccessToken();

}
