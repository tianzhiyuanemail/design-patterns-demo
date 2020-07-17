/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.builder;

public class ComputerBuilderXW extends AbstractComputerBuilder {

    Computer computer = new Computer();

    @Override
    public void setMonitor(String monitor) {
        computer.setMonitor(monitor);
    }

    @Override
    public void setCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
