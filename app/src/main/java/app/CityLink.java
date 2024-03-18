package app;

public class CityLink {
  private City to;
  private int cost;

  public CityLink(City to, int cost) {
    setTo(to);
    setCost(cost);
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public City getTo() {
    return to;
  }

  private void setTo(City to) {
    this.to = to;
  }

  @Override
  public String toString() {
    return to.getName() + ": " + cost;
  }
}
