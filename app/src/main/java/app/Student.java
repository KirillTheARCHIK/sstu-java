package app;

import java.util.*;

public class Student {
  String name;
  List<Integer> marks;

  public Student(String name) {
    setName(name);
    // setMarks(new ArrayList<Integer>());
  }

  public Student(String name, List<Integer> marks) {
    setName(name);
    // setMarks(marks);
  }

  @Override
  public String toString() {
    return name + " " + marks;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Integer> getMarks() {
    return marks;
  }

  // public void setMarks(List<Integer> marks) {
  // if (marks.stream().anyMatch((int mark){return mark<2 || mark>5})) {
  // throw new Exception();
  // }
  // this.marks = marks;
  // }

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
