package data;

import java.sql.*;

public interface DB {
    Connection getConnection();
    void close();
}
