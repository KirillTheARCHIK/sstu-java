package app;

public class Person {
  Name name;
  int height;
  Person father;

  public Person(String firstName, int height) {
    this(new Name(firstName), height);
  }

  public Person(String firstName, int height, Person father) {
    this(new Name(firstName), height, father);
  }

  public Person(Name name, int height) {
    this(name, height, null);
  }

  public Person(Name name, int height, Person father) {
    this.name = name;
    this.height = height;
    if (father != null) {
      setFather(father);
    }
  }

  @Override
  public String toString() {
    return name + ", " + height;
  }

  Person getFather() {
    return father;
  }

  void setFather(Person father) {
    this.father = father;
    this.name = new Name(name.firstName, father.name.lastName != null ? father.name.lastName : name.lastName,
        father.name.firstName + "ович");
  }
}
