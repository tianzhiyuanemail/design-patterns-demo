package com.example.state.j;


/***
 * 状态模式 实际上对外使用的是这个类 状态上下文
 *
 * 他可以更改状态对象 （通过状态对象 对上下文的循环依赖 改变上下文中的状态）
 *
 */
public class StateContext {


    private VideoState videoState;

    public static VideoState startState = new StartState();
    public static VideoState speedState = new SpeedState();
    public static VideoState stopState = new StopState();

    public   void start(){
        videoState.start();
    };

    public   void speed(){
        videoState.speed();
    };

    public   void stop(){
        videoState.stop();
    };

    public VideoState getVideoState() {
        return videoState;
    }

    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        // 循环依赖
        this.videoState.setStateContext(this);
    }
}