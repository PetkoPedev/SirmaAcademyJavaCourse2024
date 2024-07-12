package com.LiskovSubstitutionPrinciple.EngineTask;

import java.util.Scanner;

public class RunEngineTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        switch (input){
            case "steam" -> {
                SteamEngine steamEngine = new SteamEngine();
                steamEngine.start();
            }
            case "petrol" -> {
                PetrolEngine petrolEngine = new PetrolEngine();
                petrolEngine.start();
            }
            case "electric" -> {
                ElectricEngine electricEngine = new ElectricEngine();
                electricEngine.start();
            }
            default -> System.out.println("Invalid input");
        }

        sc.close();
    }
}
