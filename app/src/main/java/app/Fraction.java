package app;

public class Fraction {
  private int numerator;
  private int denominator;

  public Fraction(int numerator) throws Exception {
    this(numerator, 1);
  }

  public Fraction(int numerator, int denominator) throws Exception {
    setNumerator(numerator);
    setDenominator(denominator);
  }

  public int getNumerator() {
    return numerator;
  }

  private void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  private void setDenominator(int denominator) throws Exception {
    if (numerator <= 0) {
      throw new Exception();
    }
    this.denominator = denominator;
  }

  @Override
  public String toString() {
    return numerator + "/" + denominator;
  }

  public Fraction sum(Fraction other) throws Exception {
    return new Fraction(numerator * other.denominator + other.numerator * denominator, denominator * other.denominator);
  }

  public Fraction sub(Fraction other) throws Exception {
    return sum(new Fraction(-other.numerator, other.denominator));
  }

  public Fraction mul(Fraction other) throws Exception {
    return new Fraction(numerator * other.numerator, denominator * other.denominator);
  }

  public Fraction div(Fraction other) throws Exception {
    return mul(new Fraction(other.denominator, other.numerator));
  }
}
