package app;

public class Point {
  public int x;
  public int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("{%d;%d}", x, y);
  }

  public double distanceTo(Point other) {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }
}
