package ru.vsu.cs.manukovskij.demo.repository;

import java.io.IOException;

public interface IRepository<T> {
    T load(String path);
    void save(String path, T object) throws IOException;
}
