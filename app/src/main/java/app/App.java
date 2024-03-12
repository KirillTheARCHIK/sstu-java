package app;

import app.utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        var f1 = new Fraction(1, 3);
        var f2 = new Fraction(2, 4);
        System.out.println(f1 + " * " + f2 + " = " + f1.sum(f2));
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}