package com.InterfaceSegregationPrinciple.PrinterTask;

public class FaxMachine implements Fax{
    @Override
    public void fax() {
        System.out.println("Sending fax now.");
    }
}
