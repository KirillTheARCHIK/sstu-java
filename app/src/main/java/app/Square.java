package app;

import java.util.*;;

public class Square extends Figure {
  Point leftTopCorner;
  int size;

  public Square(Point leftTopCorner, int size) throws Exception {
    setLeftTopCorner(leftTopCorner);
    setSize(size);
  }

  public Square(int x, int y, int size) throws Exception {
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

  public Point getLeftTopCorner() {
    return leftTopCorner;
  }

  public void setLeftTopCorner(Point leftTopCorner) {
    this.leftTopCorner = leftTopCorner;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) throws Exception {
    if (size <= 0) {
      throw new Exception();
    }
    this.size = size;
  }
}
