
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion 
{
    
      public static Connection conectar()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
               System.out.println("Conexion realizada");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecasena2021", "root", "");
         
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encontro el Driver MySQL para JDBC");
            return null;
            
           // Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
      
        
    }
    
}
