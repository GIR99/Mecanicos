/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mecanicos;

import ConexionBD.ConexionDiagnostico;
import ConexionBD.ConexionMySQL;
import ConexionBD.ConexionReporteNotas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author GIR_J
 */
public class Mecanicos {
 
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ConexionMySQL conexion = new ConexionMySQL();
            conexion.ConectarBasedeDatos();
            ConexionDiagnostico diag=new ConexionDiagnostico();
            ConexionReporteNotas nota=new ConexionReporteNotas();
            String id= ""+2;
            nota.JasperEJEMPLO(id);
            nota.JasperNota(id);
            diag.JasperDiagnostico(id);
        } catch (JRException | SQLException ex) {
            Logger.getLogger(Mecanicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
