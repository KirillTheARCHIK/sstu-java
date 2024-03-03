package app;

public class House {
  final int floors;

  public House(int floors) {
    this.floors = floors;
  }

  @Override
  public String toString() {
    var str = "Дом с " + floors + " этаж";
    if (floors != 11 && floors % 10 == 1) {
      str += "ом";
    } else {
      str += "ами";
    }
    return str;
  }
}
