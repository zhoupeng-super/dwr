package org.directwebremoting.guice;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Marks classes to be Ajax-filtered by DWR.
 * @author Tim Peierls [tim at peierls dot net]
 */
@Retention(RUNTIME)
@Target({TYPE})
@BindingAnnotation
@interface Filtering
{
    String value();
    long id();
}
