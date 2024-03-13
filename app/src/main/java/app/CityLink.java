package app;

public class CityLink {
  City to;
  int cost;

  public CityLink(City to, int cost) {
    this.to = to;
    this.cost = cost;
  }

  @Override
  public String toString() {
    return to.getName() + ": " + cost;
  }
}
