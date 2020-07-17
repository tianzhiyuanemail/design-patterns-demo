/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.abscrterfactory;


public class VueCourseFactory implements ICourseFactory {
    @Override
    public IVideo getVideo() {
        return new VueVideo();
    }

    @Override
    public ISourceCode getSourceCode() {
        return new VueSourceCode();
    }
}
