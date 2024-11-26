package MainSistem;

import MainSistem.LihatTransaksi;
import Services.Koneksi.DatabaseConnection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Penukaran extends javax.swing.JFrame {

    public Penukaran() {
        initComponents();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanel_Biru = new javax.swing.JPanel();
        jPanel_Oren = new javax.swing.JPanel();
        JL_selamatDatang = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JL_namaUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbJenisSampah = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBerat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbTempat = new javax.swing.JComboBox<>();
        btn_lihatTransaksi = new javax.swing.JButton();
        btn_Input = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNomorHP = new javax.swing.JTextField();
        btn_LogOUT = new javax.swing.JButton();
        txtHarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(910, 504));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        jpanel_Biru.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jpanel_BiruLayout = new javax.swing.GroupLayout(jpanel_Biru);
        jpanel_Biru.setLayout(jpanel_BiruLayout);
        jpanel_BiruLayout.setHorizontalGroup(
            jpanel_BiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpanel_BiruLayout.setVerticalGroup(
            jpanel_BiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jPanel_Oren.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel_OrenLayout = new javax.swing.GroupLayout(jPanel_Oren);
        jPanel_Oren.setLayout(jPanel_OrenLayout);
        jPanel_OrenLayout.setHorizontalGroup(
            jPanel_OrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_OrenLayout.setVerticalGroup(
            jPanel_OrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        JL_selamatDatang.setBackground(new java.awt.Color(0, 51, 102));
        JL_selamatDatang.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        JL_selamatDatang.setForeground(new java.awt.Color(0, 51, 102));
        JL_selamatDatang.setText("SELAMAT DATANG,");

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("User");

        JL_namaUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_namaUser.setForeground(new java.awt.Color(51, 0, 102));
        JL_namaUser.setText("User");

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PILAHKU");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("- - - - - - - - - - - - - - - -");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("- - - - - - - - - - - - - - - -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Jenis Sampah");

        cmbJenisSampah.setBackground(new java.awt.Color(255, 255, 255));
        cmbJenisSampah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbJenisSampah.setForeground(new java.awt.Color(0, 0, 0));
        cmbJenisSampah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plastik", "Botol", "Kertas ", "Kaleng", "Kaca", "Minyak", "Campuran", " " }));
        cmbJenisSampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisSampahActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Harga");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Berat (Kg)");

        txtBerat.setBackground(new java.awt.Color(255, 255, 255));
        txtBerat.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tempat Penukaran");

        cmbTempat.setBackground(new java.awt.Color(255, 255, 255));
        cmbTempat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbTempat.setForeground(new java.awt.Color(0, 0, 0));
        cmbTempat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DUSUN1", "DUSUN2", "DUSUN3", "DUSUN4", "DUSUN5", " " }));

        btn_lihatTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        btn_lihatTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_lihatTransaksi.setForeground(new java.awt.Color(0, 0, 0));
        btn_lihatTransaksi.setText("Lihat Riwayat Transaksi");
        btn_lihatTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lihatTransaksiActionPerformed(evt);
            }
        });

        btn_Input.setBackground(new java.awt.Color(255, 255, 255));
        btn_Input.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Input.setForeground(new java.awt.Color(0, 0, 0));
        btn_Input.setText("Input");
        btn_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InputActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nama");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nomor HP");

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setForeground(new java.awt.Color(0, 0, 0));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtNomorHP.setBackground(new java.awt.Color(255, 255, 255));
        txtNomorHP.setForeground(new java.awt.Color(0, 0, 0));

        btn_LogOUT.setText("LOGOUT");
        btn_LogOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOUTActionPerformed(evt);
            }
        });

        txtHarga.setBackground(new java.awt.Color(255, 255, 255));
        txtHarga.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_Biru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Oren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(429, 429, 429)
                                .addComponent(JL_namaUser))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(JL_selamatDatang)))
                        .addGap(310, 310, 310)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btn_Input)
                                .addGap(152, 152, 152)
                                .addComponent(btn_lihatTransaksi)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtBerat)
                                            .addComponent(cmbTempat, 0, 134, Short.MAX_VALUE)
                                            .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbJenisSampah, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(168, 168, 168)))
                .addContainerGap(6, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_LogOUT)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpanel_Biru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JL_selamatDatang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_namaUser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbJenisSampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNomorHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbTempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 80, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Input)
                            .addComponent(btn_lihatTransaksi))
                        .addGap(24, 24, 24)))
                .addComponent(btn_LogOUT)
                .addGap(29, 29, 29)
                .addComponent(jPanel_Oren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJenisSampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisSampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJenisSampahActionPerformed

    private void btn_lihatTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lihatTransaksiActionPerformed
        new LihatTransaksi().setVisible(true); // Buka frame riwayat transaksi
        this.dispose(); // Tutup frame penukaran
    }//GEN-LAST:event_btn_lihatTransaksiActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btn_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InputActionPerformed
