package app;

import java.util.ArrayList;

public class City {
  private String name;
  private ArrayList<CityLink> cityLinks;

  public City(String name) {
    setName(name);
    setCityLinks(new ArrayList<>());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<CityLink> getCityLinks() {
    return cityLinks;
  }

  public void setCityLinks(ArrayList<CityLink> cityLinks) {
    this.cityLinks = new ArrayList<>();
    for (CityLink cityLink : cityLinks) {
      addCityLink(cityLink);
    }
  }

  public void addCityLink(CityLink cityLink) {
    if (cityLinks.stream().anyMatch(cl -> cl.to == cityLink.to)) {
      return;
    }
    cityLinks.add(cityLink);
  }

  @Override
  public String toString() {
    String str = "Город " + name + ":\n";
    for (CityLink cityLink : cityLinks) {
      str += "  " + cityLink + "\n";
    }
    return str;
  }
}
