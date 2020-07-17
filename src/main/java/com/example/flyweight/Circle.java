/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.flyweight;

public class Circle implements Shape {
   private String color;

   public Circle(String color){
      this.color = color;     
   }

   @Override
   public void draw() {
      System.out.println("Circle: Draw() [Color : " + color);
   }
}