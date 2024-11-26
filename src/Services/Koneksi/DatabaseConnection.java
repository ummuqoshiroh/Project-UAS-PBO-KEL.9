package Services.Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/pilahku";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Menghubungkan ke database
    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return connection;
    }

    // Menutup koneksi
    public static void close(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Koneksi ditutup.");
            }
        } catch (SQLException e) {
            System.out.println("Error saat menutup koneksi: " + e.getMessage());
        }
    }
}

