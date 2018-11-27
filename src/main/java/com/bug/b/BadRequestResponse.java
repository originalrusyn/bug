package com.bug.b;


import com.bug.ImmutableStyle;
import com.google.common.collect.ImmutableMap;

import org.immutables.value.Value;

import javax.validation.constraints.NotNull;

/**
 * @author One on 17.05.17.
 */
@ImmutableStyle
@Value.Immutable
public interface BadRequestResponse {

    default @NotNull String getMessage() {
        return "Bad Request";
    }

    default @NotNull String getCause() {
        return "badRequest";
    }

    @NotNull ImmutableMap<String, String> getErrors();
}
