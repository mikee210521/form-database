
package basedatos;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;


public class Conexion {
    
  static Connection usuario = null;
    
  public static Connection getConexion(){
        
    String Url = "jdbc:sqlserver://localhost:1433;databaseName=Formulario";
       
    try  {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          
   }catch(ClassNotFoundException cE){
          JOptionPane.showMessageDialog(null,"clase no encontrada"+ cE.toString());
        }
    try{
          usuario = DriverManager.getConnection(Url,"sa","miguelang");

    } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,"Ocurrio una excepcion"+ e.toString());
            
        }return (Connection) usuario;       
    }  
}

