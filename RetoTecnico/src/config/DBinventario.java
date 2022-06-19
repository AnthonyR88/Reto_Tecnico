/* Nombre del paquete */
package config;

/* Importe de clases */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Anthony Ruiz
 */
public class DBinventario {
    /* Atributos */
    private String bd = "inventario";   
    private String login = "root";   
    private String password = "";   
    private String url = "jdbc:mysql://localhost:3306/" + bd;   
    Connection con = null;   
    
    /* Creación de la conexión a la BD */
    public DBinventario() {      
        try {        
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, login, password);
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
    /* Método para obtener la conexión a la BD */
    public Connection getConnection(){
        return con;
    }
    
    /* Se desconecta de la BD */
    public void desconectar(){
        con = null;
    }
}
