package app;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        var p = new Parrot("123456789");
        p.Sing();
        p.Sing();
        p.Sing();
        p.Sing();
        p.Sing();
        p.Sing();
        p.Sing();
        p.Sing();
        p.Sing();
        p.Sing();
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}