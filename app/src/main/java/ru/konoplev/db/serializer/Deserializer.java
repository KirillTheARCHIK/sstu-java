package ru.konoplev.db.serializer;

public interface Deserializer<T> {
  T deserialize(String str);
}
