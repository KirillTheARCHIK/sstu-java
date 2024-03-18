package app;

import java.util.*;

public class City {
  private String name;
  private List<CityLink> cityLinks = new ArrayList<>();

  public City(String name) {
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<CityLink> getCityLinks() {
    return List.copyOf(cityLinks);
  }

  public void setCityLinks(List<CityLink> cityLinks) {
    this.cityLinks = new ArrayList<>();
    for (CityLink cityLink : cityLinks) {
      addCityLink(cityLink);
    }
  }

  public void addCityLink(CityLink cityLink) {
    if (cityLinks.stream().anyMatch(cl -> cl.getTo() == cityLink.getTo())) {
      throw new IllegalArgumentException();
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
