package gui;

import entities.Client;
import implement.ImplPerson;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.Resources;


public class JIFClientGUI extends javax.swing.JInternalFrame {
    
    ButtonGroup grupoRadio = new ButtonGroup();
    ImplPerson ip = new ImplPerson();  
    DefaultTableModel modelo;
    
    public JIFClientGUI(String title) {
        super(title);
    }

    
    public JIFClientGUI() {
        initComponents();
        ReporteDataDB();
        
        jTextField_id.setVisible(false);
        jButtonActualizar.setVisible(false);
        jButtonEliminar.setVisible(false);
        Client pp = new Client();
        System.out.println("aqui"+pp.getPerson_nombres());
    }

    public void ReporteDataDB(){
        System.out.println("Reporte de desde db");
        
            modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Paterno");
            modelo.addColumn("Materno");
            modelo.addColumn("Ruc / Dni");
            //modelo.addColumn("Usuario");
            //modelo.addColumn("Contraseña");
            modelo.addColumn("Id Cliente");
            modelo.addColumn("Codigo Cliente");
            modelo.addColumn("Tipo");
            modelo.addColumn("Id Cliente Persona");
            modelo.addColumn("Id");
            
            

                for (Client pers : ip.reporteClients()) {
                    Object[] fila = new Object[9];
                    fila[0] = pers.getPerson_nombres();
                    fila[1] = pers.getPerson_paterno();
                    fila[2] = pers.getPerson_materno();
                    fila[3] = pers.getPerson_nro_di();
                    //fila[4] = pers.getPerson_usuario();
                    //fila[5] = pers.getPerson_password();
                    fila[4] = pers.getClient_id();
                    fila[5] = pers.getClient_codigocliente();
                    fila[6] = pers.getClient_tipo();
                    fila[7] = pers.getClient_person_id();
                    fila[8] = pers.getPerson_id();
                    
                    modelo.addRow(fila);
                }
            jTableClientes.setModel(modelo); 
        
           
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        jPanelFormulario = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_paterno = new javax.swing.JLabel();
        jLabel_materno = new javax.swing.JLabel();
        jLabel_nro = new javax.swing.JLabel();
        jLabel_codiog_cliente = new javax.swing.JLabel();
        jTextField_nombres = new javax.swing.JTextField();
        jTextField_materno = new javax.swing.JTextField();
        jTextField_paterno = new javax.swing.JTextField();
        jTextField_numero = new javax.swing.JTextField();
        jTextField_codigo_cliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel_nro3 = new javax.swing.JLabel();
        jRadioButtonNatural = new javax.swing.JRadioButton();
        jRadioButtonJuridica = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jTextField_id = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButton_grabar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario Cliente");

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_titulo.setText("Formulario Cliente");
        jLabel_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nombre.setText("Nombres:");

        jLabel_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_paterno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_paterno.setText("Ap. Paterno:");

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_materno.setText("Ap. Materno:");

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro.setText("Nro Ruc / Dni:");

        jLabel_codiog_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_codiog_cliente.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_codiog_cliente.setText("Codigo Cliente:");

        jTextField_codigo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codigo_clienteActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel_nro3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro3.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro3.setText("Tipo Cliente:");

        buttonGroupTipo.add(jRadioButtonNatural);
        jRadioButtonNatural.setText("Persona Natural");
        jRadioButtonNatural.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonNaturalMouseClicked(evt);
            }
        });

        buttonGroupTipo.add(jRadioButtonJuridica);
        jRadioButtonJuridica.setText("Persona Juridica");
        jRadioButtonJuridica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonJuridicaMouseClicked(evt);
            }
        });
        jRadioButtonJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonJuridicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_nro3)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButtonNatural, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtonJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonJuridica)
                    .addComponent(jLabel_nro3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFormularioLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_paterno)
                            .addComponent(jLabel_nombre)
                            .addComponent(jLabel_materno)
                            .addComponent(jLabel_nro)
                            .addComponent(jLabel_codiog_cliente))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_nombres)
                            .addComponent(jTextField_materno, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextField_paterno, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextField_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextField_codigo_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_paterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_materno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_codigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_codiog_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Paterno", "Materno", "Ruc / Dni", "Id Cliente", "Codigo Cliente", "Tipo", "Id Cliente Persona", "Id"
            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jButtonLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(204, 102, 0));
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(204, 102, 0));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(204, 102, 0));
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButton_grabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_grabar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_grabar.setText("Grabar");
        jButton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_grabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButtonLimpiar))
                            .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_grabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminar)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_grabarActionPerformed
        Resources resource= new Resources();
        
        String tp="";
        
        if(jRadioButtonNatural.isSelected()){            tp="Natural";        }
        if(jRadioButtonJuridica.isSelected()){            tp="Juridica";        }
        
        if(!tp.equals("")){                
            
            if((jTextField_nombres.getText().equals("")||
                jTextField_paterno.getText().equals("")||
                jTextField_materno.getText().equals("")||
                jTextField_codigo_cliente.getText().equals("")||
                jTextField_numero.getText().equals(""))
            ){
                JOptionPane.showMessageDialog(null, "Ingrese los datos completos");

            }else{

                Client  c = new Client();
                c.setClient_id("C"+resource.generaID());
                c.setClient_codigocliente("C - "+jTextField_codigo_cliente.getText());
                c.setClient_tipo(tp);
                c.setPerson_id("P"+resource.generaID());
                c.setPerson_nombres(jTextField_nombres.getText());
                c.setPerson_paterno(jTextField_paterno.getText());
                c.setPerson_materno(jTextField_materno.getText());
                c.setPerson_nro_di(jTextField_numero.getText());
                c.setPerson_usuario("USER*CLIENTE");
                c.setPerson_password("***PSW-CLI***");
                

                ip.registrarPerson(c);
                ReporteDataDB();
                JOptionPane.showMessageDialog(null, "Se registro de manera satisfactoria");
                limpiarJTextField();
            }
        }else{
                JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        }
    }//GEN-LAST:event_jButton_grabarActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        
        int row = 0;
        String tp="";
        row=jTableClientes.getSelectedRow();
        
        jTextField_nombres.setText( jTableClientes.getValueAt(row, 0).toString());
        jTextField_paterno.setText( jTableClientes.getValueAt(row, 1).toString());
        jTextField_materno.setText( jTableClientes.getValueAt(row, 2).toString());
        jTextField_numero.setText( jTableClientes.getValueAt(row, 3).toString());
        jTextField_codigo_cliente.setText(jTableClientes.getValueAt(row, 5).toString());
        jTextField_id.setText(jTableClientes.getValueAt(row, 8).toString());
        
        tp=jTableClientes.getValueAt(row, 6).toString();
        if(tp.equals("Natural")){
            //jRadioButtonNatural.isSelected();
            buttonGroupTipo.setSelected(jRadioButtonNatural.getModel(), true);
        }
        if(tp.equals("Juridica")){
            //jRadioButtonJuridica.isSelected();
            buttonGroupTipo.setSelected(jRadioButtonJuridica.getModel(), true);
        }
        
        jButton_grabar.setVisible(false);
        jButtonActualizar.setVisible(true);
        jButtonEliminar.setVisible(true);
        
        
        
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        
        if(jRadioButtonNatural.isSelected()){            tipo="Natural";        }
        if(jRadioButtonJuridica.isSelected()){            tipo="Juridica";        }
        
        if(jTextField_id.getText().equals("")||
          jTextField_nombres.getText().equals("")||
          jTextField_paterno.getText().equals("")||
          jTextField_materno.getText().equals("")||
          jTextField_numero.getText().equals("")||
          jTextField_codigo_cliente.getText().equals("")|| 
          tipo.equals("")){
          
          JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
       
       
       }else{ 
           Client  c = new Client();          
                c.setPerson_id(jTextField_id.getText());
                c.setPerson_nombres(jTextField_nombres.getText());
                c.setPerson_paterno(jTextField_paterno.getText());
                c.setPerson_materno(jTextField_materno.getText());
                c.setPerson_nro_di(jTextField_numero.getText());
                c.setPerson_usuario("USER*CLIENTE");
                c.setPerson_password("***PSW***");
                c.setClient_codigocliente(jTextField_codigo_cliente.getText());
                c.setClient_tipo(tipo);
                
                ip.ActualizarPerson(c);
                ReporteDataDB();
                JOptionPane.showMessageDialog(null, "Se actualizo de manera satisfactoria");
                limpiarJTextField();
        
        
        
        }
                                   
    }//GEN-LAST:event_jButtonActualizarActionPerformed
    
    String tipo="";
    
    public void getTipo(String radio){
        tipo=radio;
    }
    
    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        if(jTextField_id.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Id vacio, ingrese el id o sino seleccione la fila a eliminar" );
            
        }else{
            
        Client c = new Client();
        c.setPerson_id(jTextField_id.getText());
        ip.EliminarPerson(c);
        //ip.EliminarCliente(jTextField_id.getText());
        Clear_Table1();
        ReporteDataDB();
        JOptionPane.showMessageDialog(null, "Se Elimino de manera satisfactoria");
        limpiarJTextField();
        
        }
        
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    
    public void Clear_Table1(){         
        modelo.removeTableModelListener(jTableClientes);
        jTableClientes.removeAll();
    }
    
    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiarJTextField();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jRadioButtonJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonJuridicaActionPerformed

    }//GEN-LAST:event_jRadioButtonJuridicaActionPerformed

    private void jRadioButtonJuridicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonJuridicaMouseClicked
        getTipo("Juridica");
    }//GEN-LAST:event_jRadioButtonJuridicaMouseClicked

    private void jRadioButtonNaturalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonNaturalMouseClicked
       getTipo("Natural");
    }//GEN-LAST:event_jRadioButtonNaturalMouseClicked

    private void jTextField_codigo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codigo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codigo_clienteActionPerformed
    public void limpiarJTextField(){
            jTextField_id.setText("");
            jTextField_nombres.setText("");
            jTextField_paterno.setText("");
            jTextField_materno.setText("");
            jTextField_numero.setText("");
            jTextField_codigo_cliente.setText("");
            buttonGroupTipo.clearSelection();
            jButton_grabar.setVisible(true);
            jButtonActualizar.setVisible(false);
            jButtonEliminar.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButton_grabar;
    private javax.swing.JLabel jLabel_codiog_cliente;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_nro3;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JRadioButton jRadioButtonJuridica;
    private javax.swing.JRadioButton jRadioButtonNatural;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextField_codigo_cliente;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_materno;
    private javax.swing.JTextField jTextField_nombres;
    private javax.swing.JTextField jTextField_numero;
    private javax.swing.JTextField jTextField_paterno;
    // End of variables declaration//GEN-END:variables
}
