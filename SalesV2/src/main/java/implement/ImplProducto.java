package implement;


import conexion.ConnS;
import entities.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import resources.Resources;

public class ImplProducto {
    
    ConnS intance = ConnS.getInstance();
    Connection conexion = intance.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    Connection connect;
    
    Producto prod= new Producto();
    Resources resources= new Resources();
    Statement stmt=null; 
    ResultSet rset=null;
    
    ArrayList<Producto> lisProducto = new ArrayList<>();
    
    String sql="";
    
    public int AddProducto(Producto pr){
        
         int exec = 0;
        int i = 0;
        
        try {
            sql = "insert into producto"
                    + " values ('"+pr.getProd_id()+"','"+pr.getProd_nombre()+"','"+pr.getProd_stock()+"','"+pr.getProd_precioveta()+"','"+pr.getProd_preciocompra()+"') ";            
            
            ps = conexion.prepareStatement(sql);
            
            exec = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImplProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return exec;
    }
            
    
    
    public ArrayList<Producto> reporteProductos(){
    lisProducto = new ArrayList<Producto>();
    
    try {
            sql=" select * from producto";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto pr = new Producto();
                pr.setProd_id(rs.getString(1));
                pr.setProd_nombre(rs.getString(2));
                pr.setProd_stock(rs.getString(3));
                pr.setProd_precioveta(rs.getDouble(4));
                pr.setProd_preciocompra(rs.getDouble(5));
                
                
                lisProducto.add(pr);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return lisProducto;
    
    }
    
    public int ActualizarProducto(Producto pr){        
             int exec = 0;
        int i = 0;  
        try {
            sql = " update producto "+
                  " set producto_nombre= '"+pr.getProd_nombre()+"' "+  
                  " , producto_stock= '"+pr.getProd_stock()+"'"+
                  " , producto_precioventa= '"+pr.getProd_precioveta()+"'"+
                  " , producto_preciocompra= '"+pr.getProd_preciocompra()+"'"+
                  " where prod_id='"+pr.getProd_id()+"' ";
                  
                  
            ps = conexion.prepareStatement(sql);
            
            exec = ps.executeUpdate();
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
        
        return exec;
    }
    
    public int EliminarProducto(Producto pr){
    
        int exec = 0;
        int i = 0;  
        try {
            sql = " delete from producto "+
                  " where prod_id='"+pr.getProd_id()+"' ";
                  
                        
            ps = conexion.prepareStatement(sql);
            
            exec = ps.executeUpdate();
            
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
        
        return exec;
        
    }
    
    
    
    
}