String jenisSampah = cmbJenisSampah.getSelectedItem() != null ? cmbJenisSampah.getSelectedItem().toString() : "";
String berat = txtBerat.getText();                   
String harga = txtHarga.getText();                    
String tempatPenukaran = cmbTempat.getSelectedItem() != null ? cmbTempat.getSelectedItem().toString() : "";
String nama = txtNama.getText();                                       
String nomorHp = txtNomorHP.getText();               

// Validasi input kosong
if (jenisSampah.isEmpty() || berat.isEmpty() || harga.isEmpty() || tempatPenukaran.isEmpty() || 
    nama.isEmpty() || nomorHp.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
    return; 
}

// Validasi format angka
try {
    Double.parseDouble(berat);
    Double.parseDouble(harga);
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Berat dan Harga harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
    return; 
}

// Menghitung harga otomatis berdasarkan jenis sampah
double hargaPerKg = 0;
switch (jenisSampah) {
    case "Plastik":
        hargaPerKg = 3000;  // harga per kg untuk plastik
        break;
    case "Kertas":
        hargaPerKg = 2000;  // harga per kg untuk kertas
        break;
    case "Botol":
        hargaPerKg = 5000;  // harga per kg untuk botol
        break;
    case "Kaleng":
        hargaPerKg = 8000;  // harga per kg untuk kaleng
        break;
    case "Kaca":
        hargaPerKg = 10000;  // harga per kg untuk kaca
        break;
    case "Minyak":
        hargaPerKg = 6000;  // harga per kg untuk minyak
        break;
    case "Campuran":
        hargaPerKg = 5000;  // harga per kg untuk campuran
        break;
    default:
        JOptionPane.showMessageDialog(this, "Jenis sampah tidak dikenal!", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
}

// Validasi format angka berat
double beratValue = 0;
try {
    beratValue = Double.parseDouble(berat);  // Mengubah berat menjadi double
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Berat harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
    return; 
}

// Menghitung harga total
double totalHarga = hargaPerKg * beratValue;

// Menampilkan harga di GUI (misalnya di txtHarga)
txtHarga.setText(String.valueOf(totalHarga));

// Validasi nomor HP (hanya angka)
if (!nomorHp.matches("\\d+")) {
    JOptionPane.showMessageDialog(this, "Nomor HP hanya boleh berisi angka!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Koneksi dan eksekusi query database
java.sql.Connection conn = null;
PreparedStatement stmt = null;
try {
    conn = DatabaseConnection.connect(); // pakai DatabaseConnection untuk koneksi
    if (conn != null) {
        String sql = "INSERT INTO transaksi_penukaran (jenis_sampah, berat, harga, tempat_penukaran, nama, No_HP, tanggal) VALUES (?, ?, ?, ?, ?, ?, ?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, jenisSampah);
        stmt.setDouble(2, beratValue);  
        stmt.setDouble(3, totalHarga);  
        stmt.setString(4, tempatPenukaran);
        stmt.setString(5, nama);
        stmt.setString(6, nomorHp); 
        stmt.setTimestamp(7, new java.sql.Timestamp(System.currentTimeMillis())); // Menyimpan tanggal saat ini

        stmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan! Status otomatis 'proses'.", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        // Reset form
        txtBerat.setText("");
        txtHarga.setText("");
        txtNama.setText("");
        txtNomorHP.setText("");
        cmbJenisSampah.setSelectedIndex(0);
        cmbTempat.setSelectedIndex(0);
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} finally {
    // Menutup koneksi dan statement
    DatabaseConnection.close(conn); // Menutup koneksi dengan DatabaseConnection
    try {
        if (stmt != null) stmt.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

    }//GEN-LAST:event_btn_InputActionPerformed

    private void btn_LogOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOUTActionPerformed
        int reply = JOptionPane.showConfirmDialog(
        null, 
        "Yakin ingin keluar?", 
        "Konfirmasi Keluar Aplikasi", 
        JOptionPane.YES_NO_OPTION
    );

    if (reply == JOptionPane.YES_OPTION) {
        // Tutup aplikasi
        System.exit(0);
    } else {
        JOptionPane.showMessageDialog(this, "Logout dibatalkan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btn_LogOUTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penukaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_namaUser;
    private javax.swing.JLabel JL_selamatDatang;
    private javax.swing.JButton btn_Input;
    private javax.swing.JButton btn_LogOUT;
    private javax.swing.JButton btn_lihatTransaksi;
    private javax.swing.JComboBox<String> cmbJenisSampah;
    private javax.swing.JComboBox<String> cmbTempat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Oren;
    private javax.swing.JPanel jpanel_Biru;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNomorHP;
    // End of variables declaration//GEN-END:variables
}
