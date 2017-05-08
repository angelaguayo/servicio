
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Observable;
import java.util.Random;
import java.util.TimerTask;
import java.util.logging.*;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public final class homeAdmin extends javax.swing.JFrame {

    DefaultTableModel  modeloTabla;
    JPopupMenu Pmenu;
    JMenuItem menuItem;
    
    public homeAdmin() throws SQLException {
        modeloTabla = new DefaultTableModel(null,getColumnas());
        Pmenu = new JPopupMenu();
        //
        
        //
        initComponents();
        this.getContentPane().setBackground(Color.white);
        setFilas();
        automatico a = new automatico();
        
        funciones fu = new funciones();
        lbmsj.setText(""+fu.cuentamensajes());
        
        JMenuItem infoMenuItem = new JMenuItem("info");
        infoMenuItem.setActionCommand("info");
        
        MenuItemListener menuItemListener = new MenuItemListener();
        infoMenuItem.addActionListener(menuItemListener);
        Pmenu.add(infoMenuItem);
        
       
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txcodigo = new javax.swing.JLabel();
        txnombre = new javax.swing.JLabel();
        txapellido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        busca = new javax.swing.JTextField();
        COMBO = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lbmsj = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("nuevo Alumno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("mostrar/actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 153, 153));
        jTable1.setModel(modeloTabla);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("seleccionado ");

        txcodigo.setText("------");

        txnombre.setText("------");

        txapellido.setText("-------");

        jLabel2.setText("codigo:");

        jLabel3.setText("nombre:");

        jLabel4.setText("apellido:");

        jButton3.setText("buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("doble clic para editar");

        busca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscaKeyTyped(evt);
            }
        });

        COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "videojuegos", "base de datos", "programacion" }));

        jButton4.setText("filtrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("mensajes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lbmsj.setBackground(new java.awt.Color(255, 255, 102));
        lbmsj.setText("jLabel6");

        jButton6.setText("enviar mensaje");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(lbmsj))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busca))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txcodigo)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txnombre)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txapellido)
                                .addGap(66, 66, 66)
                                .addComponent(jButton6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(lbmsj))
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txcodigo)
                    .addComponent(txnombre)
                    .addComponent(txapellido)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
           modeloTabla.removeRow(i);
           i-=1;
       }
        setFilas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        if(evt.getButton()== MouseEvent.BUTTON1){
            System.out.println(""+MouseEvent.BUTTON1);
			System.out.println("click izquierdo");         
		
        String codigo = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        
        String nombre = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 1);
       
        String apellido = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 2);
        
        txcodigo.setText(codigo);
        txnombre.setText(nombre);
        txapellido.setText(apellido);
        }
        
        if(evt.getButton()==MouseEvent.BUTTON3){
        try{
            
            System.out.println(""+MouseEvent.BUTTON3);
	
        Pmenu.show(evt.getComponent(), evt.getX(), evt.getY());
        
        String codigo1 = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        String nombre1 = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 1);
        String apellido1 = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 2);
        txcodigo.setText(codigo1);
        txnombre.setText(nombre1);
        txapellido.setText(apellido1);
        
                                    
        
                                    
            }catch(ArrayIndexOutOfBoundsException e){
               
        
            }
	}
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        agregar agregar = new agregar();
        agregar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        
         jTable1 = (JTable) evt.getSource();
        Point p = evt.getPoint();
        int row = jTable1.rowAtPoint(p);
        if (evt.getClickCount() == 2) {
            // your valueChanged overridden method 
            System.out.println("dos click");
        
        editarAlumno edit = new editarAlumno();
        try{
        String codigo = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        
        String nombre = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 1);
       
        String apellido = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 2);
        String orientacion = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 3);
        
        edit.pasaDatos(codigo,nombre,apellido);
        edit.setVisible(true);
        this.setVisible(false);
        }catch(ArrayIndexOutOfBoundsException e){
         System.out.println(e);
        }
        }
        else 
            System.out.println("un click");
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
        
        
        
        
    }//GEN-LAST:event_jTable1MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
           modeloTabla.removeRow(i);
           i-=1;
       }
        String busqueda = busca.getText();
        
    //__________________________________
        Connection con = null; 
              Statement  stmt = null; 
              
              String sql = "select alumno.codigoAlumno, alumno.nombre, alumno.apellido, nombreOrientacion "
                      +    "from alumno, orientacion"
                      + "   where orientacion.codigoAlumno=alumno.codigoAlumno and alumno.nombre like '"+busqueda+"%' ;";
              try { 
                  String url = "jdbc:mysql://localhost:3306/servicio"; 
                  String usuario = "root"; 
                  String contraseña = ""; 
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                  con = DriverManager.getConnection(url,usuario,contraseña); 
                   PreparedStatement us = con.prepareStatement(sql);
            try (ResultSet res = us.executeQuery()) {
                Object datos[]=new Object[4];
                while(res.next()){
                    for(int i =0;i<4;i++){
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
    
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaKeyTyped
        // TODO add your handling code here:
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
           modeloTabla.removeRow(i);
           i-=1;
       }
        String busqueda = busca.getText();
        
    //__________________________________
        Connection con = null; 
              Statement  stmt = null; 
              
              String sql = "select alumno.codigoAlumno, alumno.nombre, alumno.apellido, nombreOrientacion "
                      +    "from alumno, orientacion "
                      +    "where orientacion.codigoAlumno=alumno.codigoAlumno and alumno.nombre like '"+busqueda+"%' ;";
              try { 
                  String url = "jdbc:mysql://localhost:3306/servicio"; 
                  String usuario = "root"; 
                  String contraseña = ""; 
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                  con = DriverManager.getConnection(url,usuario,contraseña); 
                   PreparedStatement us = con.prepareStatement(sql);
            try (ResultSet res = us.executeQuery()) {
                Object datos[]=new Object[4];
                while(res.next()){
                    for(int i =0;i<4;i++){
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
        
        
    }//GEN-LAST:event_buscaKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        // C O M B O B O X
        
        String orientacion = COMBO.getSelectedItem().toString();
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
           modeloTabla.removeRow(i);
           i-=1;
       }
        
        
    //__________________________________
        Connection con = null; 
              Statement  stmt = null; 
              
              String sql = "select alumno.codigoAlumno, alumno.nombre, alumno.apellido, nombreOrientacion "
                      +    "from alumno, orientacion "
                      +    "where orientacion.codigoAlumno=alumno.codigoAlumno and orientacion.nombreOrientacion like '"+orientacion+"%' ;";
              try { 
                  String url = "jdbc:mysql://localhost:3306/servicio"; 
                  String usuario = "root"; 
                  String contraseña = ""; 
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                  con = DriverManager.getConnection(url,usuario,contraseña); 
                   PreparedStatement us = con.prepareStatement(sql);
            try (ResultSet res = us.executeQuery()) {
                Object datos[]=new Object[4];
                while(res.next()){
                    for(int i =0;i<4;i++){
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
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        mensajes msj = new mensajes();
        msj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JTextArea ta = new JTextArea(5, 15);
        ta.setLineWrap(true); 
        String mensaje="";
        switch (JOptionPane.showConfirmDialog(null, new JScrollPane(ta))) {
            case JOptionPane.OK_OPTION:
                System.out.println(ta.getText());
                mensaje=ta.getText();
                String code=txcodigo.getText();
                funciones fun = new funciones();
        {
            try {
                fun.enviarMensajeAlumno(code,mensaje);
            } catch (SQLException ex) {
                Logger.getLogger(homeAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;
        }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed
   

    public String[] getColumnas(){
        
        String columna[]= new String[]{"codigo","nombre","apellido","orientacion"};
        
    return columna;
}
    private void setFilas(){
    //__________________________________
        Connection con = null; 
              Statement  stmt = null; 
              
              String sql = "select alumno.codigoAlumno, alumno.nombre, alumno.apellido, nombreOrientacion "
                      +    "from alumno, orientacion"
                      + "   where orientacion.codigoAlumno=alumno.codigoAlumno;";
              try { 
                  String url = "jdbc:mysql://localhost:3306/servicio"; 
                  String usuario = "root"; 
                  String contraseña = ""; 
                  Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                  con = DriverManager.getConnection(url,usuario,contraseña); 
                   PreparedStatement us = con.prepareStatement(sql);
            try (ResultSet res = us.executeQuery()) {
                Object datos[]=new Object[4];
                while(res.next()){
                    for(int i =0;i<4;i++){
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
    
    public void cerrar(){
    this.dispose();
    } 
     
    //______________________________________
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
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new homeAdmin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(homeAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBO;
    private javax.swing.JTextField busca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbmsj;
    private javax.swing.JLabel txapellido;
    private javax.swing.JLabel txcodigo;
    private javax.swing.JLabel txnombre;
    // End of variables declaration//GEN-END:variables

class MenuItemListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {            
         //label.setText(e.getActionCommand() + " MenuItem clicked.");
         //JOptionPane.showMessageDialog(null, "ver todo");
         String codigoenviar = txcodigo.getText();
         
         homeAdmin ho = null;
          try {
              ho = new homeAdmin();
          } catch (SQLException ex) {
              Logger.getLogger(homeAdmin.class.getName()).log(Level.SEVERE, null, ex);
          }
         
         
         String codi;
         codi = txcodigo.getText();
         //ho.dispose();
         if(codi.equals("------"))
             JOptionPane.showMessageDialog(null, "debe haber algun alumno seleccionado");
         else
             {
         ho.cerrar();
         info inf = new info();
         
         inf.pasacodigo(codigoenviar);
         
         inf.setVisible(true);
         }
             
      }    
   }

public class automatico extends Observable{
         public automatico(){
             java.util.Timer timer = new java.util.Timer();
             timer.scheduleAtFixedRate(timerTask, 0,200);
         }
         TimerTask timerTask = new TimerTask(){
                    public void run() {
                        Color c = Color.BLACK;
                        Random rand = new Random();
                        int x = rand.nextInt(2) + 1;
                        switch (x) {
                            case 1 : c = Color.RED;break;
                            case 2 : c = Color.WHITE;break;
                            
                        }
                        lbmsj.setBackground(Color.YELLOW);
                        lbmsj.setForeground(c);
                        
                    }
         };
    }




}
