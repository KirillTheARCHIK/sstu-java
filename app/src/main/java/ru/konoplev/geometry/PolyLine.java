package ru.konoplev.geometry;

import java.util.*;

public class PolyLine implements Polylineable {
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

  public double getLength() {
    double S = 0;
    for (int i = 0; i < points.size() - 1; i++) {
      S += points.get(i).distanceTo(points.get(i + 1));
    }
    return S;
  }

  @Override
  public PolyLine getPolyLine() {
    return this;
  }
}
