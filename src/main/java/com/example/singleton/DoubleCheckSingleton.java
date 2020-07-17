/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.singleton;

/***
 * 双重检测模式
 *
 * 1 volatile 此处保证内存可见性 指令冲排序
 * 2 synchronized 保证同一时间 只有一个线程访问
 * 3 第一个if doubleCheckSingleton == null 避免多线程下同时阻塞到 synchronized
 * 4 第二个if 主要避免多个线程同时拿到锁到情况下创建单一实例
 *
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getDoubleCheckSingleton(){
        if (doubleCheckSingleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }


}
