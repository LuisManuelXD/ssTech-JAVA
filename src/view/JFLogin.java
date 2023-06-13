package view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class JFLogin extends javax.swing.JFrame {

    public JFLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPasswoed = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUser1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblTitle.setText("Inicio de Sesión");

        lblPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 102, 102));
        lblPassword.setText("Contraseña: ");

        txtUser.setForeground(new java.awt.Color(0, 102, 102));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });

        txtPasswoed.setForeground(new java.awt.Color(0, 102, 102));
        txtPasswoed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswoedKeyReleased(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 102, 102));
        btnExit.setText("Salir");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        btnExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnExitKeyReleased(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 102, 102));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnEnter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(0, 102, 102));
        btnEnter.setText("Ingresar");
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        btnEnter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnEnterKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblUser1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(0, 102, 102));
        lblUser1.setText("Usuario: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(150, 150, 150))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtPasswoed, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addGap(27, 27, 27)
                .addComponent(lblUser1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPasswoed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtPasswoed.requestFocus();
        }
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtPasswoedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswoedKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnEnter.doClick();
            btnEnter.requestFocus();
        }
    }//GEN-LAST:event_txtPasswoedKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExitKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnExit.doClick();
        }
    }//GEN-LAST:event_btnExitKeyReleased

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String usuario = txtUser.getText();
        String contra = txtPasswoed.getText();
        boolean bandera = true;

        if (bandera){
            lblMessage.setText("Ingreso al sistema");
            lblMessage.setForeground(Color.blue);
        } else {
            lblMessage.setText("Cuenta sin acceso");
            lblMessage.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnEnterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEnterKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnEnter.doClick();
        }
    }//GEN-LAST:event_btnEnterKeyReleased

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JPasswordField txtPasswoed;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
