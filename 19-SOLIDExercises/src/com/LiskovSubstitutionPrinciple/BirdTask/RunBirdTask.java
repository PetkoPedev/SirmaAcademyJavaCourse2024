package com.LiskovSubstitutionPrinciple.BirdTask;

import java.util.Scanner;

public class RunBirdTask {
    public static void main(String[] args) {
        Seagull seagull = new Seagull("Seamonster", 20);

        seagull.fly();
    }
}
