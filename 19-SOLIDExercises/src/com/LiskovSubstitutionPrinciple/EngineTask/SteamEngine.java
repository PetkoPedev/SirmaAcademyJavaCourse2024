package com.LiskovSubstitutionPrinciple.EngineTask;

public class SteamEngine implements Engine{
    @Override
    public void start() {
        System.out.println("The train is running.");
    }
}
