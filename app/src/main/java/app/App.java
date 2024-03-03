package app;

import java.util.List;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        List<House> houses = List.of(
                new House(2),
                new House(35),
                new House(91));
        for (House house : houses) {
            System.out.println(house);
        }
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}