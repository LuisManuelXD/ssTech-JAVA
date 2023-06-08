/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author nerif
 */
public class ServiceOrder_Delete extends javax.swing.JInternalFrame {

    /**
     * Creates new form ServiceOrder_Delete
     */
    public ServiceOrder_Delete() {
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
        lblEstado = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtNCelular = new javax.swing.JTextField();
        txtFSalida = new javax.swing.JTextField();
        txtFEntrega = new javax.swing.JTextField();
        rbtnEspera = new javax.swing.JRadioButton();
        rbtnProceso = new javax.swing.JRadioButton();
        lblFechaEntrega = new javax.swing.JLabel();
        rbtnTerminado = new javax.swing.JRadioButton();
        txtNPedido = new javax.swing.JTextField();
        lblEliminar = new javax.swing.JLabel();
        lblPedido = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnFiller = new javax.swing.JButton();

        setTitle("Eliminar - Orden de Servicio");

        lblEstado.setForeground(new java.awt.Color(0, 102, 102));
        lblEstado.setText("Estado:");

        lblFechaSalida.setForeground(new java.awt.Color(0, 102, 102));
        lblFechaSalida.setText("Fecha de pedido:");

        btngEstados.add(rbtnEspera);
        rbtnEspera.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtnEspera.setForeground(new java.awt.Color(102, 102, 102));
        rbtnEspera.setText("En espera");

        btngEstados.add(rbtnProceso);
        rbtnProceso.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtnProceso.setForeground(new java.awt.Color(102, 102, 102));
        rbtnProceso.setText("En proceso");
        rbtnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProcesoActionPerformed(evt);
            }
        });

        lblFechaEntrega.setForeground(new java.awt.Color(0, 102, 102));
        lblFechaEntrega.setText("Fecha de entrega:");

        btngEstados.add(rbtnTerminado);
        rbtnTerminado.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtnTerminado.setForeground(new java.awt.Color(102, 102, 102));
        rbtnTerminado.setText("Terminado");
        rbtnTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTerminadoActionPerformed(evt);
            }
        });

        lblEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(0, 102, 102));
        lblEliminar.setText("Eliminar");

        lblPedido.setForeground(new java.awt.Color(0, 102, 102));
        lblPedido.setText("Número de pedido:");

        lblCliente.setForeground(new java.awt.Color(0, 102, 102));
        lblCliente.setText("Cliente:");

        lblCelular.setForeground(new java.awt.Color(0, 102, 102));
        lblCelular.setText("Número de celular:");

        btnDelete.setText("Eliminar");

        btnReturn.setText("Volver");

        btnFiller.setText("Rellenar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCelular)
                        .addGap(18, 18, 18)
                        .addComponent(txtNCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPedido)
                        .addGap(18, 18, 18)
                        .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEstado)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnEspera)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnProceso)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnTerminado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaSalida)
                        .addGap(18, 18, 18)
                        .addComponent(txtFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFechaEntrega)
                        .addGap(18, 18, 18)
                        .addComponent(txtFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lblEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnFiller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(46, 46, 46)
                .addComponent(btnReturn)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPedido)
                    .addComponent(txtNPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtNCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(rbtnEspera)
                    .addComponent(rbtnProceso)
                    .addComponent(rbtnTerminado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSalida)
                    .addComponent(txtFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaEntrega)
                    .addComponent(txtFEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnReturn)
                    .addComponent(btnFiller))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProcesoActionPerformed

    }//GEN-LAST:event_rbtnProcesoActionPerformed

    private void rbtnTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTerminadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTerminadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFiller;
    private javax.swing.JButton btnReturn;
    private javax.swing.ButtonGroup btngEstados;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEliminar;
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
