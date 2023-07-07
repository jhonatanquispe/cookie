package implement;


import conexion.ConnS;

import entities.Client;
import entities.Person;
import entities.Worker;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import resources.Resources;



public class ImplPerson {
    
    ConnS intance = ConnS.getInstance();
    Connection conexion = intance.getConnection();
    PreparedStatement ps;
    PreparedStatement ps2;
    ResultSet rs;
    Connection connect;
    
    ArrayList<Worker> lista= new ArrayList<>();
    String sql="";
    String sql2="";
    Statement stmt=null; 
    ResultSet rset=null;
    
    Resources resource= new Resources();
    ArrayList<Worker> listaworkers = new ArrayList<>();
    ArrayList<Client> listaClient = new ArrayList<>();
 
    
    public int registrarPerson(Worker w){
        
        int exec = 0;
        int i = 0;
        
        try {
            sql = " insert into person ( person_id, person_nombres, person_paterno, person_materno, person_nro_di, person_usuario, person_password) "+
                  " values ('"+w.getPerson_id()+"','"+w.getPerson_nombres()+"','"+w.getPerson_paterno()+"','"+w.getPerson_materno()+"','"+w.getPerson_nro_di()+"','"+w.getPerson_usuario()+"','"+w.getPerson_password()+"' ) ";
                        
            
            ps = conexion.prepareStatement(sql);
            
            
            
            sql2 = " insert into worker ( worker_id, worker_salario, worker_codigotrabajador, worker_person_id  ) "+
                   " values ('"+w.getWorker_id()+"','"+w.getWorker_salario()+"','"+w.getWorker_codigotrabajador()+"','"+w.getPerson_id()+"' ) ";
            
            ps2 = conexion.prepareStatement(sql2);
    
            ps.executeUpdate();
            ps2.executeUpdate();
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
        
        return exec;
    }
    
    
    public int registrarPerson(Client c){
        
        int exec = 0;
        int i = 0;
        
        try {
            sql = " insert into person ( person_id, person_nombres, person_paterno, person_materno, person_nro_di, person_usuario, person_password) "+
                  " values ('"+c.getPerson_id()+"','"+c.getPerson_nombres()+"','"+c.getPerson_paterno()+"','"+c.getPerson_materno()+"','"+c.getPerson_nro_di()+"','"+c.getPerson_usuario()+"','"+c.getPerson_password()+"' ) ";   
            
            ps = conexion.prepareStatement(sql);
                
            
            
            sql2 = " insert into client ( client_id, client_codigocliente, client_tipo, client_person_id  ) "+
                   " values ('"+c.getClient_id()+"','"+c.getClient_codigocliente() +"','"+c.getClient_tipo()+"','"+c.getPerson_id()+"' ) ";
            
            ps2 = conexion.prepareStatement(sql2);
    
            ps.executeUpdate();
            ps2.executeUpdate();
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }      
        
        return exec;
    }
    
    public Person validateLogin(Person p){
        //falta conectar a db             
        Person us = null;
        try{
           String sql=" select * from person "+
                " where person_usuario='"+p.getPerson_usuario()+"'   "+
                " and  person_password='"+p.getPerson_password()+"'  ";
            
           ps=conexion.prepareStatement(sql);
           
            rs=ps.executeQuery();
            
            if(rs.next()){
              us = new Person();
              us.setPerson_usuario(rs.getString("person_usuario"));
              us.setPerson_password(rs.getString("person_password"));              
              
            }else {
              us= null;
            }
            
            
            
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
        
        System.out.println("----este es de la db: "+ p.getPerson_usuario()+"  " + p.getPerson_password() + "dfsssssss" );
        
        return us;
                
        
    }
    
    public ArrayList<Worker> reporteWorkers(){
        listaworkers = new ArrayList<>();
        try {
            sql=" select a.*, b.* from person a, worker b " 
                +" where a.person_id=b.worker_person_id";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Worker ps = new Worker();
                ps.setPerson_id(rs.getString("person_id"));
                ps.setPerson_nombres(rs.getString(2));
                ps.setPerson_paterno(rs.getString(3));
                ps.setPerson_materno(rs.getString(4));
                ps.setPerson_nro_di(rs.getString(5));
                ps.setPerson_usuario(rs.getString(6));
                ps.setPerson_password(rs.getString(7));
                ps.setWorker_id(rs.getString(8));
                ps.setWorker_salario(rs.getDouble(9));
                ps.setWorker_codigotrabajador(rs.getString(10));
                ps.setWorker_person_id(rs.getString(11));
                listaworkers.add(ps);            
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listaworkers;
    }
    
    
    
        public ArrayList<Client> reporteClients(){
        listaClient = new ArrayList<>();
        try {
            
            sql=" select a.*, b.* from person a, client b " 
                +" where a.person_id=b.client_person_id";    
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Client ps = new Client();
                ps.setPerson_id(rs.getString(1));
                ps.setPerson_nombres(rs.getString(2));
                ps.setPerson_paterno(rs.getString(3));
                ps.setPerson_materno(rs.getString(4));
                ps.setPerson_nro_di(rs.getString(5));
                //ps.setPerson_usuario(rset.getString(6));
                //ps.setPerson_password(rset.getString(7));
                ps.setClient_id(rs.getString(8));
                ps.setClient_codigocliente(rs.getString(9));
                ps.setClient_tipo(rs.getString(10));
                ps.setClient_person_id(rs.getString(11));
                listaClient.add(ps);  
                
            }
        } catch (SQLException ex) {
                ex.getMessage();
        }
        return listaClient;
    }
    
    
    public int ActualizarPerson(Worker w){        
            
            int exec = 0;
        int i = 0;
        try {
            sql = " update person "+
                  " set person_nombres= '"+w.getPerson_nombres()+"' "+  
                  " , person_paterno= '"+w.getPerson_paterno()+"'"+
                  " , person_materno= '"+w.getPerson_materno()+"'"+
                  " , person_nro_di= '"+w.getPerson_nro_di()+"'"+
                  " , person_usuario= '"+w.getPerson_usuario()+"'"+
                  " , person_password= '"+w.getPerson_password()+"'"+
                  " where person_id='"+w.getPerson_id()+"' ";
                  
                  
            ps = conexion.prepareStatement(sql);
            
                sql2 = " update worker "+
                  " set worker_codigotrabajador= '"+w.getWorker_codigotrabajador()+"' "+
                  " , worker_salario= '"+w.getWorker_salario()+"'"+
                  " where worker_person_id='"+w.getPerson_id()+"' ";
                  System.out.print(sql2); 
            ps2 = conexion.prepareStatement(sql2);
            
           
            ps.executeUpdate();
            ps2.executeUpdate();
            
            
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
        
        return exec;
    }
    
    
    
    public int ActualizarPerson(Client c){        
            int exec = 0;
        int i = 0;  
        try {
            sql = " update person "+
                  " set person_nombres= '"+c.getPerson_nombres()+"' "+  
                  " , person_paterno= '"+c.getPerson_paterno()+"'"+
                  " , person_materno= '"+c.getPerson_materno()+"'"+
                  " , person_nro_di= '"+c.getPerson_nro_di()+"'"+
                  " , person_usuario= '"+c.getPerson_usuario()+"'"+
                  " , person_password= '"+c.getPerson_password()+"'"+
                  " where person_id='"+c.getPerson_id()+"' ";
                  
                  
             ps = conexion.prepareStatement(sql);
            
            
                sql2 = " update client "+
                  " set client_codigocliente= '"+c.getClient_codigocliente()+"', client_tipo='"+c.getClient_tipo()+"' "+  
                  " where client_person_id='"+c.getPerson_id()+"' ";
                  System.out.print(sql2); 
            ps2 = conexion.prepareStatement(sql2);
            
           
            ps.executeUpdate();
            ps2.executeUpdate();
            
            
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
        
        return exec;
    }
    public int EliminarPerson(Worker w){
       int exec = 0;
        int i = 0;  
        try {
            sql = " delete from person "+
                  " where person_id='"+w.getPerson_id()+"' ";
                  
                        
            ps = conexion.prepareStatement(sql);
            
            sql2 = " delete from worker "+
                  " where worker_person_id='"+w.getPerson_id()+"' ";
                  
                       
            ps2 = conexion.prepareStatement(sql2);
            
            ps.executeUpdate();
            ps2.executeUpdate();
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
        
        return exec;
    }
    
    public int EliminarPerson(Client c){
    int exec = 0;
        int i = 0;  
        try {
            sql = " delete from person "+
                  " where person_id='"+c.getPerson_id()+"' ";
                  
                       
            ps = conexion.prepareStatement(sql);
            
            
            sql2 = " delete from client "+
                  " where client_person_id='"+c.getPerson_id()+"' ";
                  
                       
            ps2 = conexion.prepareStatement(sql2);
            
            ps.executeUpdate();
            ps2.executeUpdate();
        }catch (SQLException ex) {
            System.out.println("capturando"+ex.getMessage()); 
        }
        
        return exec;
    }
    
}
