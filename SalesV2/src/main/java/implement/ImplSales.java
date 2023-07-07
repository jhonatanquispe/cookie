package implement;


import conexion.ConnS;
import entities.DetailSales;
import entities.Person;
import entities.Producto;
import entities.Sales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplSales {
    
    ConnS intance = ConnS.getInstance();
    Connection conexion = intance.getConnection();
    PreparedStatement ps;
    PreparedStatement ps2;
    ResultSet rs;
    Connection connect;
       
    String sql="";
    String sql2="";
    Statement stmt=null; 
    ResultSet rset=null;
    
    
    ArrayList<Producto> listnomprod = new ArrayList<>();
    
    ArrayList<DetailSales> listadetalleventas = new ArrayList<>();
    
    public int numeroVta(String serie){
        int n=0;
        try {
        
            sql=" select max(vta_numeroventa)+1 from ventas "    
               +" where vta_serie= '"+serie+"'";
               
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){               
                
                n=rs.getInt(1);
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return n;
    }
    
    
    public int registrarSales(Sales sales){
    
        int exec = 0;
        int i = 0; 
        
        try {
            sql = " insert into ventas "+
                    " values ('"+sales.getSales_id()+"', "
                    + "  '"+sales.getSales_tipocomprobante()+"',"
                    + "  '"+sales.getSales_serie()+"',"
                    + "  '"+sales.getSales_numeroventa()+"', "
                    //+ "  now(), "
                    + "  '2022-12-20', "
                    + "  '"+sales.getSales_importetotal()+"',"
                    + "  '"+sales.getSales_client().getPerson_nombres()+"',"
                    + "  'trabajador' )";
                        
            ps = conexion.prepareStatement(sql);
            System.out.println(""+ sales.getSales_client().getPerson_nombres());                       
                        
            for(DetailSales dv : sales.getListDetailSales()){
                
                System.out.println("en el impl"+dv.getDetailsales_cantidad());
                sql2 = " insert into detalle_vtas "
                      +" values('"+dv.getDetailsales_id()+"',"
                      +" '"+dv.getDetailsales_cantidad()+"',"
                      +" '"+dv.getDetailsales_descripcion()+"',"
                      +" '"+dv.getDetailsales_preciounitario()+"',"
                      +" '"+dv.getDetailsales_precioitem()+"',"
                      +"'"+sales.getSales_id()+"')  ";
                ps2 = conexion.prepareStatement(sql2);
                System.out.println("()"+sql2);  
                               
                ps.executeUpdate();
                ps2.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImplSales.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return exec;   
        
    }
    
    
    public ArrayList<Producto> reporteProducto(){
         listnomprod = new ArrayList<Producto>();
         
        try {
            
            String sql="";
            sql=" select * from producto";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto pr = new Producto();
                
                pr.setProd_nombre(rs.getString(2));
               
                
                listnomprod.add(pr);
                
                
                
            }   
        } catch (SQLException ex) {
            Logger.getLogger(ImplSales.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listnomprod;
    }
    
 
    public ArrayList<DetailSales> reporteVentaconDetalle(){
        listadetalleventas = new ArrayList<>();
        try {
            sql=" select a.*, b.* from ventas a, detalle_vtas b " 
                +" where a.vta_id=b.dvta_vta_id";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                DetailSales vdv = new DetailSales();
                
                vdv.setSales_id(rs.getString("vta_id"));
                vdv.setSales_tipocomprobante(rs.getString(2));
                vdv.setSales_serie(rs.getString(3));
                vdv.setSales_numeroventa(rs.getString(4));
                vdv.setSales_fecha(rs.getDate(5));
                vdv.setSales_importetotal(rs.getDouble(6));
                //vdv.setPerson_nombres(rset.getString(7));
                //worker.setWorker_nombres(rset.getString(8));
                vdv.setDetailsales_id(rs.getString(9));
                vdv.setDetailsales_cantidad(rs.getDouble(10));
                vdv.setDetailsales_descripcion(rs.getString(11));
                vdv.setDetailsales_preciounitario(rs.getDouble(12));
                vdv.setDetailsales_precioitem(rs.getDouble(13));
                vdv.setSales_id(rs.getString(14));
                listadetalleventas.add(vdv);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listadetalleventas;
    }
    
     
    
    
}