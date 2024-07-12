package com.openClosePrinciple.LoggerTask;

public class RunLoggerTask {
    public static void main(String[] args) {
//        ConsoleLogger logger = new ConsoleLogger();

        FileLogger logger = new FileLogger("test.txt");
        logger.log("Hello");
    }
}
