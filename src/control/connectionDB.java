package control;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.logging.*;
public class connectionDB {
    private Connection conn= null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<ctrlMurid> ctrlMurids = new ArrayList<>();
    public void connection(){
        try{
            String url="jdbc:mysql://localhost/admin";
            String user="yogiex";
            String pass="Henshin913";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Connected");
    
    
        }catch(SQLException ex){
           Logger.getLogger(ctrlMurid.class.getName()).log(Level.SEVERE,null,ex);
    }
}
}
