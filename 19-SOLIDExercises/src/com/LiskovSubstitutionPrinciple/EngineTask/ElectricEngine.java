package com.LiskovSubstitutionPrinciple.EngineTask;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine is running.");
    }
}
