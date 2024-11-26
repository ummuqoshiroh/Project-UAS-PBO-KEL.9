package SPLASH_LOADING;

import MainSistem.Penukaran;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        setLocationRelativeTo(null); // Pusatkan frame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_SIGN_UP = new javax.swing.JLabel();
        txt_Nama = new javax.swing.JTextField();
        JlLabel_Nama = new javax.swing.JLabel();
        JLabel_Email = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        btn_SignUp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_Login = new javax.swing.JButton();
        jPassword_password = new javax.swing.JPasswordField();
        LabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(910, 504));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel_SIGN_UP.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_SIGN_UP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_SIGN_UP.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SIGN_UP.setText("SIGN UP");

        txt_Nama.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NamaActionPerformed(evt);
            }
        });

        JlLabel_Nama.setBackground(new java.awt.Color(255, 255, 255));
        JlLabel_Nama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JlLabel_Nama.setForeground(new java.awt.Color(255, 255, 255));
        JlLabel_Nama.setText("Nama Lengkap");

        JLabel_Email.setBackground(new java.awt.Color(255, 255, 255));
        JLabel_Email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_Email.setText("Email");

        txt_Email.setBackground(new java.awt.Color(255, 255, 255));
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });

        jLabel_Password.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password");

        btn_SignUp.setBackground(new java.awt.Color(255, 153, 0));
        btn_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_SignUp.setForeground(new java.awt.Color(0, 0, 0));
        btn_SignUp.setText("Sign Up");
        btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignUpActionPerformed(evt);
            }
        });

        jLabel5.setText("I have an account ");

        btn_Login.setBackground(new java.awt.Color(255, 153, 0));
        btn_Login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(0, 0, 0));
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        jPassword_password.setBackground(new java.awt.Color(255, 255, 255));
        jPassword_password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPassword_password.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JlLabel_Nama)
                            .addComponent(txt_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(JLabel_Email)
                            .addComponent(txt_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(jLabel_Password)
                            .addComponent(btn_SignUp)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Login))
                            .addComponent(jPassword_password)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel_SIGN_UP)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel_SIGN_UP)
                .addGap(31, 31, 31)
                .addComponent(JlLabel_Nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabel_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_SignUp)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btn_Login))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/pilahku.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, Short.MAX_VALUE)
                .addGap(101, 101, 101)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLogo)
                .addGap(126, 126, 126))
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

    private void txt_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NamaActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignUpActionPerformed

        // Ambil input dari field pengguna
    String nama = txt_Nama.getText();
    String email = txt_Email.getText();
    String password = new String(jPassword_password.getPassword());

    // Validasi input
    if (nama.isEmpty() || email.isEmpty() || password.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Semua field harus diisi!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    } else {
        // Simulasi registrasi berhasil
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Registrasi berhasil! Selamat datang, " + nama);

        // Arahkan ke form Penukaran
        new Penukaran().setVisible(true);
        this.dispose(); // Tutup form Sign Up
    }
    }//GEN-LAST:event_btn_SignUpActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true); // Buka frame 
        this.dispose(); // Tutup frame Sign Up
    }//GEN-LAST:event_btn_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_Email;
    private javax.swing.JLabel JlLabel_Nama;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_SignUp;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_SIGN_UP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword_password;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Nama;
    // End of variables declaration//GEN-END:variables
}
