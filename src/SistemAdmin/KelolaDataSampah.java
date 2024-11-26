package SistemAdmin;

import Services.Koneksi.DatabaseConnection;
import SistemAdmin.MenuAdmin;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.sql.DriverManager;

public class KelolaDataSampah extends javax.swing.JFrame {

    public KelolaDataSampah() {
        initComponents();
        loadTable();      // Memuat data ke tabel utama
        loadTable2();     // Memuat data ke tabel Edit
        loadTable3();     // Memuat data ke tabel Hapus
    }

    private static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/pilahku"; 
            String user = "root"; 
            String password = ""; 
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Database Berhasil!");
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

     // Memuat data ke JTable
    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // membersihkan data tabel
        try (Connection conn = connect()) {
            if (conn == null) throw new SQLException("Koneksi ke database gagal!");
            String query = "SELECT jenis_sampah, harga_per_kg FROM sampah";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("jenis_sampah"), rs.getInt("harga_per_kg")});
            }
            System.out.println("Data Berhasil Dimuat!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal Memuat Data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Memuat data ke jTable2 (untuk Edit)
private void loadTable2() {
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0); // Bersihkan data tabel
    try (Connection conn = connect()) {
        if (conn == null) throw new SQLException("Koneksi ke database gagal!");
        String query = "SELECT jenis_sampah, harga_per_kg FROM sampah";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[]{rs.getString("jenis_sampah"), rs.getInt("harga_per_kg")});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal Memuat Data di Edit: " + e.getMessage());
        e.printStackTrace();
    }
}

