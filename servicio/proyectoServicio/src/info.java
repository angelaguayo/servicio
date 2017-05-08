
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angelaguayo
 */
public class info extends javax.swing.JFrame {

    /**
     * Creates new form info
     */
    public String codigoperron;
    
    DefaultTableModel  modeloTabla;
    DefaultTableModel  modeloTabla2;
    
    
    public info() {
        
        modeloTabla = new DefaultTableModel(null,getColumnas());
        modeloTabla2 = new DefaultTableModel(null,getColumnas2());
        initComponents();
        
        this.getContentPane().setBackground(Color.white);
        
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
        jTable1 = new javax.swing.JTable();
        txtcodigo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(0, 153, 153));
        jTable1.setModel(modeloTabla);
        jScrollPane1.setViewportView(jTable1);

        txtcodigo.setText("jLabel1");

        jTable2.setBackground(new java.awt.Color(0, 153, 153));
        jTable2.setModel(modeloTabla2);
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("datos personales");

        jLabel2.setText("datos complementarios titulacion");

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ver materias");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtcodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            homeAdmin ho = new homeAdmin();
        } catch (SQLException ex) {
            Logger.getLogger(info.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        //ho.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       materiasPorAlumno mat = new materiasPorAlumno();
       
       mat.pasa(txtcodigo.getText());
       mat.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    public String[] getColumnas(){
        
        String columna[]= new String[]{"codigo","nombre","apellido","edad","domicilio"};
        
    return columna;
}
    public String[] getColumnas2(){
        
        String columna[]= new String[]{"nombreOrientacion","institucion de servicio","servicio social","ingles"};
        
    return columna;
}
    
    private void setFilas(){
    //__________________________________
        Connection con = null; 
              Statement  stmt = null; 
              codigoperron=txtcodigo.getText();
              String sql = "select codigo,nombre,apellido,edad,domicilio"
                      + " from alumno "
                      + "where codigoAlumno = '"+codigoperron+"';";
              System.out.println(""+sql);
              String sql2 = "SELECT * FROM `alumno` WHERE codigoAlumno = "+codigoperron+"";
              try { 
                  String url = "jdbc:mysql://localhost:3306/servicio"; 
                  String usuario = "root"; 
                  String contraseña = ""; 
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                  con = DriverManager.getConnection(url,usuario,contraseña); 
                   PreparedStatement us = con.prepareStatement(sql2);
            try (ResultSet res = us.executeQuery()) {
                Object datos[]=new Object[5];
                while(res.next()){
                    for(int i =0;i<5;i++){
                        datos[i] = res.getObject(i+1);
                    }   
                    modeloTabla.addRow(datos);
                }
                res.close();
                //stmt = con.createStatement(); 
            }
                  } 
                  catch( SQLException e ) { 
                  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(homeAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } 
  
              finally { 
                  if ( con != null ) { 
                      try    { 
                          con.close(); 
                          stmt.close(); 
                      } catch( Exception e ) { 
                          System.out.println( e.getMessage()); 
                      } 
                  } 

   
    }
    }
    
    private void setFilas2(){
    //__________________________________
        Connection con = null; 
              Statement  stmt = null; 
              codigoperron=txtcodigo.getText();
              String sql = "";
              System.out.println(""+sql);
              String sql2 = "SELECT orientacion.nombreOrientacion,serviciosocial.concluido,serviciosocial.institucion,ingles.aprovatorio from orientacion, serviciosocial, ingles,alumno WHERE alumno.codigoAlumno = "+codigoperron+" and serviciosocial.codigoAlumno = alumno.codigoAlumno and orientacion.codigoAlumno = alumno.codigoAlumno and ingles.codigoAlumno = alumno.codigoAlumno";
              System.out.println(""+sql2);
              try { 
                  String url = "jdbc:mysql://localhost:3306/servicio"; 
                  String usuario = "root"; 
                  String contraseña = ""; 
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                  con = DriverManager.getConnection(url,usuario,contraseña); 
                   PreparedStatement us = con.prepareStatement(sql2);
            try (ResultSet res = us.executeQuery()) {
                Object datos[]=new Object[4];
                while(res.next()){
                    for(int i =0;i<4;i++){
                        datos[i] = res.getObject(i+1);
                    }   
                    modeloTabla2.addRow(datos);
                }
                res.close();
                //stmt = con.createStatement(); 
            }
                  } 
                  catch( SQLException e ) { 
                  } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(homeAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } 
  
              finally { 
                  if ( con != null ) { 
                      try    { 
                          con.close(); 
                          stmt.close(); 
                      } catch( Exception e ) { 
                          System.out.println( e.getMessage()); 
                      } 
                  } 

   
    }
    }
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel txtcodigo;
    // End of variables declaration//GEN-END:variables
    
    public void pasacodigo(String codigo){
    
        codigoperron = codigo ;
        txtcodigo.setText(""+codigoperron);
        setFilas();
        setFilas2();
    
    }


}


