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

        A.addCityLink(new CityLink(F, 1));
        A.addCityLink(new CityLink(B, 5));
        A.addCityLink(new CityLink(D, 6));

        B.addCityLink(new CityLink(A, 5));
        B.addCityLink(new CityLink(C, 3));

        C.addCityLink(new CityLink(B, 3));
        C.addCityLink(new CityLink(D, 4));

        D.addCityLink(new CityLink(C, 4));
        D.addCityLink(new CityLink(E, 2));
        D.addCityLink(new CityLink(A, 6));

        E.addCityLink(new CityLink(F, 2));

        F.addCityLink(new CityLink(B, 1));
        F.addCityLink(new CityLink(E, 2));

        for (City city : List.of(A, B, C, D, E, F)) {
            System.out.println(city);
        }

        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}