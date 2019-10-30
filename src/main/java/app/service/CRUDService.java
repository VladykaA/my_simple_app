package app.service;

public interface CRUDService<T> {
    void save(T entity);
    void update(T entity);
    void deleteById(String name, String pass);
    void getAll();
}
