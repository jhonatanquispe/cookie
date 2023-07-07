
package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Menu extends javax.swing.JFrame {
ImageIcon icon= new  ImageIcon(getClass().getResource("/img/logoventasperu.jpg"));
Image image=icon.getImage();
    
    public Menu() {
        initComponents();                
        jDesktopPanePrincipal.setVisible(true);
        setTitle("Sistema de ventas");
        
        
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_exit = new javax.swing.JMenuItem();
        jMenu_Workers = new javax.swing.JMenu();
        jMenuItemWorkerRwgister = new javax.swing.JMenuItem();
        jMenu_Clients = new javax.swing.JMenu();
        jMenuItemClient_Register = new javax.swing.JMenuItem();
        jMenuProducto = new javax.swing.JMenu();
        jMenuItemProducto_Register = new javax.swing.JMenuItem();
        jMenuSales = new javax.swing.JMenu();
        jMenuItemSales_Register = new javax.swing.JMenuItem();
        jMenuItemSalesReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1900, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 976, Short.MAX_VALUE)
        );

        jMenu_File.setText("File");

        jMenuItem_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_exit.setText("Exit");
        jMenuItem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_exitActionPerformed(evt);
            }
        });
        jMenu_File.add(jMenuItem_exit);

        jMenuBar.add(jMenu_File);

        jMenu_Workers.setText("Workers");
        jMenu_Workers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_WorkersActionPerformed(evt);
            }
        });

        jMenuItemWorkerRwgister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemWorkerRwgister.setText("Register");
        jMenuItemWorkerRwgister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemWorkerRwgisterActionPerformed(evt);
            }
        });
        jMenu_Workers.add(jMenuItemWorkerRwgister);

        jMenuBar.add(jMenu_Workers);

        jMenu_Clients.setText("Clients");

        jMenuItemClient_Register.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemClient_Register.setText("Register");
        jMenuItemClient_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClient_RegisterActionPerformed(evt);
            }
        });
        jMenu_Clients.add(jMenuItemClient_Register);

        jMenuBar.add(jMenu_Clients);

        jMenuProducto.setText("Producto");

        jMenuItemProducto_Register.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemProducto_Register.setText("Register");
        jMenuItemProducto_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProducto_RegisterActionPerformed(evt);
            }
        });
        jMenuProducto.add(jMenuItemProducto_Register);

        jMenuBar.add(jMenuProducto);

        jMenuSales.setText("Sales");

        jMenuItemSales_Register.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSales_Register.setText("SalesRegister");
        jMenuItemSales_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSales_RegisterActionPerformed(evt);
            }
        });
        jMenuSales.add(jMenuItemSales_Register);

        jMenuItemSalesReporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSalesReporte.setText("Sales Report");
        jMenuItemSalesReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalesReporteActionPerformed(evt);
            }
        });
        jMenuSales.add(jMenuItemSalesReporte);

        jMenuBar.add(jMenuSales);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void paintComponent(Graphics g){
            g.drawImage(image,0,0,getWidth(),getHeight(),this);
    }
    
    private void jMenuItem_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_exitActionPerformed
  
    private void jMenuItemWorkerRwgisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemWorkerRwgisterActionPerformed
        
        JIFWorkerGUI jwk= new JIFWorkerGUI();
                
        jwk.setLocation(180, 100);
        //jDesktopPanePrincipal.removeAll();
        jDesktopPanePrincipal.add(jwk);
        jwk.show();
        
    }//GEN-LAST:event_jMenuItemWorkerRwgisterActionPerformed

    
    
    private void jMenu_WorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_WorkersActionPerformed

               
    }//GEN-LAST:event_jMenu_WorkersActionPerformed
    
    private void jMenuItemClient_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClient_RegisterActionPerformed

        
        JIFClientGUI  jcl= new JIFClientGUI();
               
        jcl.setLocation(225, 100);
        //jDesktopPanePrincipal.removeAll();
        jDesktopPanePrincipal.add(jcl);
        jcl.show();  
    }//GEN-LAST:event_jMenuItemClient_RegisterActionPerformed

    private void jMenuItemSales_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSales_RegisterActionPerformed
        
            JIFSalesGUI jsales= new JIFSalesGUI();
            
            jsales.setLocation(400, 100);
            //jDesktopPanePrincipal.removeAll();
            jDesktopPanePrincipal.add(jsales);
            jsales.show();

    }//GEN-LAST:event_jMenuItemSales_RegisterActionPerformed

    private void jMenuItemProducto_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProducto_RegisterActionPerformed

        JIFProductoGUI  jprod= new JIFProductoGUI();
        
        jprod.setLocation(400, 100);
        //jDesktopPanePrincipal.removeAll();
        jDesktopPanePrincipal.add(jprod);
        jprod.show();


    }//GEN-LAST:event_jMenuItemProducto_RegisterActionPerformed

    private void jMenuItemSalesReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalesReporteActionPerformed
        
        reporteventas re = new reporteventas();
        
        re.setLocation(70, 100);
        //jDesktopPanePrincipal.removeAll();
        jDesktopPanePrincipal.add(re);
        re.show();
        
    }//GEN-LAST:event_jMenuItemSalesReporteActionPerformed

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
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemClient_Register;
    private javax.swing.JMenuItem jMenuItemProducto_Register;
    private javax.swing.JMenuItem jMenuItemSalesReporte;
    private javax.swing.JMenuItem jMenuItemSales_Register;
    private javax.swing.JMenuItem jMenuItemWorkerRwgister;
    private javax.swing.JMenuItem jMenuItem_exit;
    private javax.swing.JMenu jMenuProducto;
    private javax.swing.JMenu jMenuSales;
    private javax.swing.JMenu jMenu_Clients;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Workers;
    // End of variables declaration//GEN-END:variables
}
