/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leuraojedamecanicos;


import ConexionBD.ConexionMySQL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import mecanicos.SoloMayusculas;

/**
 *
 * @author Gerardo
 */
public class Nota extends javax.swing.JFrame {

    /**
     * Creates new form Nota
     */
    public Nota() {
        initComponents();
        Mostrar("");
        this.setLocationRelativeTo(null);
        EntradaPlaca.setDocument(new SoloMayusculas());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EtiquetaNotas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EntradaManoDeObra = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        EntradaRefaccionesT = new javax.swing.JTextArea();
        EntradaManoDeObraD = new javax.swing.JTextField();
        EntradaCostoR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EntradaNombre = new javax.swing.JTextField();
        EntradaIdCliente = new javax.swing.JTextField();
        EntradaApellidoP = new javax.swing.JTextField();
        EntradaIdVehiculo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EntradaApellidoM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        EntradaVehiculo = new javax.swing.JTextField();
        Placa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        EntradaIdIngresoV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        EntradaPlaca = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EtiquetaNotas.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        EtiquetaNotas.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaNotas.setText("Generar Nota");
        getContentPane().add(EtiquetaNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 260, 47));

        EntradaManoDeObra.setColumns(20);
        EntradaManoDeObra.setRows(5);
        jScrollPane1.setViewportView(EntradaManoDeObra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 560, 100));

        EntradaRefaccionesT.setColumns(20);
        EntradaRefaccionesT.setRows(5);
        jScrollPane2.setViewportView(EntradaRefaccionesT);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 560, 110));

        EntradaManoDeObraD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaManoDeObraDKeyTyped(evt);
            }
        });
        getContentPane().add(EntradaManoDeObraD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 400, 100, 30));

        EntradaCostoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaCostoRActionPerformed(evt);
            }
        });
        EntradaCostoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaCostoRKeyTyped(evt);
            }
        });
        getContentPane().add(EntradaCostoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 100, 30));

        jButton1.setText("Registrar Nota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mano De obra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 90, 34));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Refacciones:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 75, 35));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Costo de mano de obra:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 400, 140, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Costo de refacciones:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 560, -1, 43));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 75, 23));

        EntradaNombre.setEnabled(false);
        getContentPane().add(EntradaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 90, 30));

        EntradaIdCliente.setEnabled(false);
        EntradaIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaIdClienteActionPerformed(evt);
            }
        });
        EntradaIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaIdClienteKeyTyped(evt);
            }
        });
        getContentPane().add(EntradaIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 90, 30));

        EntradaApellidoP.setEnabled(false);
        getContentPane().add(EntradaApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 130, 30));

        EntradaIdVehiculo.setEnabled(false);
        EntradaIdVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaIdVehiculoKeyTyped(evt);
            }
        });
        getContentPane().add(EntradaIdVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 200, 78, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Apellido Paterno");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, -1, 23));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Apellido Materno");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 90, -1, 23));

        EntradaApellidoM.setEnabled(false);
        getContentPane().add(EntradaApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 110, 120, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Vehiculo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 70, 20));

        EntradaVehiculo.setEnabled(false);
        getContentPane().add(EntradaVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 70, 30));

        Placa.setEnabled(false);
        Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaActionPerformed(evt);
            }
        });
        Placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PlacaKeyTyped(evt);
            }
        });
        getContentPane().add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 80, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Placa");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 180, 80, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Id Cliente");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 60, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Id Vehiculo");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 180, 70, 20));

        EntradaIdIngresoV.setEnabled(false);
        EntradaIdIngresoV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaIdIngresoVKeyTyped(evt);
            }
        });
        getContentPane().add(EntradaIdIngresoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 200, 90, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Numero Ingreso");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 180, 100, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/regreso.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/regreso.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/regreso (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salida.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salida.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salida (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 0, 70, 70));

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Placa:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 560, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 560, 60));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabla);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 670, 400));

        EntradaPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EntradaPlacaKeyTyped(evt);
            }
        });
        getContentPane().add(EntradaPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 104, 110, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo5.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaCostoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaCostoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaCostoRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int idNumeroCliente=Integer.parseInt(EntradaIdCliente.getText());
        int idNumeroVehiculo=Integer.parseInt(EntradaIdVehiculo.getText());
        int idNumeroIngreso=Integer.parseInt(EntradaIdIngresoV.getText());
        String mano =EntradaManoDeObraD.getText();
        float MANO = Float.parseFloat(mano);
        String refa =EntradaCostoR.getText();
        float REFAC = Float.parseFloat(refa);
        ConexionMySQL con=new ConexionMySQL();
        con.ConectarBasedeDatos();
        con.GuardarNota(idNumeroCliente,idNumeroVehiculo,idNumeroIngreso ,EntradaManoDeObra.getText(),MANO,EntradaRefaccionesT.getText(),REFAC);
        Menu M= new Menu();
        M.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu menu=new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir?", "WARNING",JOptionPane.WARNING_MESSAGE,
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        // Instrucciones si verdadero
        System.exit(0);
        } else {
            // Instrucciones si falso

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void EntradaIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaIdClienteKeyTyped
        // TODO add your handling code here:
    char car = evt.getKeyChar();
    if(Character.isDigit(car)){
    }else{
    evt.consume();
    getToolkit().beep();
    }
    }//GEN-LAST:event_EntradaIdClienteKeyTyped

    private void EntradaIdVehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaIdVehiculoKeyTyped
        // TODO add your handling code here:
                char car = evt.getKeyChar();
    if(Character.isDigit(car)){
    }else{
    evt.consume();
    getToolkit().beep();
    }
    }//GEN-LAST:event_EntradaIdVehiculoKeyTyped

    private void EntradaIdIngresoVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaIdIngresoVKeyTyped
        // TODO add your handling code here:
                char car = evt.getKeyChar();
    if(Character.isDigit(car)){
    }else{
    evt.consume();
    getToolkit().beep();
    }
    }//GEN-LAST:event_EntradaIdIngresoVKeyTyped

    private void EntradaManoDeObraDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaManoDeObraDKeyTyped
        // TODO add your handling code here:
    char car = evt.getKeyChar();
    if(Character.isDigit(car)){
    }else{
    evt.consume();
    }
    }//GEN-LAST:event_EntradaManoDeObraDKeyTyped

    private void EntradaCostoRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaCostoRKeyTyped
        // TODO add your handling code here:
                char car = evt.getKeyChar();
    if(Character.isDigit(car)){
    }else{
    evt.consume();
    }
    }//GEN-LAST:event_EntradaCostoRKeyTyped

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        Mostrar(EntradaPlaca.getText());

    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here
        int i=Tabla.getSelectedRow();
        TableModel model=Tabla.getModel();
        EntradaIdCliente.setText(model.getValueAt(i,0).toString());
        EntradaNombre.setText(model.getValueAt(i,1).toString());
        EntradaApellidoP.setText(model.getValueAt(i,2).toString());
        EntradaApellidoM.setText(model.getValueAt(i,3).toString());
        EntradaIdVehiculo.setText(model.getValueAt(i,4).toString());
        EntradaVehiculo.setText(model.getValueAt(i,5).toString());
        Placa.setText(model.getValueAt(i,6).toString());
        EntradaIdIngresoV.setText(model.getValueAt(i,7).toString());
    }//GEN-LAST:event_TablaMouseClicked

    private void EntradaIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaIdClienteActionPerformed

    private void PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaActionPerformed

    private void EntradaPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntradaPlacaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_EntradaPlacaKeyTyped

    private void PlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlacaKeyTyped
        // TODO add your handling code here:
     char car = evt.getKeyChar();
    if(Character.isDigit(car)){
    }else{
    evt.consume();
    }
    }//GEN-LAST:event_PlacaKeyTyped
 public void Mostrar(String Placa)
    {
        ConexionMySQL con=new ConexionMySQL();
        con.ConectarBasedeDatos();
       DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Id Cliente");
        model.addColumn("Nombre");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("Id Vehiculo");
        model.addColumn("Vehiculo");
        model.addColumn("Placa");
        model.addColumn("Numero Ingreso");
        Tabla.setModel(model);
        String sql="";
        if(Placa.equals(""))
        {
           sql="select cliente.IdCliente,cliente.Nombre,cliente.ApellidoP,cliente.ApellidoM,Vehiculos.IdVehiculos,vehiculos.vehiculo,vehiculos.Placa,ingresarvehiculos.IdIngresoVehiculo from cliente,vehiculos,ingresarvehiculos where cliente.IdCliente=vehiculos.IdClienteV and cliente.IdCliente=ingresarvehiculos.NumeroCliente;"; 
        }else{
            sql="select cliente.IdCliente,cliente.Nombre,cliente.ApellidoP,cliente.ApellidoM,Vehiculos.IdVehiculos,vehiculos.vehiculo,vehiculos.Placa,ingresarvehiculos.IdIngresoVehiculo from cliente,vehiculos,ingresarvehiculos where cliente.IdCliente=vehiculos.IdClienteV and cliente.IdCliente=ingresarvehiculos.NumeroCliente and vehiculos.Placa like '%"+Placa+"%';";
        }
        String Usuarios[]=new String[8];
        Statement set;
        try {
            set=con.conexion.createStatement();
            con.resultado=set.executeQuery(sql);
            while(con.resultado.next())
            {
                Usuarios[0]=con.resultado.getString(1);
                Usuarios[1]=con.resultado.getString(2);
                Usuarios[2]=con.resultado.getString(3);
                Usuarios[3]=con.resultado.getString(4);
                Usuarios[4]=con.resultado.getString(5);
                Usuarios[5]=con.resultado.getString(6);
                Usuarios[6]=con.resultado.getString(7);
                Usuarios[7]=con.resultado.getString(8);
                model.addRow(Usuarios);
            }
            Tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Registros.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
 
 
 
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nota().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JTextField EntradaApellidoM;
    private javax.swing.JTextField EntradaApellidoP;
    private javax.swing.JTextField EntradaCostoR;
    private javax.swing.JTextField EntradaIdCliente;
    private javax.swing.JTextField EntradaIdIngresoV;
    private javax.swing.JTextField EntradaIdVehiculo;
    private javax.swing.JTextArea EntradaManoDeObra;
    private javax.swing.JTextField EntradaManoDeObraD;
    private javax.swing.JTextField EntradaNombre;
    private javax.swing.JTextField EntradaPlaca;
    private javax.swing.JTextArea EntradaRefaccionesT;
    private javax.swing.JTextField EntradaVehiculo;
    private javax.swing.JLabel EtiquetaNotas;
    private javax.swing.JTextField Placa;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
