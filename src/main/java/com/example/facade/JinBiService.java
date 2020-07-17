/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.facade;

/***
 * 金币扣减
 */
public class JinBiService {
    public void koujian(Product product){
        System.out.println(product.getName()+"金币成功");
    }
}
