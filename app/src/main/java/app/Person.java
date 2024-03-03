package app;

public class Person {
  Name name;
  int height;

  public Person(Name name, int height) {
    this.name = name;
    this.height = height;
  }

  @Override
  public String toString() {
    return name + ", рост: " + height;
  }
}
