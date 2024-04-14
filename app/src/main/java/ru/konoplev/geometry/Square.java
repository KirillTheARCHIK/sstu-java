package ru.konoplev.geometry;

public class Square extends Rectangle {
  public Square(Point leftTopCorner, int size) {
    super(leftTopCorner, size, size);
  }

  public Square(int x, int y, int size) {
    this(new Point(x, y), size);
  }
}
