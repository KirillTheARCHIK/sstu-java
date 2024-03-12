package app;

public class Fraction {
  int numerator;
  int denominator;

  Fraction(int numerator) throws Exception {
    this(numerator, 1);
  }

  Fraction(int numerator, int denominator) throws Exception {
    setNumerator(numerator);
    setDenominator(denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  void setNumerator(int numerator) {

    this.numerator = numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  void setDenominator(int denominator) throws Exception {
    if (numerator <= 0) {
      throw new Exception();
    }
    this.denominator = denominator;
  }

  @Override
  public String toString() {
    return numerator + "/" + denominator;
  }

  Fraction sum(Fraction other) throws Exception {
    return new Fraction(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator);
  }

  Fraction sub(Fraction other) throws Exception {
    return sum(new Fraction(-other.numerator, other.denominator));
  }

  Fraction mul(Fraction other) throws Exception {
    return new Fraction(numerator * other.numerator, denominator * other.denominator);
  }

  Fraction div(Fraction other) throws Exception {
    return mul(new Fraction(other.denominator, other.numerator));
  }
}
