package com.bug.b;


import com.bug.ImmutableStyle;

import org.immutables.value.Value;

/**
 * @author One on 25.07.17.
 */
@ImmutableStyle
@Value.Immutable
public interface CustomErrorResponse {

    String getMessage();

    String getCause();

    String getReason();
}
