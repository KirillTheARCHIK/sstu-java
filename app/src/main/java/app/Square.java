package app;

import java.util.*;;

public class Square {
  Point leftTopCorner;
  int size;

  public Square(Point leftTopCorner, int size) {
    this.leftTopCorner = leftTopCorner;
    this.size = size;
  }

  public Square(int x, int y, int size) {
    this(new Point(x, y), size);
  }

  @Override
  public String toString() {
    return "Квадрат в точке " + leftTopCorner + " со стороной " + size;
  }

  public PolyLine getPolyLine() {
    return new PolyLine(new ArrayList<>(List.of(
        leftTopCorner,
        new Point(leftTopCorner.x + size, leftTopCorner.y),
        new Point(leftTopCorner.x + size, leftTopCorner.y + size),
        new Point(leftTopCorner.x, leftTopCorner.y + size))));
  }
}
