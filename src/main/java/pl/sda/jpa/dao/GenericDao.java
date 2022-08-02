package pl.sda.jpa.dao;

import java.util.List;

public interface GenericDao<T> {
    T get(long id);

    List<T> getAll();

    void delete(long id);

    T create(T entity);

    T update(T entity);
}
