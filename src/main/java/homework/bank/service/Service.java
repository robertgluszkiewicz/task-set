package homework.bank.service;

import java.sql.SQLException;
import java.util.Collection;

public interface Service <T, V> {
    Collection<T> getAll() throws SQLException;
    T getById(V id) throws SQLException;
    boolean save(T entity) throws SQLException;
    void update(T newEntity, V id) throws SQLException;
    boolean delete(V id) throws SQLException;
}
