package ru.konoplev.math;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Math {
  public static double sum(Number... numbers) {
    double S = 0;
    for (Number number : numbers) {
      S += number.doubleValue();
    }
    return S;
  }

  public static double myPow(String s1, String s2) {
    return pow(parseInt(s1), parseInt(s2));
  }
}
