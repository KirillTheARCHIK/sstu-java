package ru.konoplev.study.markCheck;

public class SchoolMarkCheck implements MarkCheck {
  @Override
  public Boolean checkMark(int mark) {
    return mark >= 2 && mark <= 5;
  }
}
