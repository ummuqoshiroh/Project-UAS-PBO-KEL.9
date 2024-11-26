package SistemAdmin;

import javax.swing.JOptionPane;

public class MenuAdmin extends javax.swing.JFrame {

   
    public MenuAdmin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanel_Biru = new javax.swing.JPanel();
        JL_selamatDatang = new javax.swing.JLabel();
        JL_namaUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JL_pilihMenu = new javax.swing.JLabel();
        btn_REPORT = new javax.swing.JButton();
        btn_KelolaDataSampah = new javax.swing.JButton();
        btn_KelolaTransaksi = new javax.swing.JButton();
        btn_Logout = new javax.swing.JButton();

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

        JL_selamatDatang.setBackground(new java.awt.Color(0, 51, 102));
        JL_selamatDatang.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        JL_selamatDatang.setForeground(new java.awt.Color(0, 51, 102));
        JL_selamatDatang.setText("SELAMAT DATANG,");

        JL_namaUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JL_namaUser.setForeground(new java.awt.Color(51, 0, 102));
        JL_namaUser.setText("Admin");

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

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        JL_pilihMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JL_pilihMenu.setForeground(new java.awt.Color(51, 0, 102));
        JL_pilihMenu.setText("PILIH MENU DIBAWAH");

        btn_REPORT.setBackground(new java.awt.Color(255, 255, 255));
        btn_REPORT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_REPORT.setForeground(new java.awt.Color(0, 0, 0));
        btn_REPORT.setText("Kelola Laporan");
        btn_REPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_REPORTActionPerformed(evt);
            }
        });

        btn_KelolaDataSampah.setBackground(new java.awt.Color(255, 255, 255));
        btn_KelolaDataSampah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_KelolaDataSampah.setForeground(new java.awt.Color(0, 0, 0));
        btn_KelolaDataSampah.setText("Kelola Data Sampah");
        btn_KelolaDataSampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KelolaDataSampahActionPerformed(evt);
            }
        });

        btn_KelolaTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        btn_KelolaTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_KelolaTransaksi.setForeground(new java.awt.Color(0, 0, 0));
        btn_KelolaTransaksi.setText("Kelola Transaksi");
        btn_KelolaTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KelolaTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(JL_pilihMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_KelolaDataSampah)
                .addGap(63, 63, 63)
                .addComponent(btn_KelolaTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btn_REPORT)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_pilihMenu)
                .addGap(84, 84, 84)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_KelolaTransaksi)
                    .addComponent(btn_KelolaDataSampah)
                    .addComponent(btn_REPORT))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        btn_Logout.setBackground(new java.awt.Color(204, 204, 204));
        btn_Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Logout.setForeground(new java.awt.Color(0, 0, 0));
        btn_Logout.setText("LOGOUT");
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_Biru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(JL_namaUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JL_selamatDatang)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Logout)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpanel_Biru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JL_selamatDatang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_namaUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_KelolaDataSampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KelolaDataSampahActionPerformed
        // TODO add your handling code here:
        new KelolaDataSampah().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_KelolaDataSampahActionPerformed

    private void btn_KelolaTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KelolaTransaksiActionPerformed
        // TODO add your handling code here:
        new KelolaTransaksi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_KelolaTransaksiActionPerformed

    private void btn_REPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_REPORTActionPerformed
        // TODO add your handling code here:
        new LAPORAN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_REPORTActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
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
        // Tidak melakukan apa-apa (batal logout)
        JOptionPane.showMessageDialog(this, "Logout dibatalkan.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btn_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_namaUser;
    private javax.swing.JLabel JL_pilihMenu;
    private javax.swing.JLabel JL_selamatDatang;
    private javax.swing.JButton btn_KelolaDataSampah;
    private javax.swing.JButton btn_KelolaTransaksi;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_REPORT;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpanel_Biru;
    // End of variables declaration//GEN-END:variables
}
