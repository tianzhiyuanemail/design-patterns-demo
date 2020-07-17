/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.abscrterfactory;


public class JavaCourseFactory implements ICourseFactory {
    @Override
    public IVideo getVideo() {
        return new JavaVideo();
    }

    @Override
    public ISourceCode getSourceCode() {
        return new JavaSourceCode();
    }
}
