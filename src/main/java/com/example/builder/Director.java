/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.builder;

public class Director {
   private AbstractComputerBuilder a;

    public void setA(AbstractComputerBuilder a) {
        this.a = a;
    }

    public Computer create(){
        a.setCpu("cpu");
        a.setMonitor("显示器");
        return a.build();

    }

}
