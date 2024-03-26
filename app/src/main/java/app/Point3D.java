package app;

public class Point3D extends Point2D {
  private int z;

  Point3D(int x, int y, int z) {
    super(x, y);
    setZ(z);
  }

  public int getZ() {
    return z;
  }

  void setZ(int z) {
    this.z = z;
  }

  public double distanceTo(Point3D other) {
    return Math.sqrt(Math.pow(super.distanceTo(other), 2) + Math.pow(z, 2));
  }
}
