package com.InterfaceSegregationPrinciple.PrinterTask;

public class InkjetPrinter implements Printer{

    @Override
    public void print() {
        System.out.println("Printing with ink.");
    }
}