// Memuat data ke jTable3 (untuk Hapus)
private void loadTable3() {
    DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
    model.setRowCount(0); // Bersihkan data tabel
    try (Connection conn = connect()) {
        if (conn == null) throw new SQLException("Koneksi ke database gagal!");
        String query = "SELECT jenis_sampah, harga_per_kg FROM sampah";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[]{rs.getString("jenis_sampah"), rs.getInt("harga_per_kg")});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal Memuat Data di Hapus: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTP_HapusEditTambah = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTT_hargaperkg = new javax.swing.JTextField();
        jTT_jenissampah = new javax.swing.JTextField();
        btn_Simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btn_Kembali = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btn_hapus = new javax.swing.JButton();
        btn_kembali1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_SampahBaru = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_HargaBaru = new javax.swing.JLabel();
        txt_jenisbaru = new javax.swing.JTextField();
        txt_hargabaru = new javax.swing.JTextField();
        btn_edit = new javax.swing.JButton();
        btn_kembalikemenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTP_HapusEditTambah.setBackground(new java.awt.Color(204, 255, 204));
        jTP_HapusEditTambah.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Jenis Sampah");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Harga Per KG");

        jTT_hargaperkg.setBackground(new java.awt.Color(255, 255, 255));
        jTT_hargaperkg.setForeground(new java.awt.Color(0, 0, 0));

        jTT_jenissampah.setBackground(new java.awt.Color(255, 255, 255));
        jTT_jenissampah.setForeground(new java.awt.Color(0, 0, 0));

        btn_Simpan.setBackground(new java.awt.Color(255, 255, 255));
        btn_Simpan.setForeground(new java.awt.Color(0, 0, 0));
        btn_Simpan.setText("Simpan");
        btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SimpanActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jenis Sampah", "Harga Per KG"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Daftar Sampah");

        btn_Kembali.setBackground(new java.awt.Color(255, 255, 255));
        btn_Kembali.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Kembali.setForeground(new java.awt.Color(0, 0, 0));
        btn_Kembali.setText("KEMBALI");
        btn_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTT_jenissampah, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTT_hargaperkg, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 508, Short.MAX_VALUE)
                        .addComponent(btn_Kembali))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Simpan)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTT_jenissampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTT_hargaperkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btn_Simpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_Kembali)
                .addGap(22, 438, Short.MAX_VALUE))
        );

        jTP_HapusEditTambah.addTab("Tambah Sampah", jPanel1);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("PILIH DATA SAMPAH");

        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jenis Sampah", "Harga"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        btn_hapus.setBackground(new java.awt.Color(204, 204, 204));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(0, 0, 0));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_kembali1.setBackground(new java.awt.Color(204, 204, 204));
        btn_kembali1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_kembali1.setForeground(new java.awt.Color(0, 0, 0));
        btn_kembali1.setText("Kembali");
        btn_kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembali1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_hapus)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_kembali1)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btn_kembali1)
                .addGap(26, 26, 26))
        );

        jTP_HapusEditTambah.addTab("Hapus Sampah", jPanel3);

        txt_SampahBaru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_SampahBaru.setText("Jenis Sampah Baru");

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jenis Sampah", "Harga"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jScrollPane3.setViewportView(jScrollPane2);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PILIH DATA SAMPAH");

        txt_HargaBaru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_HargaBaru.setText("Harga Sampah Baru");

        txt_jenisbaru.setBackground(new java.awt.Color(255, 255, 255));
        txt_jenisbaru.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_jenisbaru.setForeground(new java.awt.Color(0, 0, 0));

        txt_hargabaru.setBackground(new java.awt.Color(255, 255, 255));
        txt_hargabaru.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_hargabaru.setForeground(new java.awt.Color(0, 0, 0));
        txt_hargabaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargabaruActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(204, 204, 204));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(0, 0, 0));
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_kembalikemenu.setBackground(new java.awt.Color(204, 204, 204));
        btn_kembalikemenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_kembalikemenu.setForeground(new java.awt.Color(0, 0, 0));
        btn_kembalikemenu.setText("Kembali");
        btn_kembalikemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembalikemenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btn_edit))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_kembalikemenu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_HargaBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_hargabaru, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_SampahBaru)
                                .addGap(54, 54, 54)
                                .addComponent(txt_jenisbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_SampahBaru)
                            .addComponent(txt_jenisbaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_HargaBaru)
                    .addComponent(txt_hargabaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btn_kembalikemenu)
                .addGap(16, 16, 16))
        );

        jTP_HapusEditTambah.addTab("Edit Sampah", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTP_HapusEditTambah)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTP_HapusEditTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KembaliActionPerformed
        // TODO add your handling code here:
        new MenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_KembaliActionPerformed

    private void btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SimpanActionPerformed
        String jenisSampah = jTT_jenissampah.getText();
        String hargaPerKgStr = jTT_hargaperkg.getText();

        if (jenisSampah.isEmpty() || hargaPerKgStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jenis Sampah dan Harga tidak boleh kosong!");
            return;
        }

        try {
            int hargaPerKg = Integer.parseInt(hargaPerKgStr);
            try (Connection conn = connect()) {
                if (conn == null) throw new SQLException("Koneksi ke database gagal!");
                String query = "INSERT INTO sampah (jenis_sampah, harga_per_kg) VALUES (?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, jenisSampah);
                stmt.setInt(2, hargaPerKg);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan!");
                loadTable(); // Refresh tabel
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga harus berupa angka!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal Menyimpan Data: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_SimpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = jTable3.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
            return;
        }

        String jenisSampah = (String) jTable3.getValueAt(selectedRow, 0);
        try (Connection conn = connect()) {
            if (conn == null) throw new SQLException("Koneksi ke database gagal!");
            String query = "DELETE FROM sampah WHERE jenis_sampah = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, jenisSampah);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!");
            loadTable(); // Refresh tabel
            loadTable2(); // Refresh tabel Edit
            loadTable3();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal Menghapus Data: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data yang ingin diedit!");
            return;
        }

        String jenisSampahLama = (String) jTable2.getValueAt(selectedRow, 0);
        String jenisSampahBaru = txt_jenisbaru.getText();
        String hargaPerKgStr = txt_hargabaru.getText();

        if (jenisSampahBaru.isEmpty() || hargaPerKgStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jenis Sampah dan Harga tidak boleh kosong!");
            return;
        }

        try {
            int hargaPerKg = Integer.parseInt(hargaPerKgStr);
            try (Connection conn = connect()) {
                if (conn == null) throw new SQLException("Koneksi ke database gagal!");
                String query = "UPDATE sampah SET jenis_sampah = ?, harga_per_kg = ? WHERE jenis_sampah = ?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, jenisSampahBaru);
                stmt.setInt(2, hargaPerKg);
                stmt.setString(3, jenisSampahLama);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil Diedit!");
                loadTable(); // Refresh tabel
                loadTable2(); // Refresh tabel Edit
                loadTable3(); // Refresh tabel Hapus
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Harga harus berupa angka!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal Mengedit Data: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembali1ActionPerformed
        // TODO add your handling code here:
        new MenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kembali1ActionPerformed

    private void btn_kembalikemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembalikemenuActionPerformed
        // TODO add your handling code here:
        new MenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kembalikemenuActionPerformed

    private void txt_hargabaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargabaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargabaruActionPerformed

    @SuppressWarnings("unchecked")
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new KelolaDataSampah().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Kembali;
    private javax.swing.JButton btn_Simpan;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kembali1;
    private javax.swing.JButton btn_kembalikemenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTP_HapusEditTambah;
    private javax.swing.JTextField jTT_hargaperkg;
    private javax.swing.JTextField jTT_jenissampah;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel txt_HargaBaru;
    private javax.swing.JLabel txt_SampahBaru;
    private javax.swing.JTextField txt_hargabaru;
    private javax.swing.JTextField txt_jenisbaru;
    // End of variables declaration//GEN-END:variables
}
