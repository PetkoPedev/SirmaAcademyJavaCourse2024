package com.LiskovSubstitutionPrinciple.EngineTask;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol engine is running.");
    }
}
