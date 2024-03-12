package app;

public class Line {
  private Point start;
  private Point end;

  public Line(Point start, Point end) throws Exception {
    setStart(start);
    setEnd(end);
  }

  public Line(int x1, int y1, int x2, int y2) throws Exception {
    this(new Point(x1, y1), new Point(x2, y2));
  }

  public Point getStart() {
    return start;
  }

  public void setStart(Point start) throws Exception {
    if (start.contains != this) {
      throw new Exception("Point already used");
    }
    this.start = start;
    start.contains = this;
  }

  public Point getEnd() {
    return end;
  }

  public void setEnd(Point end) throws Exception {
    if (end.contains != this) {
      throw new Exception("Point already used");
    }
    this.end = end;
    end.contains = this;
  }

  @Override
  public String toString() {
    return String.format("Линия от %s до %s", start, end);
  }

  public Double distance() {
    return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
  }
}
