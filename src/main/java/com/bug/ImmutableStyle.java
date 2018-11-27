package com.bug;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author One on 2018-10-20.
 */
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Value.Style(
    defaults = @Value.Immutable(copy = false),
    strictBuilder = true,
    overshadowImplementation = true,
    implementationNestedInBuilder = true
)
public @interface ImmutableStyle {
}