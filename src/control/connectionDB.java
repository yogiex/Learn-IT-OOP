package control;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.logging.*;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement; 


public class connectionDB {
    private Connection conn= null;
    private Statement stm = null;
    private ResultSet rs = null;
    private ArrayList<ctrlMurid> ctrlMurids = new ArrayList<>();
    public void connection(){
        try{
           String url="jdbc:mysql://localhost/admin"; //sesuaikan dengan yang ada di databasenya
           String user="yogiex"; //nama user
           String pass="Henshin913"; //nama pass   word user
           Class.forName("com.mysql.jdbc.Driver");
          //Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin",user,pass);
           stm = conn.createStatement();
           JOptionPane.showMessageDialog(null, "Connected");
    
    
        }catch(SQLException ex){
           Logger.getLogger(ctrlMurid.class.getName()).log(Level.SEVERE,null,ex);
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(connectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
}
