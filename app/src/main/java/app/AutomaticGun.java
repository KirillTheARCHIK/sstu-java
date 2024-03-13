package app;

public class AutomaticGun extends Gun {
  private int rateOfFire;

  public AutomaticGun() {
    super(30);
    setCapacity(30);
  }

  public

  public AutomaticGun(int capacity) {
    super(capacity);
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
}
