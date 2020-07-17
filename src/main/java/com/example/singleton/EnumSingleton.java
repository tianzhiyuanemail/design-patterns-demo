/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.singleton;


/***
 * 枚举模式 实现单例
 *
 * 1 可以防止序列化创建多个实例
 * 2 可以防止反射创建多个实例
 *
 */
public enum  EnumSingleton {

    INSTANCE( );
    private S instance;

    EnumSingleton() {
        instance = new S();
    }

    public S getInstance() {
        return instance;
    }
}

class S{

}