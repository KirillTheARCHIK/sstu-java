package app;

public class House {
  int floors;

  public House(int floors) {
    this.floors = floors;
  }

  @Override
  public String toString() {
    var str = "Дом с " + floors + " этаж";
    if (floors > 1) {
      str += "ами";
    } else {
      str += "ом";
    }
    return str;
  }
}
