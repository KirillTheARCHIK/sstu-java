package ru.konoplev.db;

import java.util.ArrayList;
import java.util.List;

import ru.konoplev.db.serializer.Deserializer;
import ru.konoplev.db.serializer.Serializer;

public class DB {
  private List<String> data = new ArrayList<>();

  public <T> void add(T ob, Serializer<T> serializer) {
    data.add(serializer.serialize(ob));
  }

  public <T> T get(int index, Deserializer<T> deserializer) {
    return (T) deserializer.deserialize(data.get(index));
  }
}
