package app;

public class Gun {
  int ammo;

  public Gun() {
    ammo = 5;
  }

  public Gun(int ammo) {
    this.ammo = ammo;
  }

  public void Fire() {
    if (ammo > 0) {
      System.out.println("Бах!");
      ammo--;
    } else {
      System.out.println("Клац!");
    }
  }
}
