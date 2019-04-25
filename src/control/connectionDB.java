package control;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.logging.*;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement; 
import javax.swing.*;


public class connectionDB {
    public Connection conn= null;
    public Statement stm = null;
    private ResultSet rs = null;
    private ArrayList<ctrlMurid> ctrlMurids = new ArrayList<>();
    public void connect(){
         try{          
           String url = "jdbc:mysql://localhost/admin";              
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/admin","yogiex","Henshin913");
           stm = conn.createStatement();         
          }
         catch(SQLException ex){
           Logger.getLogger(ctrlMurid.class.getName()).log(Level.SEVERE,null,ex);
           
        }   
        
    }}
  
     
