package Transaksi;

import java.util.ArrayList;
import users.User;

public class Transaksi {
    private User user; // object (pertemuan 1)
    private String namaSampah;
    private double berat;
    private double totalHarga;

    // ArrayList untuk menyimpan daftar transaksi (Pertemuan 9)
    public static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    // Constructor
    public Transaksi(User user, String namaSampah, double berat, double totalHarga) {
        this.user = user;
        this.namaSampah = namaSampah;
        this.berat = berat;
        this.totalHarga = totalHarga;
    }

    // Getter dan Setter
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNamaSampah() {
        return namaSampah;
    }

    public void setNamaSampah(String namaSampah) {
        this.namaSampah = namaSampah;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    // Method untuk menampilkan detail transaksi
    public void printDetailTransaksi() {
        System.out.println("User: " + user.getNama());
        System.out.println("Sampah: " + namaSampah);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Total Harga: Rp" + totalHarga);
    }

    // Tambahkan transaksi baru ke ArrayList (Pertemuan 9)
    public static void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
    }

    // Tampilkan semua transaksi (Looping - Pertemuan 6)
    public static void tampilkanSemuaTransaksi() {
        // Looping ArrayList dengan for-each
        for (Transaksi transaksi : daftarTransaksi) {
            System.out.println("------------------------");
            transaksi.printDetailTransaksi();
        }
    }
}

