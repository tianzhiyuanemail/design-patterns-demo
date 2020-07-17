/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.abscrterfactory;


/***
 * 工厂接口 课程 包含视频课程与源码课程
 */
public interface ICourseFactory {
    public IVideo getVideo();
    public ISourceCode getSourceCode();
}
