package ru.konoplev.geometry;

public class Circle extends Figure {
  private Point center;
  private double radius;

  public Circle(Point center, double radius) {
    setCenter(center);
    setRadius(radius);
  }

  public Point getCenter() {
    return center;
  }

  void setCenter(Point center) {
    this.center = center;
  }

  public double getRadius() {
    return radius;
  }

  void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  double getSquare() {
    return Math.PI * radius * radius;
  }
}
