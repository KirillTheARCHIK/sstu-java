package app;

import java.util.*;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        PolyLine l1 = new PolyLine(new ArrayList<>(List.of(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3))));
        PolyLine l2 = new PolyLine(new ArrayList<>(List.of(
                l1.points.get(0),
                new Point(2, -5),
                new Point(4, -8),
                l1.points.get(2))));
        l1.points.get(0).x = 0;
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}