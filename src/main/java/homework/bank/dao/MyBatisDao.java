package homework.bank.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MyBatisDao <T, V> {
    List<T> getAll() throws SQLException;
    T getEntityById(V id) throws SQLException;
    boolean insert(T entity) throws SQLException;
    void update(@Param("customer") T entity, @Param("customerId") V id) throws SQLException;
    boolean delete(V id) throws SQLException;
}
