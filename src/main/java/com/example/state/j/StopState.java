package com.example.state.j;

public class StopState extends VideoState {
    @Override
    public void start() {
        System.out.println("start");
        super.stateContext.setVideoState(StateContext.startState);

    }

    @Override
    public void speed() {
        System.out.println("停止中 不能快进");

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }
}