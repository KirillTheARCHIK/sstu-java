package app;

public class Time {
  public final Integer hours;
  public final Integer minutes;
  public final Integer seconds;

  public Time(Integer seconds) {
    seconds %= (24 * 60 * 60);
    this.hours = seconds / (60 * 60);
    this.minutes = seconds / 60 % 60;
    this.seconds = seconds % 60;
  }

  public Time(Integer hours, Integer minutes, Integer seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  @Override
  public String toString() {
    return String.format("%d:%02d:%02d", hours, minutes, seconds);
  }

  Integer getHours() {
    return hours;
  }

  Integer getMinutes() {
    return minutes;
  }

  Integer getSeconds() {
    return seconds;
  }
}
