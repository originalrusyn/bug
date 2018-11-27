package com.bug.a;

import java.time.ZonedDateTime;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/**
 * @author One on 06.01.18.
 */
public interface DateTimeRangeBasedRequest {

    @GroupSequence({Default.class, DateTimeRangeBasedRequest.class})
    interface ValidationSequence {
    }

    ZonedDateTime getStartDateTime();

    ZonedDateTime getEndDateTime();
}
