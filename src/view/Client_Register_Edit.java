package view;

import controller.Client_queue;
import javax.swing.JOptionPane;

public class Client_Register_Edit extends javax.swing.JInternalFrame {
    Client_queue clientQueue = new Client_queue();
    
    /**
     * Creates new form Client_Register_Edit
     */
    public Client_Register_Edit() {
        initComponents();
        comboxEdad.addItem("Selecciona");
        for (int i = 0; i <= 100; i++) {
            comboxEdad.addItem(String.valueOf(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtLastName = new javax.swing.JTextField();
        lblMail = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jlbTitulo = new javax.swing.JLabel();
        lblCellPhone = new javax.swing.JLabel();
        txtCellPhone = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        comboxEdad = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar / Editar Cliente");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        lblMail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblMail.setForeground(new java.awt.Color(255, 255, 255));
        lblMail.setText("Correo:");

        lblAge.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("Edad:");

        jlbTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo.setText("Registrar / Editar Cliente");

        lblCellPhone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblCellPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblCellPhone.setText("Celular:");

        txtCellPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCellPhoneKeyTyped(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nombres:");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 102, 102));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnAdd.setToolTipText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 102, 102));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEdit.setToolTipText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnBack.setToolTipText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblLastName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Apellidos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastName)
                    .addComponent(lblName)
                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCellPhone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtName)
                        .addComponent(txtLastName)
                        .addComponent(txtMail)
                        .addComponent(txtCellPhone)
                        .addComponent(comboxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTitulo)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(comboxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMail)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellPhone)
                    .addComponent(txtCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBack))
                    .addComponent(btnEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo nombres vacio");
            return;
        }

        if (txtLastName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo apellidos vacio");
            return;
        }

        if (comboxEdad.getSelectedItem().equals("Selecciona")) {
            JOptionPane.showMessageDialog(null, "Campo edad sin seleccionar");
            return;
        }

        if (txtMail.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo correo vacio");
            return;
        }

        if (txtMail.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo correo vacio");
            return;
        }

        if (txtCellPhone.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo celular vacio");
            return;
        }

        if (txtCellPhone.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "Numero celular incompleto");
            return;
        }
        String name = txtName.getText();
        String lastName = txtLastName.getText();
        int age = Integer.parseInt((String) comboxEdad.getSelectedItem());
        String mail = txtMail.getText();
        String cellPhone = txtCellPhone.getText();
        
        clientQueue.enqueue_C(name, lastName, age, mail, cellPhone);
        clientQueue.recorrerCola();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCellPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellPhoneKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (txtCellPhone.getText().length() == 10) {
            evt.consume();
        }

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCellPhoneKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> comboxEdad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhone;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtCellPhone;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
