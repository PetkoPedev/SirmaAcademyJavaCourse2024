package com.LiskovSubstitutionPrinciple.BirdTask;

public class Penguin extends Bird implements Walker{
    public Penguin(String name, double wingSpan) {
        super(name, wingSpan);
    }

    @Override
    public void walk() {
        System.out.println("I am " + this.getName() + " and I can walk.");
    }
}
