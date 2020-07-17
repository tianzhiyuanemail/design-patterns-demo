/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.facade;

/***
 * 物流发货
 */
public class FaHuoService {
    public void fahuo(Product product){
        System.out.println(product.getName()+"发货成功");
    }
}
