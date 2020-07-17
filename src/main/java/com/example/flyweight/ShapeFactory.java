/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        // todo  是否线程安全
        if (circle == null) {
            synchronized (color) {
                if (circle == null) {
                    circle = new Circle(color);
                    circleMap.put(color, circle);
                    System.out.println("Creating circle of color : " + color);
                }
            }
        }
        return circle;
    }
}