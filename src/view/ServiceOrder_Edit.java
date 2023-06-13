/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author nerif
 */
public class ServiceOrder_Edit extends javax.swing.JInternalFrame {

    /**
     * Creates new form ServiceOrder_Edit
     */
    public ServiceOrder_Edit() {
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

        btngEstados = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        txtCliente = new javax.swing.JTextField();
        txtNCelular = new javax.swing.JTextField();
        txtFSalida = new javax.swing.JTextField();
        txtFEntrega = new javax.swing.JTextField();
        lblPedido = new javax.swing.JLabel();
        rbtnEspera = new javax.swing.JRadioButton();
        lblCliente = new javax.swing.JLabel();
        rbtnProceso = new javax.swing.JRadioButton();
        lblCelular = new javax.swing.JLabel();
        rbtnTerminado = new javax.swing.JRadioButton();
        lblEstado = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        lblFechaEntrega = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        txtNPedido = new javax.swing.JTextField();
        jlbTitulo = new javax.swing.JLabel();

        setTitle("Editar - Orden de Servicio");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        lblPedido.setForeground(new java.awt.Color(0, 102, 102));
        lblPedido.setText("Número de pedido:");

        btngEstados.add(rbtnEspera);
        rbtnEspera.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtnEspera.setForeground(new java.awt.Color(102, 102, 102));
        rbtnEspera.setText("En espera");

        lblCliente.setForeground(new java.awt.Color(0, 102, 102));
        lblCliente.setText("Cliente:");

        btngEstados.add(rbtnProceso);
        rbtnProceso.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtnProceso.setForeground(new java.awt.Color(102, 102, 102));
        rbtnProceso.setText("En proceso");
        rbtnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProcesoActionPerformed(evt);
            }
        });

        lblCelular.setForeground(new java.awt.Color(0, 102, 102));
        lblCelular.setText("Número de celular:");

        btngEstados.add(rbtnTerminado);
        rbtnTerminado.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtnTerminado.setForeground(new java.awt.Color(102, 102, 102));
        rbtnTerminado.setText("Terminado");
        rbtnTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTerminadoActionPerformed(evt);
            }
        });

        lblEstado.setForeground(new java.awt.Color(0, 102, 102));
        lblEstado.setText("Estado:");

        lblFechaSalida.setForeground(new java.awt.Color(0, 102, 102));
        lblFechaSalida.setText("Fecha de pedido:");

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 102, 102));
        btnEdit.setText("Editar");

        lblFechaEntrega.setForeground(new java.awt.Color(0, 102, 102));
        lblFechaEntrega.setText("Fecha de entrega:");

        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(0, 102, 102));
        btnReturn.setText("Volver");

        jlbTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(0, 102, 102));
        jlbTitulo.setText("Editar Orden de Servicio");

        jDesktopPane1.setLayer(txtCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtFSalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtFEntrega, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rbtnEspera, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rbtnProceso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(rbtnTerminado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblFechaSalida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEdit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblFechaEntrega, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnReturn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlbTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblCelular)
                        .addGap(18, 18, 18)
                        .addComponent(txtNCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblEstado)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnEspera)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnProceso)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnTerminado))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblFechaSalida)
                        .addGap(18, 18, 18)
                        .addComponent(txtFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lblFechaEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(txtFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlbTitulo)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(lblPedido)
                            .addGap(18, 18, 18)
                            .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnEdit)
                        .addGap(49, 49, 49)
                        .addComponent(btnReturn)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedido)
                    .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtNCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(rbtnEspera)
                    .addComponent(rbtnProceso)
                    .addComponent(rbtnTerminado))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSalida)
                    .addComponent(txtFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaEntrega)
                    .addComponent(txtFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnReturn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProcesoActionPerformed

    }//GEN-LAST:event_rbtnProcesoActionPerformed

    private void rbtnTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTerminadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTerminadoActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReturn;
    private javax.swing.ButtonGroup btngEstados;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JRadioButton rbtnEspera;
    private javax.swing.JRadioButton rbtnProceso;
    private javax.swing.JRadioButton rbtnTerminado;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFEntrega;
    private javax.swing.JTextField txtFSalida;
    private javax.swing.JTextField txtNCelular;
    private javax.swing.JTextField txtNPedido;
    // End of variables declaration//GEN-END:variables
}
