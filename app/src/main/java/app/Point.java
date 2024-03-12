package app;

public class Point {
  public final int x;
  public final int y;

  Line contains;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("{%d;%d}", x, y);
  }
}
