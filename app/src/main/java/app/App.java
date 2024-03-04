package app;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        var gun = new Gun(3);
        for (int i = 0; i < 5; i++) {
            gun.Fire();
        }
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}