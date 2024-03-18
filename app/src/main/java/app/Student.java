package app;

import java.util.*;

public class Student {
  private String name;
  private List<Integer> marks;

  public Student(String name) {
    this(name, new ArrayList<Integer>());
  }

  public Student(String name, List<Integer> marks) {
    setName(name);
    setMarks(marks);
  }

  @Override
  public String toString() {
    return getName() + " " + getMarks();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Integer> getMarks() {
    return List.copyOf(marks);
  }

  public void setMarks(List<Integer> marks) {
    var marksCopy = List.copyOf(marks);
    if (marksCopy.stream().anyMatch((Integer mark) -> mark < 2 || mark > 5)) {
      throw new IllegalArgumentException();
    }
    this.marks = marksCopy;
  }

  public double getAvgMark() {
    if (getMarks().size() == 0) {
      return 0;
    }
    int sum = 0;
    for (Integer integer : getMarks()) {
      sum += integer;
    }
    return (double) sum / getMarks().size();
  }

  public Boolean isOtl() {
    return getAvgMark() == 5;
  }
}
