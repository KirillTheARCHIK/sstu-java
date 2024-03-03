package app;

import java.util.ArrayList;

public class City {
  String name;
  ArrayList<CityLink> cityLinks;

  public City(String name) {
    this.name = name;
    cityLinks = new ArrayList<>();
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
