/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.strategy.j;

public class Context {
   private Strategy strategy;
 
   public Context(Strategy strategy){
      this.strategy = strategy;
   }
 
   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
