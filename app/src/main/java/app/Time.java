package app;

public class Time {
  public Integer hours;
  public Integer minutes;
  public Integer seconds;

  public Time(Integer seconds) {
    seconds %= (24 * 60 * 60);
    this.hours = seconds / (60 * 60);
    this.minutes = seconds / 60 % 60;
    this.seconds = seconds % 60;
  }

  @Override
  public String toString() {
    return String.format("%d:%02d:%02d", hours, minutes, seconds);
  }
}
