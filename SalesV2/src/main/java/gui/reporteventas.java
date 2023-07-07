/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import entities.DetailSales;
import implement.ImplSales;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class reporteventas extends javax.swing.JInternalFrame {
DefaultTableModel modelo;

    ImplSales ips = new ImplSales();
    /**
     * Creates new form reporteventas
     */
    public reporteventas() {
        initComponents();
        ReporteDataDB();
        
    }

     public void ReporteDataDB(){
               
            modelo = new DefaultTableModel();
            modelo.addColumn("Venta id");
            modelo.addColumn("Tipo comprobante");
            modelo.addColumn("Serie");
            modelo.addColumn("Numero venta");
            modelo.addColumn("Fecha");
            modelo.addColumn("Importe total");
            modelo.addColumn("Cliente");
            modelo.addColumn("Trabajador");
            modelo.addColumn("Detalle venta id");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Producto");
            modelo.addColumn("Precio unitario");
            modelo.addColumn("Precio subtotal");
            modelo.addColumn("Venta detalle venta id");

                for (DetailSales vdv : ips.reporteVentaconDetalle()) {
                    Object[] fila = new Object[14];
                    fila[0] = vdv.getSales_id();
                    fila[1] = vdv.getSales_tipocomprobante();
                    fila[2] = vdv.getSales_serie();
                    fila[3] = vdv.getSales_numeroventa();
                    fila[4] = vdv.getSales_fecha();
                    fila[5] = vdv.getSales_importetotal();
                    fila[6] = "Cliente";
                    fila[7] = "Trabajador";
                    fila[8] = vdv.getDetailsales_id();
                    fila[9] = vdv.getDetailsales_cantidad();
                    fila[10] = vdv.getDetailsales_descripcion();
                    fila[11] = vdv.getDetailsales_preciounitario();
                    fila[12] = vdv.getDetailsales_precioitem();
                    fila[13] = vdv.getSales_id();

                    modelo.addRow(fila);
                }
                
            jTable_reporteventas.setModel(modelo); 
        
           
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_reporteventas = new javax.swing.JTable();

        jTable_reporteventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Venta id", "Tipo comprobante", "Serie", "Numero venta", "Fecha", "Importe total", "Cliente", "Trabajador", "Detalle venta id", "Cantidad", "Producto", "Precio unitario", "Precio subtotal", "Venta detalle venta id"
            }
        ));
        jScrollPane1.setViewportView(jTable_reporteventas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1738, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_reporteventas;
    // End of variables declaration//GEN-END:variables
}
