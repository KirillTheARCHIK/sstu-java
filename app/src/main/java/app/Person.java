package app;

public class Person {
  Name name;
  int height;
  Person father;

  public Person(String firstName, int height) throws Exception {
    this(new Name(firstName), height);
  }

  public Person(String firstName, int height, Person father) throws Exception {
    this(new Name(firstName), height, father);
  }

  public Person(Name name, int height) throws Exception {
    this(name, height, null);
  }

  public Person(Name name, int height, Person father) throws Exception {
    setName(name);
    setHeight(height);
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

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) throws Exception {
    if (height <= 0 || height >= 500) {
      throw new Exception();
    }
    this.height = height;
  }

  public Name getName() {
    return name;
  }

  void setName(Name name) {
    this.name = name;
  }
}
