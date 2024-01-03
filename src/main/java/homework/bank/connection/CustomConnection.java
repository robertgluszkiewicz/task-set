package homework.bank.connection;

import java.sql.Connection;
import java.sql.SQLException;

import homework.bank.exception.DbCRUDException;
import homework.bank.util.ConnectionProperties;

public class CustomConnection {
    private static final ConnectionConfiguration cc;

    static {
        try {
            ConnectionProperties cu = new ConnectionProperties();
            cc = ConnectionConfiguration.create(cu.getUrl(), cu.getUser(), cu.getPassword());
        } catch (SQLException e) {
            throw new DbCRUDException("Connection configuration error", e);
        }
    }

    public static Connection getConnection() {
        try {
            return cc.getConnection();
        } catch (SQLException e) {
            throw new DbCRUDException("Getting connection error", e);
        }
    }
}
