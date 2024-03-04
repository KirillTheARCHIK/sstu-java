package app;

public class Fraction {
  int numerator;
  int denominator;

  Fraction(int numerator) {
    this.numerator = numerator;
    this.denominator = 1;
  }

  Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  @Override
  public String toString() {
    return numerator + "/" + denominator;
  }

  Fraction sum(Fraction other) {
    return new Fraction(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator);
  }

  Fraction sub(Fraction other) {
    return sum(new Fraction(-other.numerator, other.denominator));
  }

  Fraction mul(Fraction other) {
    return new Fraction(numerator * other.numerator, denominator * other.denominator);
  }

  Fraction div(Fraction other) {
    return mul(new Fraction(other.denominator, other.numerator));
  }
}
