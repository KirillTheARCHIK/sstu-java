package ru.konoplev.db.serializer;

import java.util.HashMap;
import java.util.Map;

public class JSONSerializer implements Serializer<Map<String, Object>> {

  @Override
  public Map<String, Object> fromData(String data) {
    return new HashMap<String, Object>();
  }

  @Override
  public String toData(Map<String, Object> object) {
    return object.toString();
  }
}
