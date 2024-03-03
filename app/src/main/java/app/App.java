package app;

import java.util.List;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        for (Name name : List.of(
                new Name("Клеопатра"),
                new Name("Александр", "Пушкин", "Сергеевич"),
                new Name("Владимир", "Маяковский"),
                new Name("Христофор", "Бонифатьевич")

        )) {
            System.out.println(name);
        }
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}