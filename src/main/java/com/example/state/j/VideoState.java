package com.example.state.j;

/***
 * 状态模式 状态类
 */
public abstract class VideoState {


    protected StateContext stateContext;


    public abstract void start();

    public abstract void speed();

    public abstract void stop();


    public void setStateContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }
}