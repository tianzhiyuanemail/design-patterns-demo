/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.staticfactory;

public class SimpleFactory {


    /** if else 实现 */
    public static IVideo getVideo(String name){
        IVideo iVideo = null;
        if ("java".equalsIgnoreCase(name)){
            iVideo= new JavaVideo();
        }else if ("vue".equalsIgnoreCase(name)){
            iVideo= new  VueVideo();
        }
        return iVideo;
    }

    /**  反射 实现 */
    public static IVideo getVideo(Class c){
        IVideo iVideo = null;

        try {
            iVideo = (IVideo) c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return iVideo;
    }



}
