/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ConexionMySQL {
    //COSITAS DE GERAS
   
    //Variable ps
 PreparedStatement ps;
 public Connection conexion;
 public Statement sentencia;
 public ResultSet resultado;

public void ConectarBasedeDatos(){
 try {
 final String Controlador = "com.mysql.jdbc.Driver";
 Class.forName( Controlador );
 final String url_bd = "jdbc:mysql://localhost:3306/leuraojedamecanicos2?characterEncoding=latin2";
 conexion = DriverManager.getConnection(url_bd,"root","16070065");
 sentencia = conexion.createStatement();
 System.out.println("Se conecto a la bd");
 } catch (ClassNotFoundException | SQLException ex) {
 JOptionPane.showMessageDialog(null,ex.getMessage(), "Error ", JOptionPane.ERROR_MESSAGE);
 }
 }
 public void DesconectarBasedeDatos() {
 try {
 if (conexion != null ) {
 if(sentencia != null) {
 sentencia.close();
 }
 conexion.close();
 }
 }
 catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
 System.exit(1);
 }
 }
 public Connection getConnection(){
 return conexion;
 }
 
 //////////////
    /// @param Id/
    /// @throws net.sf.jasperreports.engine.JRException
    /// @throws java.sql.SQLException

 public void JasperDiagnosticos(String Id) throws JRException, SQLException
 {
      
      String archivo="/Informes/Diagnostico.jasper";
      JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Informes/Diagnostico.jasper"));
     try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/leuraojedamecanicos2?characterEncoding=latin2","root","16070065");
         HashMap parametro =new HashMap();
         parametro.put("Id",Id);
         
         JasperPrint jp=JasperFillManager.fillReport(jasperReport,parametro,con);
         JasperViewer view =new JasperViewer(jp,false);
         view.setVisible(true);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 
 public void JasperDiagnosticoEstaC(String Id) throws JRException, SQLException
 {
      
      String archivo="src\\Informes\\Diagnostico2.jasper";
      
     try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/leuraojedamecanicos2?characterEncoding=latin2","root","16070065");
         HashMap parametro =new HashMap();
         parametro.put("Id",Id);
         JasperPrint jp=JasperFillManager.fillReport(archivo,parametro,con);
         JasperViewer view =new JasperViewer(jp,false);
         view.setVisible(true);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 //Clase poderosa de geras Ingresa los datos poderosamente por POO :3
     public void GuardarDiagnostico(int NumeroCliente,int NumeroVehiculo,int IdEstadoCarro,String Inspeccion_Cofre_Abierto,String EstadoVehiculo,String Neumaticos,String FrenosDelanteros,String FrenosTraseros,String Amortiguadores,String SuspencionDelantera,String SuspencionTrasera,String Direccion,String BandasYPoleasDeAccion,String Mangueras,String NivelesDeFluidos,String Luces,String LimpiaParabrisas,String Bateria,String BalerosDeRuedasD,String BalerosDeRuedasT,String SistemaDeEscape,String Afinacion,String ObservacionesYPuntosAdicionales,String Tecnico,Date FechaDiagnostico)
    {
        try {
    
            //La variable ps agrupa los datos y los manda directamente a la insercion bien op teniendo en cuenta que es pooo se comunica donde esten llamando el metodo jsjsjs y pide los valors se envian aqui y de aqui se pasan a la 
            ps = conexion.prepareStatement("INSERT INTO diagnostico (NumeroCliente,NumeroVehiculo,IdEstadoCarro,Inspeccion_Cofre_Abierto,EstadoVehiculo,Neumaticos,FrenosDelanteros,FrenosTraseros,Amortiguadores,SuspencionDelantera,SuspencionTrasera,Direccion,BandasYPoleasDeAccion,Mangueras,NivelesDeFluidos,Luces,LimpiaParabrisas,Bateria,BalerosDeRuedasD,BalerosDeRuedasT,SistemaDeEscape,Afinacion,ObservacionesYPuntosAdicionales,Tecnico,FechaDiagnostico) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,NumeroCliente);
            ps.setInt(2,NumeroVehiculo);
            ps.setInt(3,IdEstadoCarro);
            ps.setString(4,Inspeccion_Cofre_Abierto);
            ps.setString(5,EstadoVehiculo);
            ps.setString(6,Neumaticos);
            ps.setString(7,FrenosDelanteros);
            ps.setString(8,FrenosTraseros);
            ps.setString(9,Amortiguadores);
            ps.setString(10,SuspencionDelantera);
            ps.setString(11,SuspencionTrasera);
            ps.setString(12,Direccion);
            ps.setString(13,BandasYPoleasDeAccion);
            ps.setString(14,Mangueras);
            ps.setString(15,NivelesDeFluidos);
            ps.setString(16,Luces);
            ps.setString(17,LimpiaParabrisas);
            ps.setString(18,Bateria);
            ps.setString(19,BalerosDeRuedasD);
            ps.setString(20,BalerosDeRuedasT);
            ps.setString(21,SistemaDeEscape);
            ps.setString(22,Afinacion);
            ps.setString(23,ObservacionesYPuntosAdicionales);
            ps.setString(24,Tecnico);
            ps.setDate(25,FechaDiagnostico);
            
            ///evaluar 
            int res = ps.executeUpdate();
            if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Diagnostico Registrado Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El diagnostico no fue registrado con exito, revisa los campos nuevamente");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public void GuardarEstadoCarro(int IdDiagnostico,String SalpDelIzq,String PuerDelIzq,String PuerTraIzq,String SalpTraIzq,String SalpDelDer,String PuerDelDer,String PuerTraDer,String SalpTraDer,String DefenDelan,String DefenTrase,String FocIzqDela,String FocDerDela,String FocIzqTras,String FocDerTras,String LLanDelIzq,String LLanDelDer,String LLanTraIzq,String LLanTraDer,String Cofre,String Parabrisas,String Techo,String ParabrisasTrasero,String PuertaCajuela)
    {
        try {
    
            //La variable ps agrupa los datos y los manda directamente a la insercion bien op teniendo en cuenta que es pooo se comunica donde esten llamando el metodo jsjsjs y pide los valors se envian aqui y de aqui se pasan a la 
            ps = conexion.prepareStatement("INSERT INTO estadocarro (IdDiagnostico,SalpDelIzq,PuerDelIzq,PuerTraIzq,SalpTraIzq,SalpDelDer,PuerDelDer,PuerTraDer,SalpTraDer, DefenDelan,DefenTrase, FocIzqDela,FocDerDela,FocIzqTras,FocDerTras,LLanDelIzq,LLanDelDer,LLanTraIzq,LLanTraDer,Cofre,Parabrisas,Techo,ParabrisasTrasero,PuertaCajuela) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,IdDiagnostico);
            ps.setString(2,SalpDelIzq);
            ps.setString(3,PuerDelIzq);
            ps.setString(4,PuerTraIzq);
            ps.setString(5,SalpTraIzq);
            ps.setString(6,SalpDelDer);
            ps.setString(7,PuerDelDer);
            ps.setString(8,PuerTraDer);
            ps.setString(9,SalpTraDer);
            ps.setString(10,DefenDelan);
            ps.setString(11,DefenTrase);
            ps.setString(12,FocIzqDela);
            ps.setString(13,FocDerDela);
            ps.setString(14,FocIzqTras);
            ps.setString(15,FocDerTras);
            ps.setString(16,LLanDelIzq);
            ps.setString(17,LLanDelDer);
            ps.setString(18,LLanTraIzq);
            ps.setString(19,LLanTraDer);
            ps.setString(20,Cofre);
            ps.setString(21,Parabrisas);
            ps.setString(22,Techo);
            ps.setString(23,ParabrisasTrasero);
            ps.setString(24,PuertaCajuela);
            ///evaluar 
            int res = ps.executeUpdate();
            if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Estado Del carro Registrado Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El Estado Del carro no fue registrado con exito, revisa los campos nuevamente");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
   
     public void GuardarVehiculo(int IdClienteV,String Vehiculo,String Serie,String Placa)
    {
        try {
    
            //La variable ps agrupa los datos y los manda directamente a la insercion bien op teniendo en cuenta que es pooo se comunica donde esten llamando el metodo jsjsjs y pide los valors se envian aqui y de aqui se pasan a la 
            ps = conexion.prepareStatement("INSERT IGNORE INTO vehiculos  (IdClienteV,Vehiculo,Serie,Placa) VALUES(?,?,?,?)");
            ps.setInt(1,IdClienteV);
            ps.setString(2,Vehiculo);
            ps.setString(3,Serie);
            ps.setString(4,Placa);
            ///evaluar 
            int res = ps.executeUpdate();
            if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Vehiculo registrado correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El vehiculo no fue registrado con exito, revisa los campos nuevamente");
            }
            ///cerramos la conexion con la base ded atos
                conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
     
      public void GuardarIngresoVehiculo(int NumeroCliente,int NumeroVehiculo,int NumeroDiagnostico,int KM_MILLAS,String EstadoTanque,Date FechaIngreso)
    {
        try {
    
            //La variable ps agrupa los datos y los manda directamente a la insercion bien op teniendo en cuenta que es pooo se comunica donde esten llamando el metodo jsjsjs y pide los valors se envian aqui y de aqui se pasan a la 
            ps = conexion.prepareStatement("INSERT INTO ingresarvehiculos  (NumeroCliente,NumeroVehiculo,NumeroDiagnostico,KM_MILLAS,EstadoTanque,FechaIngreso) VALUES(?,?,?,?,?,?)");
            ps.setInt(1,NumeroCliente);
            ps.setInt(2,NumeroVehiculo);
            ps.setInt(3,NumeroDiagnostico);
            ps.setInt(4,KM_MILLAS);
            ps.setString(5,EstadoTanque);
            ps.setDate(6,FechaIngreso);
            ///evaluar 
            int res = ps.executeUpdate();
            if(res>0)
            {
                JOptionPane.showMessageDialog(null,"El ingreso del vehiculo fue registrado correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El ingreso del vehiculo no fue registrado con exito, revisa los campos nuevamente");
            }
            ///cerramos la conexion con la base ded atos
                conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     ///////////////
     //clase provicional para obtener el nuemor de las notas :3
     /*public String NumeroNotas()
     {
     String UltimoValor = null;
     sentencia=conexion.createStatement();
     resultado =sentencia.executeQuery("select idNotas from notas order by idNotas desc");
     UltimoValor=resultado.getString(1);
     System.out.println(UltimoValor);
      
     }
     */
     //////////Busqueda
     public int Buscar(int i,String CLAVE)
     {
         String[] arreglo =new String[4];
         
     try {
         ps=conexion.prepareStatement("select idNotas,NumeroNotas,Cliente,Vehiculo from notas WHERE CLAVE=?");
         ps.setString(1,CLAVE);
         resultado=ps.executeQuery();
         if(resultado.next())
         {
             
         }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
     return i;
     }
          
      public void GuardarCliente(String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono)
    {
        try {
    
            //La variable ps agrupa los datos y los manda directamente a la insercion bien op teniendo en cuenta que es pooo se comunica donde esten llamando el metodo jsjsjs y pide los valors se envian aqui y de aqui se pasan a la 
            ps = conexion.prepareStatement("INSERT INTO cliente  (Nombre,ApellidoP,ApellidoM,Direccion,Telefono) VALUES(?,?,?,?,?)");
            ps.setString(1,Nombre);
            ps.setString(2,ApellidoP);
            ps.setString(3,ApellidoM);
            ps.setString(4,Direccion);
            ps.setString(5,Telefono);
            
            ///evaluar 
            int res = ps.executeUpdate();
            if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Cliente registrado correctamente");

            }else
            {
                JOptionPane.showMessageDialog(null,"El cliente no fue guardado con exito, revisa los campos nuevamente");
            }
            ///cerramos la conexion con la base ded atos
                conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
      
      public void GuardarNota(int NumeroCliente,int NumeroVehiculo,int NumeroIngresoVehiculo,String ManoDeobra,float CostoManoDeObra,String Refacciones,float CostoRefacciones)
    {
        try {
    
            //La variable ps agrupa los datos y los manda directamente a la insercion bien op teniendo en cuenta que es pooo se comunica donde esten llamando el metodo jsjsjs y pide los valors se envian aqui y de aqui se pasan a la 
            ps = conexion.prepareStatement("INSERT INTO notas  (NumeroCliente,NumeroVehiculo,NumeroIngresoVehiculo,ManoDeobra,CostoManoDeObra,Refacciones,CostoRefacciones) VALUES(?,?,?,?,?,?,?)");
            ps.setInt(1,NumeroCliente);
            ps.setInt(2,NumeroVehiculo);
            ps.setInt(3,NumeroIngresoVehiculo);
            ps.setString(4,ManoDeobra);
            ps.setFloat(5,CostoManoDeObra);
            ps.setString(6,Refacciones);
            ps.setFloat(7,CostoRefacciones);
            ///evaluar 
            int res = ps.executeUpdate();
            if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Nota Registrada Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"La nota no fue guardada con exito revisa los campos nuevamente");
            }
            ///cerramos la conexion con la base ded atos
                conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
    public void UpdateEstadoCarro(String SalpDelIzq,String PuerDelIzq,String PuerTraIzq,String SalpTraIzq,String SalpDelDer,String PuerDelDer,String PuerTraDer,String SalpTraDer,String DefenDelan,String DefenTrase,String FocIzqDela,String FocDerDela,String FocIzqTras,String FocDerTras,String LLanDelIzq,String LLanDelDer,String LLanTraIzq,String LLanTraDer,String Cofre,String Parabrisas,String Techo,String ParabrisasTrasero,String PuertaCajuela,int IdDiagnostico) throws SQLException
      {
       
        ps=conexion.prepareStatement("Update estadocarro set SalpDelIzq=?,PuerDelIzq=?,PuerTraIzq=?,SalpTraIzq=?,SalpDelDer=?,PuerDelDer=?,PuerTraDer=?,SalpTraDer=?,DefenDelan=?,DefenTrase=?,FocIzqDela=?,FocDerDela=?,FocIzqTras=?,FocDerTras=?,LLanDelIzq=?,LLanDelDer=?,LLanTraIzq=?,LLanTraDer=?,Cofre=?,Parabrisas=?,Techo=?,ParabrisasTrasero=?,PuertaCajuela=? where IdDiagnostico=?");
         //ps.setInt(1,IdDiagnostico);
            ps.setString(1,SalpDelIzq);
            ps.setString(2,PuerDelIzq);
            ps.setString(3,PuerTraIzq);
            ps.setString(4,SalpTraIzq);
            ps.setString(5,SalpDelDer);
            ps.setString(6,PuerDelDer);
            ps.setString(7,PuerTraDer);
            ps.setString(8,SalpTraDer);
            ps.setString(9,DefenDelan);
            ps.setString(10,DefenTrase);
            ps.setString(11,FocIzqDela);
            ps.setString(12,FocDerDela);
            ps.setString(13,FocIzqTras);
            ps.setString(14,FocDerTras);
            ps.setString(15,LLanDelIzq);
            ps.setString(16,LLanDelDer);
            ps.setString(17,LLanTraIzq);
            ps.setString(18,LLanTraDer);
            ps.setString(19,Cofre);
            ps.setString(20,Parabrisas);
            ps.setString(21,Techo);
            ps.setString(22,ParabrisasTrasero);
            ps.setString(23,PuertaCajuela);
            ps.setInt(24,IdDiagnostico);
            ///evaluar 
            int res = ps.executeUpdate();
            if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Estado Del carro Registrado Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El Estado Del carro no fue registrado con exito, revisa los campos nuevamente");
            } 
      }
      
      
      public void UpdateCliente(String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,int ID)
      {
     try {
         ps=conexion.prepareStatement("Update cliente set Nombre=?,ApellidoP=?,ApellidoM=?,Direccion=?,Telefono=? where IdCliente=?");
         ps.setString(1,Nombre);
         ps.setString(2,ApellidoP);
         ps.setString(3,ApellidoM);
         ps.setString(4,Direccion);
         ps.setString(5,Telefono);
         ps.setInt(6,ID);
         int res = ps.executeUpdate();
            if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Los datos del cliente fueron actualizados Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"Los datos del cliente no fueron actualizados Correctamente");
            }
            ///cerramos la conexion con la base ded atos
                //conexion.close();
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
      }
      
      public void UpdateVehiculos(String Vehiculo,String Serie,String Placa,int ID)
      {
     try {
         ps=conexion.prepareStatement("Update vehiculos set Vehiculo=?,Serie=?,Placa=? where IdClienteV=?");
         ps.setString(1,Vehiculo);
         ps.setString(2,Serie);
         ps.setString(3,Placa);
         ps.setInt(4,ID);
         int res = ps.executeUpdate();
         if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Los datos del vehiculo fueron actualizados Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"Los datos del vehiculo no fueron actualizados Correctamente");
            }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
      }
      /*codigo mamalon mario*/
          public void UpdateVehiculo(int IdClienteV,String Vehiculo,String Serie,String Placa,int ID)
      {
     try {
         ps=conexion.prepareStatement("Update vehiculos set IdClienteV=?, Vehiculo=?,Serie=?,Placa=? where IdVehiculos=?");
         ps.setInt(1, IdClienteV);
         ps.setString(2,Vehiculo);
         ps.setString(3,Serie);
         ps.setString(4,Placa);
         ps.setInt(5,ID);
         int res = ps.executeUpdate();
         if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Los datos del vehiculo fueron actualizados Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"Los datos del vehiculo no fueron actualizados Correctamente");
            }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
      }
      
      public void UpdateDiagnostico(String Inspeccion_Cofre_Abierto,String EstadoVehiculo,String Neumaticos,String FrenosDelanteros,String FrenosTraseros,String Amortiguadores,String SuspencionDelantera,String SuspencionTrasera,String Direccion,String BandasYPoleasDeAccion,String Mangueras,String NivelesDeFluidos,String Luces,String LimpiaParabrisas,String Bateria,String BalerosDeRuedasD,String BalerosDeRuedasT,String SistemaDeEscape,String Afinacion,String ObservacionesYPuntosAdicionales,String Tecnico,String FechaDiagnostico,int ID)
      {
     try {
         ps = conexion.prepareStatement("Update diagnostico set Inspeccion_Cofre_Abierto=?,EstadoVehiculo=?,Neumaticos=?,FrenosDelanteros=?,FrenosTraseros=?,Amortiguadores=?,SuspencionDelantera=?,SuspencionTrasera=?,Direccion=?,BandasYPoleasDeAccion=?,Mangueras=?,NivelesDeFluidos=?,Luces=?,LimpiaParabrisas=?,Bateria=?,BalerosDeRuedasD=?,BalerosDeRuedasT=?,SistemaDeEscape=?,Afinacion=?,ObservacionesYPuntosAdicionales=?,Tecnico=?,FechaDiagnostico=? WHERE IdDiagnostico=?");
         
         ps.setString(1,Inspeccion_Cofre_Abierto);
         ps.setString(2,EstadoVehiculo);
         ps.setString(3,Neumaticos);
         ps.setString(4,FrenosDelanteros);
         ps.setString(5,FrenosTraseros);
         ps.setString(6,Amortiguadores);
         ps.setString(7,SuspencionDelantera);
         ps.setString(8,SuspencionTrasera);
         ps.setString(9,Direccion);
         ps.setString(10,BandasYPoleasDeAccion);
         ps.setString(11,Mangueras);
         ps.setString(12,NivelesDeFluidos);
         ps.setString(13,Luces);
         ps.setString(14,LimpiaParabrisas);
         ps.setString(15,Bateria);
         ps.setString(16,BalerosDeRuedasD);
         ps.setString(17,BalerosDeRuedasT);
         ps.setString(18,SistemaDeEscape);
         ps.setString(19,Afinacion);
         ps.setString(20,ObservacionesYPuntosAdicionales);
         ps.setString(21,Tecnico);
         ps.setString(22,FechaDiagnostico);
         ps.setInt(23, ID);
         ///evaluar
         int res = ps.executeUpdate();
         if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Los datos del diagnostico fueron actualizados Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"Los datos del diagnostico no fueron actualizados Correctamente");
            }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
      }
      public void UpdateIngresarVehiculo(int KM_MILLAS,String Tanque,String Fecha,int ID)
      {
     try {
         ps=conexion.prepareStatement("Update ingresarvehiculos set KM_MILLAS=?,EstadoTanque=?,FechaIngreso=? where NumeroDiagnostico=?");
         ps.setInt(1,KM_MILLAS);
         ps.setString(2,Tanque);
         ps.setString(3,Fecha);
         ps.setInt(4,ID);  
         int res = ps.executeUpdate();
         if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Los datos del Ingreso del vehiculo fueron actualizados Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"Los datos del Ingreso del vehiculo no fueron actualizados Correctamente");
            }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
      }
      
      public void EliminarRegistroVehiculosIngresado(String id)
      {
     try {
         ps=conexion.prepareStatement("Delete from ingresarvehiculos where IdIngresoVehiculo=?");
         ps.setString(1,id);
         int res = ps.executeUpdate();
         if(res>0)
            {
                JOptionPane.showMessageDialog(null,"El registro del ingreso del vehiculo fue eliminado correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El registro del ingreso del vehiculo no fue eliminado correctamente");
            }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
      }
      
      public void EliminarRegistroDiagnostico(String id)
      {
     try {
         ps=conexion.prepareStatement("Delete from diagnostico where IdDiagnostico=?");
         ps.setString(1,id);
         int res = ps.executeUpdate();
         if(res>0)
            {
                JOptionPane.showMessageDialog(null,"El registro del diagnostico fue eliminado correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El registro del diagnostico no fue eliminado correctamente");
            }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
      }
      
      public void CerrarConexion() throws SQLException
      {
          conexion.close();
      }

    public void UpdateDiagnostico(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8, String text9, String text10, String text11, String text12, String text13, String text14, String text15, String text16, String text17, String text18, Date fecha, int idcliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void JasperNota(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public void EliminarNota(String id)
    {
    try {
         ps=conexion.prepareStatement("Delete from notas where IdNotas=?");
         ps.setString(1,id);
         int res = ps.executeUpdate();
         if(res>0)
            {
                JOptionPane.showMessageDialog(null,"El registro de la nota se a eliminado correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"El registro de la nota NO se a eliminado");
            }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public void UpdateNota(int idNota,String manoDeObra,float costoManoObra,String refacciones,float costoRefacciones)
    {
    try {
         ps=conexion.prepareStatement("Update notas set ManoDeObra=?,CostoManoDeObra=?,Refacciones=?,CostoRefacciones=? where IdNotas=?");
         ps.setString(1,manoDeObra);
         ps.setFloat(2,costoManoObra);
         ps.setString(3,refacciones);
         ps.setFloat(4,costoRefacciones);
         ps.setInt(5, idNota);
         int res = ps.executeUpdate();
         if(res>0)
            {
                JOptionPane.showMessageDialog(null,"Los datos de la Nota fueron actualizados Correctamente");
            }else
            {
                JOptionPane.showMessageDialog(null,"Los datos de la Nota no fueron actualizados Correctamente");
            }
     } catch (SQLException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
      
}
