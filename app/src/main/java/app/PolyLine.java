package app;

import java.util.*;

public class PolyLine {
  ArrayList<Point> points;

  public PolyLine() {
    this.points = new ArrayList<Point>();
  }

  public PolyLine(ArrayList<Point> points) {
    this.points = points;
  }

  @Override
  public String toString() {
    return String.format("Линия ", points);
  }
}
