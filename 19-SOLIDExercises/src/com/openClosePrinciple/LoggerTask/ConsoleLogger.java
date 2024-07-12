package com.openClosePrinciple.LoggerTask;

public class ConsoleLogger implements LogInterface {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

