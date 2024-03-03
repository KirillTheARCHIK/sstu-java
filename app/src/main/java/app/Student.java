package app;

import java.util.*;

public class Student {
  String name;
  List<Integer> marks;

  public Student(String name, List<Integer> marks) {
    this.name = name;
    this.marks = marks;
  }

  @Override
  public String toString() {
    return name + " " + marks;
  }
}
