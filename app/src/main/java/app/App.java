package app;

import app.utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        Line l1 = new Line(1, 1, 10, 15);
        System.out.println(l1.distance());
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}