package app;

public class AutomaticGun extends Gun {
  private int rateOfFire;

  public AutomaticGun() throws Exception {
    super(30);
    setRateOfFire(30);
  }

  public AutomaticGun(int capacity) throws Exception {
    super(capacity);
    setRateOfFire(capacity / 2);
  }

  public AutomaticGun(int capacity, int rateOfFire) throws Exception {
    super(capacity);
    setRateOfFire(rateOfFire);
  }

  public int getRateOfFire() {
    return rateOfFire;
  }

  protected void setRateOfFire(int rateOfFire) throws Exception {
    if (rateOfFire <= 0) {
      throw new Exception();
    }
    this.rateOfFire = rateOfFire;
  }

  @Override
  public void fire() {
    for (int i = 0; i < rateOfFire; i++) {
      super.fire();
    }
  }

  public void fireSeconds(int seconds) {
    for (int i = 0; i < seconds; i++) {
      fire();
    }
  }
}
