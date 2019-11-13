package com.system.util;


import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Documented
@Inherited
@Target({PARAMETER, METHOD})
@Retention(RUNTIME)
public @interface PageSize50 {

    public String operationPageSize() default "50";
}
