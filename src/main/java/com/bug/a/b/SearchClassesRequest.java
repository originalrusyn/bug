package com.bug.a.b;

import static org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;
import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME;

import com.bug.a.DateTimeRangeBasedRequest;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.ZonedDateTime;

import javax.validation.constraints.NotNull;

/**
 * @author One on 24.04.17.
 */
public class SearchClassesRequest implements DateTimeRangeBasedRequest {

    /**
     * Defines start of the timerange for Class search
     */
    @NotNull
    @DateTimeFormat(iso = DATE_TIME)
    private ZonedDateTime startDateTime;

    /**
     * Defines end of the timerange for Class search
     */
    @NotNull
    @DateTimeFormat(iso = DATE_TIME)
    private ZonedDateTime endDateTime;

    @SuppressWarnings("NullAway.Init")
    private SearchClassesRequest() {

    }

    @Override public ZonedDateTime getStartDateTime() {
        return startDateTime;
    }

    @Override public ZonedDateTime getEndDateTime() {
        return endDateTime;
    }


    @Override public String toString() {
        return new ToStringBuilder(this, MULTI_LINE_STYLE).appendSuper(super.toString())
            .append("startDateTime", startDateTime)
            .append("endDateTime", endDateTime)
            .toString();
    }
}
