package view;

import controller.Refacts_queue;
import javax.swing.JOptionPane;
import model.Refacts;

public class Refacts_Register_Edit extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    Refacts_queue refactsQueue = new Refacts_queue();
    int id;

    public Refacts_Register_Edit(Refacts_queue refact) {
        initComponents();
        refactsQueue = refact;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbtnMiddle = new javax.swing.JRadioButton();
        lblCliente = new javax.swing.JLabel();
        lblPedido = new javax.swing.JLabel();
        comboxUnits = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        comboxProduct = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        rbtnBad = new javax.swing.JRadioButton();
        rbtnGood = new javax.swing.JRadioButton();
        lblFechaSalida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboxCategory = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registrar - Refacciones");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        rbtnMiddle.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbtnMiddle);
        rbtnMiddle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnMiddle.setForeground(new java.awt.Color(204, 204, 204));
        rbtnMiddle.setText("Medio");
        rbtnMiddle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Producto");

        lblPedido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPedido.setForeground(new java.awt.Color(255, 255, 255));
        lblPedido.setText("Unidades");

        comboxUnits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboxUnits.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        lblCelular.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 255, 255));
        lblCelular.setText("Precio");

        comboxProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Memoria RAM", "SSD", "HDD" }));
        comboxProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Categoría");

        rbtnBad.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbtnBad);
        rbtnBad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnBad.setForeground(new java.awt.Color(204, 204, 204));
        rbtnBad.setText("Malo");
        rbtnBad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rbtnGood.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbtnGood);
        rbtnGood.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnGood.setForeground(new java.awt.Color(204, 204, 204));
        rbtnGood.setText("Bueno");
        rbtnGood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblFechaSalida.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblFechaSalida.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaSalida.setText("Estado");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar / Editar Refacciones");

        comboxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Componentes", "Herramientas" }));
        comboxCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 102, 102));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnAdd.setToolTipText("Añadir");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 102, 102));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEdit.setToolTipText("Editar");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnBack.setToolTipText("Regresar");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("Id:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPedido)
                    .addComponent(lblEstado)
                    .addComponent(lblFechaSalida)
                    .addComponent(lblCelular)
                    .addComponent(lblCliente)
                    .addComponent(lblId))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboxUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnGood)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnMiddle)
                                .addGap(12, 12, 12)
                                .addComponent(rbtnBad)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedido)
                    .addComponent(comboxUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(comboxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(comboxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSalida)
                    .addComponent(rbtnGood)
                    .addComponent(rbtnMiddle)
                    .addComponent(rbtnBad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBack))
                    .addComponent(btnEdit))
                .addGap(24, 24, 24))
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

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int id = Integer.parseInt(txtId.getText());
        int units = comboxUnits.getSelectedIndex();
        String productName = comboxProduct.getSelectedItem().toString();
        double price = Double.parseDouble(txtPrice.getText());
        String category = comboxCategory.getSelectedItem().toString();

        String status = "";

        if (rbtnGood.isSelected()) {
            status = "Bueno";
        }
        if (rbtnMiddle.isSelected()) {
            status = "Medio";
        }
        if (rbtnBad.isSelected()) {
            status = "Malo";
        }

        refactsQueue.enqueue_C(id, units, productName, price, category, status);

        txtId.setText(null);
        comboxUnits.setSelectedIndex(0);
        comboxProduct.setSelectedIndex(0);
        txtPrice.setText(null);
        comboxCategory.setSelectedIndex(0);
        rbtnGood.setSelected(false);
        rbtnMiddle.setSelected(false);
        rbtnBad.setSelected(false);

        JOptionPane.showMessageDialog(null, "Registrado correctamente");
        refactsQueue.recorrerCola();

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int newUnit = comboxUnits.getSelectedIndex();
        String newProductname = comboxProduct.getSelectedItem().toString();
        double newPrecio = Double.parseDouble(txtPrice.getText());
        String newCategory = comboxCategory.getSelectedItem().toString();

        String newProductState = "";

        if (rbtnGood.isSelected()) {
            newProductState = "Bueno";
        }
        if (rbtnMiddle.isSelected()) {
            newProductState = "Medio";
        }
        if (rbtnBad.isSelected()) {
            newProductState = "Malo";
        }

        refactsQueue.updateRefact(id, newProductname, newUnit, newPrecio, newCategory, newProductState);
        JOptionPane.showMessageDialog(null, "Se edito con exito", "Refacción editar", HEIGHT, frameIcon);

        comboxUnits.setSelectedIndex(0);
        comboxProduct.setSelectedItem(0);
        txtPrice.setText(null);
        comboxCategory.setSelectedItem(0);
        rbtnGood.setSelected(false);
        rbtnMiddle.setSelected(false);
        rbtnBad.setSelected(false);

        comboxUnits.requestFocus();

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //Si se presiona, cerrara la ventana
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        id = Integer.parseInt(txtId.getText());
        if (txtId.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campo id vacio");
            return;
        }

        Refacts refacts = refactsQueue.getRefacts(Integer.parseInt(txtId.getText()));
        id = Integer.parseInt(txtId.getText());
        
        if (refacts != null) {
            txtId.setText(String.valueOf(refacts.getId()));
            comboxUnits.setSelectedIndex(refacts.getUnits());
            comboxProduct.setSelectedItem(refacts.getProductName());
            txtPrice.setText(String.valueOf(refacts.getPrice()));
            comboxCategory.setSelectedItem(refacts.getCategory());
            comboxUnits.setSelectedItem(refacts.getUnits());
            if(refacts.getProuctStatus().equals("Bueno")){
                rbtnGood.setSelected(true);
            }
            
            if(refacts.getProuctStatus().equals("Medio")){
                rbtnMiddle.setSelected(true);
            }
            
            if(refacts.getProuctStatus().equals("Malo")){
                rbtnBad.setSelected(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún cliente con el correo electrónico proporcionado.", "Cliente busqueda", HEIGHT, frameIcon);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboxCategory;
    private javax.swing.JComboBox<String> comboxProduct;
    private javax.swing.JComboBox<String> comboxUnits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JRadioButton rbtnBad;
    private javax.swing.JRadioButton rbtnGood;
    private javax.swing.JRadioButton rbtnMiddle;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
