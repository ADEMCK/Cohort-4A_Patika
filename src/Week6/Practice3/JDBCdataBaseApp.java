package Week6.Practice3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdataBaseApp {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/JDBCAPP";
    public static final String DB_USERNAME = "postgres";
    public static final String DB_PASSWORD = "postgres";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            // PostgreSQL JDBC sürücüsünü yükle
            Class.forName("org.postgresql.Driver");

            // Veritabanına bağlan
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Veritabanına bağlandı!");

            // Statement oluştur
            st = conn.createStatement();

            // employee tablosundan verileri çek
            ResultSet resultSet = st.executeQuery("SELECT * FROM employee");

            // Sonuçları ekrana yazdır
            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt(1));
                System.out.println("Adı : " + resultSet.getString(2));
                System.out.println("Pozisyon : " + resultSet.getString(3));
                System.out.println("Maaş : " + resultSet.getInt(4));
                System.out.println("#################");

        }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Kaynakları serbest bırak
            try {
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
