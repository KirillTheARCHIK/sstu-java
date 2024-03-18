package app;

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

  public void setCenter(Point center) {
    this.center = center;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  double getSquare() {
    return Math.PI * radius * radius;
  }
}
