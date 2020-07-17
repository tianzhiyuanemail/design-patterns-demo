/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.decorator;

public class RedDecaratoryShapeImpl extends AbstractDecaratoryShape {
    public RedDecaratoryShapeImpl(AbstractShape shape) {
        super(shape);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("红色的");
    }
}
