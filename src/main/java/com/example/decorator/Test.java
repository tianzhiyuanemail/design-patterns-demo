/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.decorator;

public class Test {

    public static void main(String[] args) {
        AbstractShape shape = new CircleShape();
        shape.draw();
        System.out.println();

        shape= new RedDecaratoryShapeImpl(shape);
        shape.draw();
        System.out.println();

        shape = new BlueDecaratoryShapeImpl(shape);
        shape.draw();
        System.out.println();
    }
}
