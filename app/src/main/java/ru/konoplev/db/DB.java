package ru.konoplev.db;

import java.util.ArrayList;
import java.util.List;

import ru.konoplev.db.serializer.Serializer;

public class DB {
  private List<String> data = new ArrayList<>();

  public void add(Object ob, Serializer serializer) {
    data.add(serializer.toData(ob));
  }

  public Object get(int index, Serializer serializer) {
    return serializer.fromData(data.get(index));
  }
}
