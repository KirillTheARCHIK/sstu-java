package app;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        System.out.println(new Time(34056).getHours());
        System.out.println(new Time(4532).getMinutes());
        System.out.println(new Time(123).getSeconds());
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}