package view;

import controller.Client_queue;
import controller.Refacts_queue;
import controller.ServiceOrder_stack;
import controller.Service_stack;
import controller.Tools_stack;
import javax.swing.ImageIcon;

/**
 *
 * @author Beto
 */
public class Menu extends javax.swing.JFrame {

    //INICIALIZAR TODAS LAS PILAS Y COLAS
    ServiceOrder_stack stack_so = new ServiceOrder_stack();
    Service_stack stack_s = new Service_stack();
    Tools_stack stack_t = new Tools_stack();
    
    Client_queue queue_c = new Client_queue();
    Refacts_queue queue_r = new Refacts_queue();
    ImageIcon icono = new ImageIcon("src/img/logo.png");
    
    
    public Menu() {
        this.setIconImage(icono.getImage());
        initComponents();
    }
    
    public Menu(String user) {
        this.setIconImage(icono.getImage());
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpMenu = new javax.swing.JDesktopPane();
        jlbLogo = new javax.swing.JLabel();
        jbnSalir = new javax.swing.JButton();
        jlbTituloMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRefacts = new javax.swing.JMenu();
        jMIAddRefacts = new javax.swing.JMenuItem();
        jMIEditRefacts = new javax.swing.JMenuItem();
        jMISearchRefacts = new javax.swing.JMenuItem();
        jMIDeleteRefacts = new javax.swing.JMenuItem();
        jMenuServiceOrder = new javax.swing.JMenu();
        jMIAddOrderService = new javax.swing.JMenuItem();
        jMIEditOrderService = new javax.swing.JMenuItem();
        jMISearchOrderService = new javax.swing.JMenuItem();
        jMIDeleteOrderService = new javax.swing.JMenuItem();
        jMenuServices = new javax.swing.JMenu();
        jMIAddService = new javax.swing.JMenuItem();
        jMIEditService = new javax.swing.JMenuItem();
        jMISearchService = new javax.swing.JMenuItem();
        jMIDeleteService = new javax.swing.JMenuItem();
        jMenuTools = new javax.swing.JMenu();
        jMIAddTool = new javax.swing.JMenuItem();
        jMIEditTool = new javax.swing.JMenuItem();
        jMISearchTool = new javax.swing.JMenuItem();
        jMIDeleteTool = new javax.swing.JMenuItem();
        jMenuClient = new javax.swing.JMenu();
        jMIAddClient = new javax.swing.JMenuItem();
        jMIEditClient = new javax.swing.JMenuItem();
        jMISearchClient = new javax.swing.JMenuItem();
        jMIDeleteClient = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jdpMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sstech.png"))); // NOI18N

        jbnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log out.png"))); // NOI18N
        jbnSalir.setText("Salir");
        jbnSalir.setToolTipText("Salir");
        jbnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        jlbTituloMenu.setBackground(new java.awt.Color(255, 255, 255));
        jlbTituloMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jlbTituloMenu.setForeground(new java.awt.Color(0, 102, 102));
        jlbTituloMenu.setText("Menú");

        jdpMenu.setLayer(jlbLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpMenu.setLayer(jbnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpMenu.setLayer(jlbTituloMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpMenuLayout = new javax.swing.GroupLayout(jdpMenu);
        jdpMenu.setLayout(jdpMenuLayout);
        jdpMenuLayout.setHorizontalGroup(
            jdpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpMenuLayout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addGroup(jdpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpMenuLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jlbTituloMenu))
                    .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(399, 399, 399))
        );
        jdpMenuLayout.setVerticalGroup(
            jdpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTituloMenu)
                .addGap(18, 18, 18)
                .addComponent(jlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, Short.MAX_VALUE)
                .addComponent(jbnSalir)
                .addGap(54, 54, 54))
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuRefacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refacts.png"))); // NOI18N
        jMenuRefacts.setText("Refacciones");
        jMenuRefacts.setToolTipText("");
        jMenuRefacts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMIAddRefacts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIAddRefacts.setForeground(new java.awt.Color(0, 102, 102));
        jMIAddRefacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMIAddRefacts.setText("Registrar");
        jMIAddRefacts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMIAddRefacts.setFocusPainted(true);
        jMIAddRefacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAddRefactsActionPerformed(evt);
            }
        });
        jMenuRefacts.add(jMIAddRefacts);

        jMIEditRefacts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIEditRefacts.setForeground(new java.awt.Color(0, 102, 102));
        jMIEditRefacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jMIEditRefacts.setText("Editar");
        jMIEditRefacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditRefactsActionPerformed(evt);
            }
        });
        jMenuRefacts.add(jMIEditRefacts);

        jMISearchRefacts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMISearchRefacts.setForeground(new java.awt.Color(0, 102, 102));
        jMISearchRefacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        jMISearchRefacts.setText("Buscar");
        jMISearchRefacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISearchRefactsActionPerformed(evt);
            }
        });
        jMenuRefacts.add(jMISearchRefacts);

        jMIDeleteRefacts.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIDeleteRefacts.setForeground(new java.awt.Color(0, 102, 102));
        jMIDeleteRefacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMIDeleteRefacts.setText("Eliminar");
        jMIDeleteRefacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeleteRefactsActionPerformed(evt);
            }
        });
        jMenuRefacts.add(jMIDeleteRefacts);

        jMenuBar1.add(jMenuRefacts);

        jMenuServiceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/serviceorder.png"))); // NOI18N
        jMenuServiceOrder.setText("Orden de Servicio");
        jMenuServiceOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMIAddOrderService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIAddOrderService.setForeground(new java.awt.Color(0, 102, 102));
        jMIAddOrderService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMIAddOrderService.setText("Registrar");
        jMIAddOrderService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAddOrderServiceActionPerformed(evt);
            }
        });
        jMenuServiceOrder.add(jMIAddOrderService);

        jMIEditOrderService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIEditOrderService.setForeground(new java.awt.Color(0, 102, 102));
        jMIEditOrderService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jMIEditOrderService.setText("Editar");
        jMIEditOrderService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditOrderServiceActionPerformed(evt);
            }
        });
        jMenuServiceOrder.add(jMIEditOrderService);

        jMISearchOrderService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMISearchOrderService.setForeground(new java.awt.Color(0, 102, 102));
        jMISearchOrderService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        jMISearchOrderService.setText("Buscar");
        jMISearchOrderService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISearchOrderServiceActionPerformed(evt);
            }
        });
        jMenuServiceOrder.add(jMISearchOrderService);

        jMIDeleteOrderService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIDeleteOrderService.setForeground(new java.awt.Color(0, 102, 102));
        jMIDeleteOrderService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMIDeleteOrderService.setText("Eliminar");
        jMIDeleteOrderService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeleteOrderServiceActionPerformed(evt);
            }
        });
        jMenuServiceOrder.add(jMIDeleteOrderService);

        jMenuBar1.add(jMenuServiceOrder);

        jMenuServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/services.png"))); // NOI18N
        jMenuServices.setText("Servicios");
        jMenuServices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMIAddService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIAddService.setForeground(new java.awt.Color(0, 102, 102));
        jMIAddService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMIAddService.setText("Registrar");
        jMIAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAddServiceActionPerformed(evt);
            }
        });
        jMenuServices.add(jMIAddService);

        jMIEditService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIEditService.setForeground(new java.awt.Color(0, 102, 102));
        jMIEditService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jMIEditService.setText("Editar");
        jMIEditService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditServiceActionPerformed(evt);
            }
        });
        jMenuServices.add(jMIEditService);

        jMISearchService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMISearchService.setForeground(new java.awt.Color(0, 102, 102));
        jMISearchService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        jMISearchService.setText("Buscar");
        jMISearchService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISearchServiceActionPerformed(evt);
            }
        });
        jMenuServices.add(jMISearchService);

        jMIDeleteService.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIDeleteService.setForeground(new java.awt.Color(0, 102, 102));
        jMIDeleteService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMIDeleteService.setText("Eliminar");
        jMIDeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeleteServiceActionPerformed(evt);
            }
        });
        jMenuServices.add(jMIDeleteService);

        jMenuBar1.add(jMenuServices);

        jMenuTools.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tools.png"))); // NOI18N
        jMenuTools.setText("Herramientas");
        jMenuTools.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMIAddTool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIAddTool.setForeground(new java.awt.Color(0, 102, 102));
        jMIAddTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMIAddTool.setText("Registrar");
        jMIAddTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAddToolActionPerformed(evt);
            }
        });
        jMenuTools.add(jMIAddTool);

        jMIEditTool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIEditTool.setForeground(new java.awt.Color(0, 102, 102));
        jMIEditTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jMIEditTool.setText("Editar");
        jMIEditTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditToolActionPerformed(evt);
            }
        });
        jMenuTools.add(jMIEditTool);

        jMISearchTool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMISearchTool.setForeground(new java.awt.Color(0, 102, 102));
        jMISearchTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        jMISearchTool.setText("Buscar");
        jMISearchTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISearchToolActionPerformed(evt);
            }
        });
        jMenuTools.add(jMISearchTool);

        jMIDeleteTool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIDeleteTool.setForeground(new java.awt.Color(0, 102, 102));
        jMIDeleteTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMIDeleteTool.setText("Eliminar");
        jMIDeleteTool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeleteToolActionPerformed(evt);
            }
        });
        jMenuTools.add(jMIDeleteTool);

        jMenuBar1.add(jMenuTools);

        jMenuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/client.png"))); // NOI18N
        jMenuClient.setText("Cliente");
        jMenuClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMIAddClient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIAddClient.setForeground(new java.awt.Color(0, 102, 102));
        jMIAddClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jMIAddClient.setText("Registrar");
        jMIAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAddClientActionPerformed(evt);
            }
        });
        jMenuClient.add(jMIAddClient);

        jMIEditClient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIEditClient.setForeground(new java.awt.Color(0, 102, 102));
        jMIEditClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jMIEditClient.setText("Editar");
        jMIEditClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditClientActionPerformed(evt);
            }
        });
        jMenuClient.add(jMIEditClient);

        jMISearchClient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMISearchClient.setForeground(new java.awt.Color(0, 102, 102));
        jMISearchClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        jMISearchClient.setText("Buscar");
        jMISearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISearchClientActionPerformed(evt);
            }
        });
        jMenuClient.add(jMISearchClient);

        jMIDeleteClient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMIDeleteClient.setForeground(new java.awt.Color(0, 102, 102));
        jMIDeleteClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jMIDeleteClient.setText("Eliminar");
        jMIDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDeleteClientActionPerformed(evt);
            }
        });
        jMenuClient.add(jMIDeleteClient);

        jMenuBar1.add(jMenuClient);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAddRefactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAddRefactsActionPerformed
        Refacts_Register_Edit rafactsRegister = new Refacts_Register_Edit();
        jdpMenu.add(rafactsRegister);
        rafactsRegister.show();
    }//GEN-LAST:event_jMIAddRefactsActionPerformed

    private void jMISearchRefactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISearchRefactsActionPerformed
        Refacts_Search rafactsSearch = new Refacts_Search();
        jdpMenu.add(rafactsSearch);
        rafactsSearch.show();
    }//GEN-LAST:event_jMISearchRefactsActionPerformed

    private void jMIAddOrderServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAddOrderServiceActionPerformed
        ServiceOrder_Register_Edit serviceOrderRegister = new ServiceOrder_Register_Edit(null, stack_so);
        jdpMenu.add(serviceOrderRegister);
        serviceOrderRegister.show();
    }//GEN-LAST:event_jMIAddOrderServiceActionPerformed

    private void jMIAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAddServiceActionPerformed
        Service_Register_Edit serviceRegister = new Service_Register_Edit(null, stack_s);
        jdpMenu.add(serviceRegister);
        serviceRegister.show();
    }//GEN-LAST:event_jMIAddServiceActionPerformed

    private void jMIDeleteToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeleteToolActionPerformed
        Tool_Delete toolDelete = new Tool_Delete();
        jdpMenu.add(toolDelete);
        toolDelete.show();
    }//GEN-LAST:event_jMIDeleteToolActionPerformed

    private void jMISearchToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISearchToolActionPerformed
        Tool_Search toolSearch = new Tool_Search();
        jdpMenu.add(toolSearch);
        toolSearch.show();
    }//GEN-LAST:event_jMISearchToolActionPerformed

    private void jMIEditRefactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditRefactsActionPerformed
        Refacts_Register_Edit rafactsEdit = new Refacts_Register_Edit();
        jdpMenu.add(rafactsEdit);
        rafactsEdit.show();
    }//GEN-LAST:event_jMIEditRefactsActionPerformed

    private void jMIDeleteRefactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeleteRefactsActionPerformed
        Refacts_Delete rafactsDelete = new Refacts_Delete();
        jdpMenu.add(rafactsDelete);
        rafactsDelete.show();
    }//GEN-LAST:event_jMIDeleteRefactsActionPerformed

    private void jMIEditOrderServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditOrderServiceActionPerformed
        ServiceOrder_Register_Edit serviceOrderEdit = new ServiceOrder_Register_Edit(null, stack_so);
        jdpMenu.add(serviceOrderEdit);
        serviceOrderEdit.show();
    }//GEN-LAST:event_jMIEditOrderServiceActionPerformed

    private void jMISearchOrderServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISearchOrderServiceActionPerformed
        ServiceOrder_Search serviceOrderSearch = new ServiceOrder_Search(null, stack_so);
        jdpMenu.add(serviceOrderSearch);
        serviceOrderSearch.show();
    }//GEN-LAST:event_jMISearchOrderServiceActionPerformed

    private void jMIDeleteOrderServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeleteOrderServiceActionPerformed
        ServiceOrder_Delete serviceOrderDelete  = new ServiceOrder_Delete();
        jdpMenu.add(serviceOrderDelete);
        serviceOrderDelete.show();
    }//GEN-LAST:event_jMIDeleteOrderServiceActionPerformed

    private void jMIEditServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditServiceActionPerformed
        Service_Register_Edit serviceEdit = new Service_Register_Edit(null, stack_s);
        jdpMenu.add(serviceEdit);
        serviceEdit.show();
    }//GEN-LAST:event_jMIEditServiceActionPerformed

    private void jMISearchServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISearchServiceActionPerformed
        Service_Search serviceSearch = new Service_Search();
        jdpMenu.add(serviceSearch);
        serviceSearch.show();
    }//GEN-LAST:event_jMISearchServiceActionPerformed

    private void jMIDeleteServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeleteServiceActionPerformed
        Service_Delete serviceDelete = new Service_Delete();
        jdpMenu.add(serviceDelete);
        serviceDelete.show();
    }//GEN-LAST:event_jMIDeleteServiceActionPerformed

    private void jMIAddToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAddToolActionPerformed
        Tool_Register_Edit toolRegister = new Tool_Register_Edit();
        jdpMenu.add(toolRegister);
        toolRegister.show();
    }//GEN-LAST:event_jMIAddToolActionPerformed

    private void jMIEditToolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditToolActionPerformed
        Tool_Register_Edit toolEdit = new Tool_Register_Edit();
        jdpMenu.add(toolEdit);
        toolEdit.show();
    }//GEN-LAST:event_jMIEditToolActionPerformed

    private void jMIAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAddClientActionPerformed
        Client_Register_Edit clientRegister = new Client_Register_Edit();
        jdpMenu.add(clientRegister);
        clientRegister.show();
    }//GEN-LAST:event_jMIAddClientActionPerformed

    private void jMIEditClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditClientActionPerformed
        Client_Register_Edit clientEdit = new Client_Register_Edit();
        jdpMenu.add(clientEdit);
        clientEdit.show();
    }//GEN-LAST:event_jMIEditClientActionPerformed

    private void jMISearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISearchClientActionPerformed
        Client_Search clientSearch = new Client_Search();
        jdpMenu.add(clientSearch);
        clientSearch.show();
    }//GEN-LAST:event_jMISearchClientActionPerformed

    private void jMIDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDeleteClientActionPerformed
        Client_Delete clientDelete = new Client_Delete();
        jdpMenu.add(clientDelete);
        clientDelete.show();
    }//GEN-LAST:event_jMIDeleteClientActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        Login login = new Login();
        login.setIconImage(icono.getImage());
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMIAddClient;
    private javax.swing.JMenuItem jMIAddOrderService;
    private javax.swing.JMenuItem jMIAddRefacts;
    private javax.swing.JMenuItem jMIAddService;
    private javax.swing.JMenuItem jMIAddTool;
    private javax.swing.JMenuItem jMIDeleteClient;
    private javax.swing.JMenuItem jMIDeleteOrderService;
    private javax.swing.JMenuItem jMIDeleteRefacts;
    private javax.swing.JMenuItem jMIDeleteService;
    private javax.swing.JMenuItem jMIDeleteTool;
    private javax.swing.JMenuItem jMIEditClient;
    private javax.swing.JMenuItem jMIEditOrderService;
    private javax.swing.JMenuItem jMIEditRefacts;
    private javax.swing.JMenuItem jMIEditService;
    private javax.swing.JMenuItem jMIEditTool;
    private javax.swing.JMenuItem jMISearchClient;
    private javax.swing.JMenuItem jMISearchOrderService;
    private javax.swing.JMenuItem jMISearchRefacts;
    private javax.swing.JMenuItem jMISearchService;
    private javax.swing.JMenuItem jMISearchTool;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClient;
    private javax.swing.JMenu jMenuRefacts;
    private javax.swing.JMenu jMenuServiceOrder;
    private javax.swing.JMenu jMenuServices;
    private javax.swing.JMenu jMenuTools;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JDesktopPane jdpMenu;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbTituloMenu;
    // End of variables declaration//GEN-END:variables
}
