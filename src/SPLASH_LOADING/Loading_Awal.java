package SPLASH_LOADING;

import javax.swing.Timer;


public class Loading_Awal extends javax.swing.JFrame {
     private int progressValue = 0;

    public Loading_Awal() {
        initComponents();
        startLoading();
    }
    
     private void startLoading() {
    Timer timer = new Timer(50, e -> {
        if (progressValue < 100) {
            progressValue++;
            jProgressBar1.setValue(progressValue);
            jLabel1.setText(progressValue + "%");
        } else {
            ((Timer) e.getSource()).stop(); // Hentikan timer jika loading selesai
            dispose(); // Tutup splash screen
            openLoginForm(); // Panggil form Login
        }
    });
    timer.start();
}
     private void openLoginForm() {
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACKGROUND = new javax.swing.JPanel();
        txt_Logo = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        txt_loading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BACKGROUND.setBackground(new java.awt.Color(255, 255, 255));
        BACKGROUND.setPreferredSize(new java.awt.Dimension(900, 500));
        BACKGROUND.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO/pilahku.png"))); // NOI18N
        BACKGROUND.add(txt_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 560, 390));

        jProgressBar1.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar1.setForeground(new java.awt.Color(51, 153, 255));
        BACKGROUND.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 494, 910, 10));

        txt_loading.setFont(new java.awt.Font("Yu Gothic Medium", 2, 14)); // NOI18N
        txt_loading.setForeground(new java.awt.Color(0, 0, 0));
        txt_loading.setText("Loading...");
        BACKGROUND.add(txt_loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("0%");
        BACKGROUND.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading_Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading_Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading_Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading_Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading_Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading_Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading_Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading_Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading_Awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUND;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel txt_Logo;
    private javax.swing.JLabel txt_loading;
    // End of variables declaration//GEN-END:variables
}
