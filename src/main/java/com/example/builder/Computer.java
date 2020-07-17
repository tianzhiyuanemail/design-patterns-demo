/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.builder;

/***
 * 产品类 电脑
 *
 */
public class Computer {

    /**显示器*/
    private String monitor;

    /**cpu*/
    private String cpu;


    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Cpmputer{" +
                "monitor='" + monitor + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
