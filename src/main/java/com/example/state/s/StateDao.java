package com.example.state.s;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * 从db中查询 状态
 */
@Component
public class StateDao {

    /***
     * 获取随机的状态
     * @return
     */
    public StateEnum get() {
        StateEnum[] values = StateEnum.values();
        List<StateEnum> list = Arrays.asList(values);
        Collections.shuffle(list);

        StateEnum stateEnum = list.get(0);
        return stateEnum;
    }


    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            StateEnum[] values = StateEnum.values();
            List<StateEnum> list = Arrays.asList(values);
            Collections.shuffle(list);

            StateEnum stateEnum = list.get(0);
            System.out.println(stateEnum.getDesc());
        }

    }



}