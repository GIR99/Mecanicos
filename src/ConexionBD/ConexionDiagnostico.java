/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author GIR_J
 * 
 * NOTA IMPORTANTE PARA LLAMAR CORRECTAMENTE LOS REPORTES ESTO SE HACE DESDE EL PROYECTO PERO SOLO EN CASO DEL REPORTE PRINCIPAL YA QUE LOS SUBREPORTES VAN SITUADOS EN C EN UNA RUTA ESTATICA YA QUE EL REPORTE ORIGINAL NO PUEDE LLAMAR AL SUBREPORTE DESDE LA RUTA DEL PROYECTO
 * A SI QUE PARA CUALQUIER MODIFICACION EN EL REPORTE ABRIR EL PRINCIPAL DEL PROYECTO Y EL SECUNDARIO DESDE LA RUTA ESTATICA DONDE ESTARAN LOS RECURSOS DEL PROYECTO COMO IMAHENES DEL LOS REPORTES ETC.
 */
public class ConexionDiagnostico {
    
    
    
     public void JasperEJEMPLO(String Id) throws JRException, SQLException
 {
      
     // String archivo="\\Informes\\Nota.jasper";
      //JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Informes/Nota.jasper"));
      JasperReport jasperReport=(JasperReport)JRLoader.loadObject(getClass().getResource("/Informes/EJEMPLO.jasper"));
     try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/leuraojedamecanicos2?characterEncoding=latin2","root","16070065");
         HashMap parametro =new HashMap();
         parametro.put("Buscar",Id);
         JasperPrint jp=JasperFillManager.fillReport(jasperReport,parametro,con);
         JasperViewer view =new JasperViewer(jp,false);
         view.setVisible(true);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
     public void JasperDiagnostico(String Id) throws JRException, SQLException
 {
      
     // String archivo="\\Informes\\Nota.jasper";
      //JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Informes/Nota.jasper"));
      JasperReport jasperReport=(JasperReport)JRLoader.loadObject(getClass().getResource("/Informes/Diagnostico.jasper"));
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
    
}
