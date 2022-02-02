package data.postgres;

import data.DB;

import java.sql.*;

public class Postgres implements DB {
    private Connection con;

    public Postgres() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/UsersDB";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "1234");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Connection getConnection() {
        return con;
    }

    @Override
    public void close() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
