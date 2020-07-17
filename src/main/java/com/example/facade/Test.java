/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.facade;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("水杯");

        FacadeProductService facadeProductService = new FacadeProductService();
        facadeProductService.submitProduct(product);
    }
}
