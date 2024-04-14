package ru.konoplev.study;

import java.util.*;

import ru.konoplev.study.markCheck.DefaultMarkCheck;
import ru.konoplev.study.markCheck.MarkCheck;

public class Student {
  String name;
  List<Integer> marks;
  MarkCheck markCheck;

  public Student(String name) {
    this(name, new DefaultMarkCheck());
  }

  public Student(String name, MarkCheck markCheck) {
    this(name, markCheck, new ArrayList<>());
  }

  public Student(String name, MarkCheck markCheck, List<Integer> marks) {
    setName(name);
    setMarkCheck(markCheck);
    for (Integer mark : marks) {
      addMark(mark);
    }
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

  public MarkCheck getMarkCheck() {
    return markCheck;
  }

  void setMarkCheck(MarkCheck markCheck) {
    this.markCheck = markCheck;
  }

  public List<Integer> getMarks() {
    return marks;
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

  public void addMark(int mark) {
    if (!markCheck.checkMark(mark)) {
      throw new IllegalArgumentException();
    }
    marks.add(mark);
  }

  public Boolean isOtl() {
    return getAvgMark() == 5;
  }
}
