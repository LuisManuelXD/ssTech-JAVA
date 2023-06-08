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
        lblEditar = new javax.swing.JLabel();
        lblPedido = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        lblFechaEntrega = new javax.swing.JLabel();
        txtNPedido = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtNCelular = new javax.swing.JTextField();
        txtFSalida = new javax.swing.JTextField();
        txtFEntrega = new javax.swing.JTextField();
        rbtnEspera = new javax.swing.JRadioButton();
        rbtnProceso = new javax.swing.JRadioButton();
        rbtnTerminado = new javax.swing.JRadioButton();
        btnFiller = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setTitle("Editar - Orden de Servicio");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        lblEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(0, 102, 102));
        lblEditar.setText("Editar");

        lblPedido.setForeground(new java.awt.Color(0, 102, 102));
        lblPedido.setText("Número de pedido:");

        lblCliente.setForeground(new java.awt.Color(0, 102, 102));
        lblCliente.setText("Cliente:");

        lblCelular.setForeground(new java.awt.Color(0, 102, 102));
        lblCelular.setText("Número de celular:");

        lblEstado.setForeground(new java.awt.Color(0, 102, 102));
        lblEstado.setText("Estado:");

        lblFechaSalida.setForeground(new java.awt.Color(0, 102, 102));
        lblFechaSalida.setText("Fecha de pedido:");

        lblFechaEntrega.setForeground(new java.awt.Color(0, 102, 102));
        lblFechaEntrega.setText("Fecha de entrega:");

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

        btngEstados.add(rbtnTerminado);
        rbtnTerminado.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rbtnTerminado.setForeground(new java.awt.Color(102, 102, 102));
        rbtnTerminado.setText("Terminado");
        rbtnTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTerminadoActionPerformed(evt);
            }
        });

        btnFiller.setText("Rellenar");

        btnEdit.setText("Editar");

        btnReturn.setText("Volver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lblEditar))
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
                        .addGap(43, 43, 43)
                        .addComponent(btnFiller)
                        .addGap(48, 48, 48)
                        .addComponent(btnEdit)
                        .addGap(49, 49, 49)
                        .addComponent(btnReturn)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditar)
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
                    .addComponent(btnFiller)
                    .addComponent(btnEdit)
                    .addComponent(btnReturn))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProcesoActionPerformed

    }//GEN-LAST:event_rbtnProcesoActionPerformed

    private void rbtnTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTerminadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTerminadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFiller;
    private javax.swing.JButton btnReturn;
    private javax.swing.ButtonGroup btngEstados;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEditar;
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