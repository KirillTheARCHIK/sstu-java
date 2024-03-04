package app;

import java.util.*;

public class City {
  String name;
  ArrayList<CityLink> cityLinks;

  public City(String name) {
    this.name = name;
    cityLinks = new ArrayList<>();
  }

  public City(String name, ArrayList<CityLink> cityLinks) {
    this.name = name;
    this.cityLinks = cityLinks;
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
