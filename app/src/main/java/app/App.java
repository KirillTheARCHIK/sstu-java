package app;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        System.out.println(String.format("%d seconds => %s", 10, new Time(10)));
        System.out.println(String.format("%d seconds => %s", 10000, new Time(10000)));
        System.out.println(String.format("%d seconds => %s", 100000, new Time(100000)));
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}