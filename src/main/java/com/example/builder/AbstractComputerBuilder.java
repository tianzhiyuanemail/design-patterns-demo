/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.builder;

public abstract class AbstractComputerBuilder {

    public abstract void setMonitor(String monitor) ;

    public abstract void setCpu(String cpu) ;

    public abstract Computer build();

}
