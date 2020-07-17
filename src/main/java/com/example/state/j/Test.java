package com.example.state.j;

public class Test {


    public static void main(String[] args) {

        StateContext stateContext = new StateContext();
        stateContext.setVideoState(StateContext.startState);

        stateContext.speed();

        stateContext.stop();
        stateContext.speed();




    }
}