package it.cai.cividale.server.dao;

import java.util.List;

public interface Dao<T> {
    Long save(T object);

    void saveOrUpdate(T object);

    void update(T object);

    List<T> list();

    T objectById(Long id);

    T merge(T object);

    void delete(T object);
}
