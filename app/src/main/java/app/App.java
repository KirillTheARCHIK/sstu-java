package app;

import java.util.List;

import app.utils.Utils;

public class App {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        var petrov = new Employee("Петров");
        Department department = new Department("IT", new Employee("Козлов"), List.of(
                petrov,
                new Employee("Сидоров")));
        for (Employee employee : petrov.getDepartment().getEmployees()) {
            System.out.println(employee);
        }
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}