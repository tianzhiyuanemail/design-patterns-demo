package com.example.state.s;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StateController {

    @Resource
    private StateService stateService;

    @RequestMapping("/state/zhifu")
    public StateEnum zhifu(){
        return stateService.payOrder("");
    }

}