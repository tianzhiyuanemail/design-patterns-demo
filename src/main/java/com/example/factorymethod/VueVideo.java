/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.factorymethod;

public class VueVideo implements IVideo {
    @Override
    public void getVideoName() {

        System.out.println("vue video");
    }
}
