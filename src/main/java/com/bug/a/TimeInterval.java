package com.bug.a;

import static com.google.common.base.Preconditions.checkArgument;

import org.immutables.value.Value;

import java.time.Instant;

/**
 * @author One on 29.03.17.
 */
@Value.Style(allParameters = true, overshadowImplementation = true)
@Value.Immutable(builder = false, copy = false)
public interface TimeInterval {

    Instant getBegin();

    Instant getEnd();

    @Value.Check
    default void check() {
        checkArgument(getBegin().isBefore(getEnd()));
    }

}
