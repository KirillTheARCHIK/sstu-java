package app;

public class Employee {
  private String name;
  private Department department;

  public Employee(String name) {
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public String toString() {
    if (this == department.getChief()) {
      return String.format("%s начальник отдела %s.", getName(), department.getName());
    } else {
      return String.format("%s работает в отделе %s, начальник которого %s.", getName(), department.getName(),
          department.getChief().getName());
    }
  }
}
