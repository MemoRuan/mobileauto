package com.annotation.values;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by AnsonLiao on 6/8/2016.
 */

@Target(ElementType.TYPE) @Retention(RetentionPolicy.RUNTIME) public @interface PageName {
    String value() default "";
}
