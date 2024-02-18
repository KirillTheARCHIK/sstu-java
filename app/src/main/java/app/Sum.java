package app;

import app.utils.Utils;

public class Sum {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        int S = 0;
        for (String arg : args) {
            S += Integer.parseInt(arg);
        }
        System.out.println("Sum = " + S);
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}