package Sampah;

// parameter dan kontruktor (pertemuan 2)
public class Sampah {
    private String namaSampah; //tipe data
    private int jumlah;
    private double hargaPerKg;

    // Constructor
    public Sampah(String namaSampah, int jumlah, double hargaPerKg) {
        this.namaSampah = namaSampah;
        this.jumlah = jumlah;
        this.hargaPerKg = hargaPerKg;
    }

    // Getter and Setter
    public String getNamaSampah() {
        return namaSampah;
    }

    public void setNamaSampah(String namaSampah) {
        this.namaSampah = namaSampah;
    }
    
     public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHargaPerKg() {
        return hargaPerKg;
    }

    public void setHargaPerKg(double hargaPerKg) {
        this.hargaPerKg = hargaPerKg;
    }
    
    public double hitungTotalHarga() {
        return jumlah * hargaPerKg;
    }
    
    // Daftar jenis sampah (Array - Pertemuan 7)
    public static final String[] JENIS_SAMPAH = {"Plastik","Botol", "Kertas", "Kaleng", "minyak", "Kaca", "Campuran"};
    
    // Method dengan parameter
    public void setSampahDetails(String namaSampah, int jumlah, double hargaPerKg) {
        this.namaSampah = namaSampah;
        this.jumlah = jumlah;
        this.hargaPerKg = hargaPerKg;
    }
    public void printDetails() {
        System.out.println("nama Sampah: " + namaSampah);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga Per Kg: Rp" + hargaPerKg);
    }
}
