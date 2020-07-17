/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.state.s;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface OrderStateAnnotation {
    StateEnum stateEnum();
}