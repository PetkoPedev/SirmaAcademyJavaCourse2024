package com.LiskovSubstitutionPrinciple.BirdTask;

public class Bird {
    private String name;
    private double wingSpan;

    public Bird(String name, double wingSpan) {
        this.name = name;
        this.wingSpan = wingSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
