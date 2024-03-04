package app;

import java.util.*;

public class Student {
  String name;
  List<Integer> marks;

  public Student(String name) {
    this.name = name;
    this.marks = new ArrayList<Integer>();
  }

  public Student(String name, List<Integer> marks) {
    this.name = name;
    this.marks = marks;
  }

  @Override
  public String toString() {
    return name + " " + marks;
  }

  public double getAvgMark() {
    if (marks.size() == 0) {
      return 0;
    }
    int sum = 0;
    for (Integer integer : marks) {
      sum += integer;
    }
    return (double) sum / marks.size();
  }

  public Boolean isOtl() {
    return getAvgMark() == 5;
  }
}
