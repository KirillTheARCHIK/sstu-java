package ru.konoplev.db.serializer;

public interface Serializer<T> {
  String serialize(T data);
}