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
    public Connection con = null;
    public Statement stm = null;
    private ResultSet rs = null;
    private ArrayList<ctrlMurid> ctrlMurids = new ArrayList<>();
    private ArrayList<ctrlRegisTentor> ctrlRegisTentors = new ArrayList<>();
    
    public void connect() throws SQLException{
        String url ="jdbc:mysql://localhost/admin";
        con =DriverManager.getConnection( url ,"yogiex","Henshin913");   
//        stm = con.createStatement();
    }}
  
     
