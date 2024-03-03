package app;

import app.utils.Utils;
import java.util.*;;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        var marks = new ArrayList<Integer>(List.of(3, 4, 5));
        var vasya = new Student("Вася", marks);
        var petya = new Student("Петя", vasya.marks);
        System.out.println(vasya);
        System.out.println(petya);
        petya.marks.set(0, 5);
        System.out.println(vasya);
        System.out.println(petya);
        var andrey = new Student("Андрей", List.copyOf(marks));
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}