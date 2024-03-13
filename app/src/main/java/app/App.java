package app;

import app.utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        var gun = new Handgun(7);
        gun.addAmmo(3);
        for (int i = 0; i < 5; i++) {
            gun.fire();
        }
        gun.addAmmo(8);
        for (int i = 0; i < 2; i++) {
            gun.fire();
        }
        gun.setAmmo(0);
        gun.fire();
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}