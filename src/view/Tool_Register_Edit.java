/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author luisf
 */
public class Tool_Register_Edit extends javax.swing.JInternalFrame {

    /**
     * Creates new form jtfRegisterTool
     */
    public Tool_Register_Edit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroup1 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jlbNombreHerramienta1 = new javax.swing.JLabel();
        jbnEditar1 = new javax.swing.JButton();
        rbtnConsumible = new javax.swing.JRadioButton();
        jlbTipo1 = new javax.swing.JLabel();
        jlbID1 = new javax.swing.JLabel();
        jlbCantidad1 = new javax.swing.JLabel();
        txtNameTool = new javax.swing.JTextField();
        jbnEditar2 = new javax.swing.JButton();
        jlbTitulo1 = new javax.swing.JLabel();
        rbtnUtilizable = new javax.swing.JRadioButton();
        barAmount = new javax.swing.JScrollBar();
        btnBack = new javax.swing.JButton();
        jlbNumero1 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        jlbID2 = new javax.swing.JLabel();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Herramienta");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jlbNombreHerramienta1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlbNombreHerramienta1.setForeground(new java.awt.Color(255, 255, 255));
        jlbNombreHerramienta1.setText("Nombre de la Herramienta");

        jbnEditar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbnEditar1.setForeground(new java.awt.Color(0, 102, 102));
        jbnEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jbnEditar1.setToolTipText("Añadir");

        buttonGroup1.add(rbtnConsumible);
        rbtnConsumible.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnConsumible.setForeground(new java.awt.Color(204, 204, 204));
        rbtnConsumible.setText("Consumible");
        rbtnConsumible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnConsumibleActionPerformed(evt);
            }
        });

        jlbTipo1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlbTipo1.setForeground(new java.awt.Color(255, 255, 255));
        jlbTipo1.setText("Tipo:");

        jlbID1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlbID1.setForeground(new java.awt.Color(255, 255, 255));
        jlbID1.setText("Costo:");

        jlbCantidad1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlbCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        jlbCantidad1.setText("Cantidad");

        txtNameTool.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNameTool.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbnEditar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbnEditar2.setForeground(new java.awt.Color(0, 102, 102));
        jbnEditar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jbnEditar2.setToolTipText("Editar");

        jlbTitulo1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jlbTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitulo1.setText("Registrar / Editar Herramienta");

        buttonGroup1.add(rbtnUtilizable);
        rbtnUtilizable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnUtilizable.setForeground(new java.awt.Color(204, 204, 204));
        rbtnUtilizable.setText("Utilizable");

        barAmount.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        barAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnBack.setToolTipText("Regresar");

        jlbNumero1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlbNumero1.setForeground(new java.awt.Color(0, 102, 102));
        jlbNumero1.setText("#");

        txtCost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCost.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jlbID2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlbID2.setForeground(new java.awt.Color(255, 255, 255));
        jlbID2.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlbCantidad1)
                                            .addGap(0, 61, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jlbID1)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jlbNumero1)
                                    .addGap(62, 62, 62))
                                .addComponent(barAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbNombreHerramienta1)
                                    .addComponent(txtNameTool, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlbID2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(96, 96, 96)
                                            .addComponent(jlbTipo1)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rbtnConsumible)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rbtnUtilizable))))
                                .addComponent(jlbTitulo1)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbnEditar1)
                        .addGap(18, 18, 18)
                        .addComponent(jbnEditar2)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(106, 106, 106))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbNombreHerramienta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNameTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbID2)
                    .addComponent(jlbTipo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnConsumible)
                    .addComponent(rbtnUtilizable))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jlbNumero1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jlbCantidad1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbID1)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(barAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbnEditar1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBack))
                    .addComponent(jbnEditar2))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnConsumibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnConsumibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnConsumibleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar barAmount;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbnEditar1;
    private javax.swing.JButton jbnEditar2;
    private javax.swing.JLabel jlbCantidad1;
    private javax.swing.JLabel jlbID1;
    private javax.swing.JLabel jlbID2;
    private javax.swing.JLabel jlbNombreHerramienta1;
    private javax.swing.JLabel jlbNumero1;
    private javax.swing.JLabel jlbTipo1;
    private javax.swing.JLabel jlbTitulo1;
    private javax.swing.ButtonGroup rbGroup1;
    private javax.swing.JRadioButton rbtnConsumible;
    private javax.swing.JRadioButton rbtnUtilizable;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNameTool;
    // End of variables declaration//GEN-END:variables
}
