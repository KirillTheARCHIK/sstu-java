package app;

public class ConnectedCity extends City {
  public ConnectedCity(String name) {
    super(name);
  }

  @Override
  public void addCityLink(CityLink cityLink) {
    super.addCityLink(cityLink);
    cityLink.to.addCityLink(new CityLink(this, cityLink.cost));
  }
}
