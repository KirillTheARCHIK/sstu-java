package ru.konoplev.db.serializer;

public interface Serializer<T> {
  T fromData(String data);

  String toData(T object);
}
