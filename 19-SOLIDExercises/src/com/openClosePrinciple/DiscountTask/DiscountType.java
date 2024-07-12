package com.openClosePrinciple.DiscountTask;

public enum DiscountType {
    STUDENT(0.1),
    SENIOR(0.2),
    CHILD(0.5);

    DiscountType(double rate){
        this.rate = rate;
    }

    private double rate;

    public double getRate() {
        return this.rate;
    }
}
