import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class funciones extends mysql {
  
    
    public void insertar(String usuario, String passs) throws SQLException{
        this.abrir();
        String query="insert into login values(null,'"+usuario+"','"+passs+"')";
        ejecutar(query);
        this.cerrar();
    }
    
    void agregarNuevo(String codigo, String nombre, String apellido, String edad, String domicilio,String turno) throws SQLException {
        
        this.abrir();
        
        String query ="insert into alumno values('"+codigo+"','"+nombre+"','"+apellido+"','"+edad+"','"+domicilio+"')";
        this.ejecutar(query);
        String query2="insert into ingles values ('"+codigo+"','"+"se desconoce"+"');";
        this.ejecutar(query2);
        String query3="insert into turno values ('"+codigo+"','"+turno+"');";
        this.ejecutar(query3);
        String query4="insert into orientacion values ('"+codigo+"','"+"se desconoce"+"');";
        this.ejecutar(query4);
        
        String query5="insert into serviciosocial values ('"+codigo+"','"+"se desconoce"+"','"+"se desconoce"+"');";
        this.ejecutar(query5);
        String query6="insert into tipodetitulacion values ('"+codigo+"','"+"se desconoce"+"');";
        this.ejecutar(query6);
        
        this.cerrar();
        
    }
    
    void ingresaAsignadas(String[] mat, String text) throws SQLException {
        this.abrir();
        for(int i =0;i<mat.length;i++){
        String query ="insert into asignadas values('"+text+"','"+mat[i]+"');";
        this.ejecutar(query);
        }
        this.cerrar();
    }
    
    void actualizaOrientacion(String codigoR,String orientacion) throws SQLException {
        this.abrir();
        String query ="update orientacion set nombreOrientacion='"+orientacion+"' where codigoAlumno='"+codigoR+"' ";
        this.ejecutar(query);
        this.cerrar();
    }
    
    void actualizaIngles(String codigoR,String ingles) throws SQLException {
        this.abrir();
        String query ="update ingles set aprovatorio='"+ingles+"' where codigoAlumno='"+codigoR+"' ";
        this.ejecutar(query);
        this.cerrar();
    }
    
    void actualizaservicio(String codigoR,String orientacion, String concluid) throws SQLException{
        this.abrir();
        String query ="update serviciosocial set serviciosocial.institucion='"+orientacion+"', serviciosocial.concluido = '"+concluid+"' where serviciosocial.codigoAlumno='"+codigoR+"' ";
        this.ejecutar(query);
        this.cerrar();
    }
    
    void enviarMensaje(String code, String mensaje) throws SQLException {
        this.abrir();
        String query = "insert into mensajes values (null, '"+mensaje+"','"+code+"');";
        this.ejecutar(query);
        this.cerrar();
    }
    
    public int login(String usuario,String contra) throws SQLException{
       ResultSet rs=null; 
       String Rusuario="";
       String Rcontra="";
       this.abrir();
       Statement cmd = con.createStatement();
       String Ruser="select user, pass from login where user='"+usuario+"' and pass='"+contra+"';";
       rs=cmd.executeQuery(Ruser);
       
       
       while (rs.next()) {
            Rusuario = rs.getString("user");
            Rcontra = rs.getString("pass");
       }
       rs.close();
       this.cerrar();
       if(usuario.equals(Rusuario) && contra.equals(Rcontra)){
           return 1;
       }
       
       else {
           
           return 2;
           
       }
       
       
    }
    
    
    
    
    
    public void ejecutar(String query) throws SQLException{
    
    Statement cmd = con.createStatement();
    cmd.executeUpdate(query);
    

    }

    public String lo(String codigo) throws SQLException {
       ResultSet rs=null; 
       String Rusuario="";
      
       this.abrir();
       Statement cmd = con.createStatement();
       String Ruser="select codigoAlumno from alumno where codigoalumno = '"+codigo+"'";
       rs=cmd.executeQuery(Ruser);
       
       
       while (rs.next()) {
            Rusuario = rs.getString("codigoAlumno");
            
       }
       rs.close();
       this.cerrar();
       
       return Rusuario;
       
    }

    public String cargarDatos(String code) throws SQLException {
         ResultSet rs=null; 
       String nombre="";
       String apellido="";
      
       this.abrir();
       Statement cmd = con.createStatement();
       String Ruser="select nombre, apellido from alumno where codigoalumno = '"+code+"'";
       rs=cmd.executeQuery(Ruser);
       
       
       while (rs.next()) {
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellido");
            
       }
       rs.close();
       this.cerrar();
       
       return nombre+" "+apellido;
    }

    int cuentamensajes() throws SQLException {
       ResultSet rs=null;
       int contador =0;
       this.abrir();
       Statement cmd = con.createStatement();
       String query="select count(*) from mensajes;";
       rs=cmd.executeQuery(query);
       while (rs.next()) {
            contador = rs.getInt("COUNT(*)");
       }
       
       
       this.cerrar();
       return contador;
    }

    

    

    

    

    
    
}
