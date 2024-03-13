package app;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private String name;
  private Employee chief;
  private List<Employee> employees;

  public Department(String name, Employee chief, List<Employee> otherEmployees) {
    setName(name);
    setChief(chief);

    var employees = new ArrayList<Employee>();
    employees.addAll(otherEmployees);
    for (int index = 0; index < employees.size(); index++) {
      var employee = employees.get(index);
      employee.setDepartment(this);
    }
    setEmployees(employees);
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

  public List<Employee> getEmployees() {
    return List.copyOf(employees);
  }

  public void setEmployees(ArrayList<Employee> employees) {
    this.employees = List.copyOf(employees);
  }
}
