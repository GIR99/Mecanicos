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
 */
public class ConexionReporteNotas {
    
    
    
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
     public void JasperNota(String Id) throws JRException, SQLException
 {
      
     // String archivo="\\Informes\\Nota.jasper";
      //JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Informes/Nota.jasper"));
      JasperReport jasperReport=(JasperReport)JRLoader.loadObject(getClass().getResource("/Informes/Nota.jasper"));
     try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/leuraojedamecanicos2?characterEncoding=latin2","root","16070065");
         HashMap parametro =new HashMap();
         parametro.put("IdNotasP",Id);
         JasperPrint jp=JasperFillManager.fillReport(jasperReport,parametro,con);
         JasperViewer view =new JasperViewer(jp,false);
         view.setVisible(true);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
    
}
