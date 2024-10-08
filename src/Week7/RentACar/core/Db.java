package Week7.RentACar.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private static Db instance = null;
    private Connection conn = null;

    private final String DB_URL = "jdbc:postgresql://localhost:5432/rentacar";
    private final String DB_USERNAME = "postgres";
    private final String DB_PASS = "postgres";

    private Db() {
        try {
            this.conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }

    public static Connection getInstance() {
        try {
            if (instance == null || instance.getConn().isClosed()) {
                instance = new Db();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return instance.getConn();
    }
}
