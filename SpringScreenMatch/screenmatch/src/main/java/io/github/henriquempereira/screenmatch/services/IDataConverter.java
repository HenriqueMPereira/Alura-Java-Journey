package io.github.henriquempereira.screenmatch.services;

public interface IDataConverter {
    <T> T convertTo(String json, Class<T> tClass);
}
