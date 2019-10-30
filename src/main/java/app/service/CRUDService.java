package app.service;

import java.util.List;

public interface CRUDService<T> {
    void save(T entity);
    void update(T entity);
    void deleteById(String name, String pass);
    List<T> getAll();
}
