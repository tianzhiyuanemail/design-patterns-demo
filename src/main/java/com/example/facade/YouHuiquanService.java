/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.facade;

/***
 * 校验优惠券
 */
public class YouHuiquanService {
    public void jiaoyan(Product product){
        System.out.println(product.getName()+"优惠券校验成功");
    }
}
