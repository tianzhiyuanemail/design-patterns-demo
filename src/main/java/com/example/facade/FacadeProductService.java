/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.facade;

/***
 * 外观模式 facade （佛撒的）
 *
 *
 */
public class FacadeProductService {

    /**
     * 1 本例没有依赖spring 依赖spring后 可以用spring的依赖注入
     * 2 被依赖的service 一般为单例模式
     **/
    private YouHuiquanService youHuiquanService = new YouHuiquanService();

    private JinBiService jinBiService = new JinBiService();

    private FaHuoService faHuoService = new FaHuoService();


    /***
     * 提交订单
     */
    public void submitProduct(Product product) {
        youHuiquanService.jiaoyan(product);
        jinBiService.koujian(product);
        faHuoService.fahuo(product);
    }


}
