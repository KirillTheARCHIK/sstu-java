package app;

import java.util.ArrayList;
import java.util.List;

public class Department {
  String name;
  Employee chief;
  ArrayList<Employee> employees;

  public Department(String name, Employee chief, List<Employee> otherEmployees) {
    this.name = name;
    this.chief = chief;

    employees = new ArrayList<>();
    employees.add(chief);
    employees.addAll(otherEmployees);
    for (int index = 0; index < employees.size(); index++) {
      var employee = employees.get(index);
      employee.department = this;
    }
  }
}
