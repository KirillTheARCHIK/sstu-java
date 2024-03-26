package app;

public class Point2D extends Point {
  private int x;
  private int y;

  public Point2D(int x, int y) {
    setX(x);
    setY(y);
  }

  public int getX() {
    return x;
  }

  void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("{%d;%d}", x, y);
  }

  public double distanceTo(Point2D other) {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }
}
