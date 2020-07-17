/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.factorymethod;

public class JavaVideoFactory implements IVideoFactory {
    @Override
    public IVideo getVideo() {
        return new JavaVideo();
    }
}
