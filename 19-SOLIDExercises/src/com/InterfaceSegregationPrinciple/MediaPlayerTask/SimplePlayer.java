package com.InterfaceSegregationPrinciple.MediaPlayerTask;

public class SimplePlayer implements BasicPlayer {

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void pause() {
        System.out.println("Paused.");
    }
}
