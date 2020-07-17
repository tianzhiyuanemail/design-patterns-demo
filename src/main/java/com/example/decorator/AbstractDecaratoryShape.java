package com.example.decorator;/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */


import com.example.decorator.AbstractShape;

public abstract class AbstractDecaratoryShape extends AbstractShape {

    AbstractShape shape;

    public AbstractDecaratoryShape(AbstractShape shape) {
        this.shape = shape;
    }

    @Override
    void draw() {
        shape.draw();
    }
}
