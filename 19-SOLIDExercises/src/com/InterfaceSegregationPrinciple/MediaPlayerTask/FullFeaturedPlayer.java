package com.InterfaceSegregationPrinciple.MediaPlayerTask;

public class FullFeaturedPlayer implements AdvancedPlayer{
    @Override
    public void shuffle() {
        System.out.println("Shuffle Playlist");
    }

    @Override
    public void previous() {
        System.out.println("Previous song");
    }

    @Override
    public void next() {
        System.out.println("Next song");
    }

    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void pause() {
        System.out.println("Paused.");
    }
}
