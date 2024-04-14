package ru.konoplev.geometry;

import java.util.ArrayList;

public class ClosedPolyLine extends PolyLine {
  public ClosedPolyLine() {
    super();
  }

  public ClosedPolyLine(ArrayList<Point> points) {
    super(points);
  }

  @Override
  public double getLength() {
    return super.getLength() + points.get(0).distanceTo(points.get(points.size() - 1));
  }
}