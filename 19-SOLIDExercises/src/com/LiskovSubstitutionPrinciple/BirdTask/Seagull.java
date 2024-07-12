package com.LiskovSubstitutionPrinciple.BirdTask;

public class Seagull extends Bird implements Flyer{
    public Seagull(String name, double wingSpan) {
        super(name, wingSpan);
    }

    @Override
    public void fly() {
        System.out.println("My name is " + this.getName() + " and I can fly.");
    }
}
