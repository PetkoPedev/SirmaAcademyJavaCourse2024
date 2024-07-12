package com.InterfaceSegregationPrinciple.PrinterTask;

public class A3Scanner implements Scanner{
    @Override
    public void scan() {
        System.out.println("Scanning");
    }
}
