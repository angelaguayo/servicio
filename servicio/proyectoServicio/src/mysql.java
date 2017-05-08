import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class mysql {
    
    public String db = "servicio";
    public String url = "jdbc:mysql://localhost:3306/"+db;
    public String user = "root";
    public String pass = "";
    Connection con = null;
    public void abrir() throws SQLException{
    

       try{
            Class.forName("org.gjt.mm.mysql.Driver");

           con=(Connection) DriverManager.getConnection(this.url, this.user, this.pass);

       }catch(ClassNotFoundException | SQLException ex){

           JOptionPane.showMessageDialog(null, ex);

       }    
    }
    
    public void cerrar() throws SQLException{
    con.close();
    this.con=null;
    }
    
}