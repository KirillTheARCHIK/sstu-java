package app;

import java.util.List;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        var persons = List.of(
                new Person(new Name("Иван", "Чудов", null), 180),
                new Person(new Name("Петр", "Чудов", null), 179),
                new Person(new Name("Борис", null, null), 181));
        persons.get(1).setFather(persons.get(0));
        persons.get(2).setFather(persons.get(1));
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}