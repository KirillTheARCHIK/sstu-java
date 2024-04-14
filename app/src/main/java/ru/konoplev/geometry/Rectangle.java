package ru.konoplev.geometry;

import java.util.*;;

public class Rectangle extends Figure implements Polylineable {
  private Point leftTopCorner;
  private int width;
  private int height;

  public Rectangle(Point leftTopCorner, int width, int height) {
    setLeftTopCorner(leftTopCorner);
    setWidth(width);
    setHeight(height);
  }

  public Rectangle(int x, int y, int width, int height) {
    this(new Point(x, y), width, height);
  }

  @Override
  public String toString() {
    return "Прямоугольник в точке " + leftTopCorner + " со сторонами " + width + " и " + height;
  }

  public PolyLine getPolyLine() {
    return new ClosedPolyLine(new ArrayList<>(List.of(
        leftTopCorner,
        new Point(leftTopCorner.x + width, leftTopCorner.y),
        new Point(leftTopCorner.x + width, leftTopCorner.y + height),
        new Point(leftTopCorner.x, leftTopCorner.y + height))));
  }

  public Point getLeftTopCorner() {
    return leftTopCorner;
  }

  public void setLeftTopCorner(Point leftTopCorner) {
    this.leftTopCorner = leftTopCorner;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    if (width <= 0) {
      throw new IllegalArgumentException();
    }
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    if (height <= 0) {
      throw new IllegalArgumentException();
    }
    this.height = height;
  }

  @Override
  double getSquare() {
    return width * height;
  }
}
