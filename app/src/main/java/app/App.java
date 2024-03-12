package app;

import java.util.List;

import app.utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        var lev = new Person("Лев", 170);
        var sergey = new Person(new Name("Сергей", "Пушкин"), 168, lev);
        var alex = new Person("Александр", 167, sergey);
        var persons = List.of(
                lev,
                sergey,
                alex);
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}