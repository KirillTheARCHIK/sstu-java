package app;

import java.util.ArrayList;
import java.util.List;

public class Department {
  String name;
  Employee chief;
  ArrayList<Employee> employees;

  public Department(String name, Employee chief, List<Employee> otherEmployees) {
    employees = new ArrayList<>();

    this.name = name;
    setChief(chief);

    employees.addAll(otherEmployees);
    for (int index = 0; index < employees.size(); index++) {
      var employee = employees.get(index);
      employee.department = this;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee getChief() {
    return chief;
  }

  public void setChief(Employee chief) {
    this.chief = chief;
    if (!employees.contains(chief)) {
      employees.add(chief);
    }
  }

  public ArrayList<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(ArrayList<Employee> employees) {
    this.employees = employees;
  }
}
