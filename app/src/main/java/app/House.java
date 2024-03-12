package app;

public class House {
  int floors;

  public House(int floors) throws Exception {
    setFloors(floors);
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

  public int getFloors() {
    return floors;
  }

  public void setFloors(int floors) throws Exception {
    if (floors < 1) {
      throw new Exception();
    }
    this.floors = floors;
  }
}
