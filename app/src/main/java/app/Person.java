package app;

public class Person {
  Name name;
  int height;
  Person father;

  public Person(Name name, int height) {
    this.name = name;
    this.height = height;
  }

  @Override
  public String toString() {
    return name + ", рост: " + height;
  }

  Person getFather() {
    return father;
  }

  void setFather(Person father) {
    this.father = father;
    this.name = new Name(name.firstName, father.name.lastName, father.name.firstName + "ович");
  }
}
