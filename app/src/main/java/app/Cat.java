package app;

public class Cat {
  String name;

  public Cat(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Кот: " + name;
  }

  void Miew() {
    Miew(1);
  }

  void Miew(int n) {
    String str = name + ": ";
    str += "мяу";
    for (int i = 0; i < n - 1; i++) {
      str += "-мяу";
    }
    str += "!";
    System.out.println(str);
  }
}
