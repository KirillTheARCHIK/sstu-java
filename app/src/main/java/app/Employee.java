package app;

public class Employee {
  public String name;
  public Department department;

  public Employee(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    if (this == department.chief) {
      return String.format("%s начальник отдела %s.", name, department.name);
    } else {
      return String.format("%s работает в отделе %s, начальник которого %s.", name, department.name,
          department.chief.name);
    }
  }
}
