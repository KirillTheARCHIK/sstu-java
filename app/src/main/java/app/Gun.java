package app;

abstract public class Gun {
  private int ammo;
  private int capacity;

  public Gun(int capacity) {
    setCapacity(capacity);
    setAmmo(0);
  }

  public Gun(int capacity, int ammo) {
    setCapacity(capacity);
    setAmmo(ammo);
  }

  public int getAmmo() {
    return ammo;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }

  public int getCapacity() {
    return capacity;
  }

  protected void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public boolean isLoaded() {
    return ammo > 0;
  }

  public void addAmmo(int ammo) throws Exception {
    if (ammo < 0) {
      throw new Exception("Negative ammo");
    }
    setAmmo(getAmmo() + ammo > capacity - getAmmo() ? capacity - getAmmo() : ammo);
  }

  public void fire() {
    if (ammo > 0) {
      System.out.println("Бах!");
      ammo--;
    } else {
      System.out.println("Клац!");
    }
  }
}
