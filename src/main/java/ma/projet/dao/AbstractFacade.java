package ma.projet.dao;

import java.util.List;

public interface AbstractFacade<T> {
    T create(T o);
    T update(T o);
    boolean delete(T o);
    T findbyid(int id);
    List<T> findall();
}
