/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.decorator;

/***
 * 长方形
 */
public class RectangleShape extends AbstractShape {
    @Override
    void draw() {
        System.out.println("画长方形形状");
    }
}
