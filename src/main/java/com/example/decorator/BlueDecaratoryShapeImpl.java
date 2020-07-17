package com.example.decorator;/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */

import com.example.decorator.AbstractDecaratoryShape;
import com.example.decorator.AbstractShape;

public class BlueDecaratoryShapeImpl extends AbstractDecaratoryShape {
    public BlueDecaratoryShapeImpl(AbstractShape shape) {
        super(shape);
    }

    @Override
    void draw() {
        super.draw();
        System.out.println("绿色的");
    }
}
