/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.singleton;

/***
 * 懒汉模式
 *
 * 1 volatile 此处保证内存可见性
 * 2 synchronized 保证同一时间 只有一个线程访问 getLazySingleton() 方法
 *
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    private LazySingleton(){};

    public static synchronized LazySingleton getLazySingleton(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
