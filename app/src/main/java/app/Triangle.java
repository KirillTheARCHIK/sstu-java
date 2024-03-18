package app;

public class Triangle extends Figure {
  private Point p1;
  private Point p2;
  private Point p3;

  public Triangle(Point p1, Point p2, Point p3) {
    setP1(p1);
    setP2(p2);
    setP3(p3);
  }

  public Point getP1() {
    return p1;
  }

  public void setP1(Point p1) {
    this.p1 = p1;
  }

  public Point getP2() {
    return p2;
  }

  public void setP2(Point p2) {
    this.p2 = p2;
  }

  public Point getP3() {
    return p3;
  }

  public void setP3(Point p3) {
    this.p3 = p3;
  }

  @Override
  double getSquare() {
    double a = p1.distanceTo(p2);
    double b = p2.distanceTo(p3);
    double c = p3.distanceTo(p1);
    double p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}
