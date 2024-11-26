package SistemAdmin;

import Services.Koneksi.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KelolaTransaksi extends javax.swing.JFrame {

    public KelolaTransaksi() {
        initComponents();
        loadtabel();
    }

    public class Database {
    public static Connection getConnection() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/pilahku";
            String user = "root";
            String password = "";

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new SQLException("Koneksi database gagal: " + e.getMessage());
        }
    }
} 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_setuju = new javax.swing.JButton();
        btn_tolak = new javax.swing.JButton();
        btn_Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(910, 504));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("TRANSAKSI USER");

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Tanggal", "Nama", "Jenis Sampah", "Berat", "Harga", "Tempat Penukaran", "Nomor HP", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_setuju.setBackground(new java.awt.Color(204, 204, 204));
        btn_setuju.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_setuju.setForeground(new java.awt.Color(0, 0, 0));
        btn_setuju.setText("SETUJU");
        btn_setuju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setujuActionPerformed(evt);
            }
        });

        btn_tolak.setBackground(new java.awt.Color(204, 204, 204));
        btn_tolak.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tolak.setForeground(new java.awt.Color(0, 0, 0));
        btn_tolak.setText("TOLAK");
        btn_tolak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tolakActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_setuju)
                                .addGap(27, 27, 27)
                                .addComponent(btn_tolak))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_Kembali)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_setuju)
                    .addComponent(btn_tolak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Kembali)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_setujuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setujuActionPerformed
         int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int idTransaksi = (int) jTable1.getValueAt(selectedRow, 0); // ID transaksi di kolom pertama
            updateStatus(idTransaksi, "sukses"); // Mengubah status menjadi 'sukses'
        } else {
            JOptionPane.showMessageDialog(this, "Pilih transaksi terlebih dahulu.");
        }
    }//GEN-LAST:event_btn_setujuActionPerformed

    private void btn_tolakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tolakActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int idTransaksi = (int) jTable1.getValueAt(selectedRow, 0); // ID transaksi di kolom pertama
            updateStatus(idTransaksi, "tolak"); // Mengubah status menjadi 'tolak'
        } else {
            JOptionPane.showMessageDialog(this, "Pilih transaksi terlebih dahulu.");
        }
    }//GEN-LAST:event_btn_tolakActionPerformed

    private void btn_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KembaliActionPerformed
        // TODO add your handling code here:
        new MenuAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_KembaliActionPerformed

     private void loadtabel() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DatabaseConnection.connect(); 
            if (conn != null) {
                String sql = "SELECT * FROM transaksi_penukaran";
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();

                // Ambil model tabel
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                // Bersihkan tabel sebelum menambahkan data baru
                model.setRowCount(0);

                // Tambahkan data dari hasil query ke tabel
                while (rs.next()) {
                    // Mengambil status berdasarkan data dari database
                    String status = rs.getString("status");

                    // Membuat data baris untuk ditambahkan ke tabel
                    Object[] rowData = new Object[]{
                        rs.getInt("id_transaksi"), // ID transaksi
                        rs.getDate("tanggal"), // Tanggal transaksi
                        rs.getString("nama"),
                        rs.getString("jenis_sampah"),
                        rs.getDouble("berat"),
                        rs.getDouble("harga"),
                        rs.getString("tempat_penukaran"),
                        rs.getString("No_HP"),
                        status // Status transaksi yang ditampilkan
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close(); // Pastikan koneksi ditutup
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
     
     private void updateStatus(int idTransaksi, String newStatus) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DatabaseConnection.connect();
            if (conn != null) {
                String sql = "UPDATE transaksi_penukaran SET status = ? WHERE id_transaksi = ?";
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, newStatus);  // Set status baru
                stmt.setInt(2, idTransaksi);   // Set ID transaksi yang akan diupdate

                int affectedRows = stmt.executeUpdate();
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(this, "Status berhasil diubah menjadi " + newStatus);
                    loadtabel(); // Refresh tabel setelah status diubah
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal mengubah status.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Kembali;
    private javax.swing.JButton btn_setuju;
    private javax.swing.JButton btn_tolak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
