package com.example.state.j;

public class SpeedState extends VideoState {
    @Override
    public void start() {
        System.out.println("已经在快进类 无需播放");
    }

    @Override
    public void speed() {
        System.out.println("speed");

    }

    @Override
    public void stop() {
        System.out.println("stop");
        super.stateContext.setVideoState(StateContext.stopState);

    }
}