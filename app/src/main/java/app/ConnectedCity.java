package app;

public class ConnectedCity extends City {
  public ConnectedCity(String name) {
    super(name);
  }

  @Override
  public void addCityLink(CityLink cityLink) {
    super.addCityLink(cityLink);
    if (cityLink.to.getCityLinks().stream().anyMatch(cl -> cl.to == this)) {
      return;
    }
    cityLink.to.addCityLink(new CityLink(this, cityLink.cost));
  }
}
