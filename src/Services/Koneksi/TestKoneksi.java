package Services.Koneksi;

import java.sql.Connection;

public class TestKoneksi {
    public static void main(String[] args) {
        Connection conn = DatabaseConnection.connect(); 
        if (conn != null) {
            System.out.println("Berhasil terhubung ke database!");
        } else {
            System.out.println("Gagal terhubung ke database.");
        }
    }
}

