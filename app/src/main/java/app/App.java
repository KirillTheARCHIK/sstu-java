package app;

import java.util.List;

import app.utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        A.cityLinks.add(new CityLink(F, 1));
        A.cityLinks.add(new CityLink(B, 5));
        A.cityLinks.add(new CityLink(D, 6));

        B.cityLinks.add(new CityLink(A, 5));
        B.cityLinks.add(new CityLink(C, 3));

        C.cityLinks.add(new CityLink(B, 3));
        C.cityLinks.add(new CityLink(D, 4));

        D.cityLinks.add(new CityLink(C, 4));
        D.cityLinks.add(new CityLink(E, 2));
        D.cityLinks.add(new CityLink(A, 6));

        E.cityLinks.add(new CityLink(F, 2));

        F.cityLinks.add(new CityLink(B, 1));
        F.cityLinks.add(new CityLink(E, 2));

        for (City city : List.of(A, B, C, D, E, F)) {
            System.out.println(city);
        }

        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}