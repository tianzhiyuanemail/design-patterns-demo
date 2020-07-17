package com.example.state.j;

public class StartState extends VideoState {
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void speed() {
        System.out.println("speed");
        super.stateContext.setVideoState(StateContext.speedState);
    }

    @Override
    public void stop() {
        System.out.println("stop");
        super.stateContext.setVideoState(StateContext.stopState);

    }
}