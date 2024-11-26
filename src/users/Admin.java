package users;

// Inheritance (pertemuan 3)
public class Admin extends User implements KelolaData{ //implementasi interface (pertemuan 3)

    // Constructor
    public Admin(String username, String password, String nama, String email) {
        super(username, password, nama, email);
    }

    // Method khusus admin
    public void kelolaSampah() {
        System.out.println("Admin sedang mengelola data sampah...");
    }

    public void kelolaTransaksi() {
        System.out.println("Admin sedang mengelola data transaksi...");
    }

   @Override
    public void tambah() {
        System.out.println("Admin menambahkan data.");
    }

    @Override
    public void hapus() {
        System.out.println("Admin menghapus data.");
    }

    @Override
    public void edit() {
        System.out.println("Admin mengedit data.");
    }
}

