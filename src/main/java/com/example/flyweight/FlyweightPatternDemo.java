/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.flyweight;

public class FlyweightPatternDemo {
   private static final String colors[] = 
      { "Red", "Green", "Blue", "White", "Black" };
   public static void main(String[] args) {
 
      for(int i=0; i < 20; ++i) {
         Shape circle =  ShapeFactory.getCircle(getRandomColor());
         circle.draw();
      }
   }
   private static String getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }
}