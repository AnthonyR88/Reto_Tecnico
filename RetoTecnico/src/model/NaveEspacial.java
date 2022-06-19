/* Paquete donde se ubica el archivo */
package model;

/* Importe de clases */
import config.DBinventario;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anthony Ruiz
 */
public class NaveEspacial extends DBinventario{
    
    /* Atributo para la BD */
    private DBinventario conexion;
    
    /* Atributos */
    private String codigo;
    private String nombre;
    private String tipoNave;
    private double empuje;
    private double velocidad;
    
    /* Método Inicializador */
    public NaveEspacial() {
        this.codigo = "";
        this.nombre = "";
        this.tipoNave = "";
        this.empuje = 0;
        this.velocidad = 0;
        
        /* Crea la Conexión a la BD */
        this.conexion = new DBinventario();
    }
    
    /* Método Constructor */
    public NaveEspacial(String codigo, String nombre, String tipoNave, double empuje, double velocidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoNave = tipoNave;
        this.empuje = empuje;
        this.velocidad = velocidad;
        
        /* Crea la Conexión a la BD */
        this.conexion = new DBinventario();
    }
    
    /* Método para crear la nave */
    public boolean crearNave(){
        /* Asignación de los valores del formulario */
        String codigo = this.codigo;
        String nombre = this.nombre;
        String tipoNave = this.tipoNave;
        double empuje = this.empuje;
        double velocidad = this.velocidad;
        
        /* Sentencia SQL */
        String sqlCrear = "INSERT INTO nave_espacial() VALUES (?,?,?,?,?)";
        
        /* Ejecución de la sentencia SQL */
        try {
            PreparedStatement inst = conexion.getConnection().prepareStatement(sqlCrear);
            inst.setString(1, codigo);
            inst.setString(2, nombre);
            inst.setString(3, tipoNave);
            inst.setDouble(4, empuje);
            inst.setDouble(5, velocidad);
            inst.executeUpdate();
            
            return true;
            
            /* Excepciones en caso de error */
            } catch (SQLException e) {
                System.out.println(e);
                return false;
            } catch (Exception ex) {
                System.out.println(ex.toString());
                return false;
            }
    }
    
    /* Método para consultar naves */
    public String consultarNave(){
        String cons = "";
        
        /* Sentencia SQL */
        String sqlConsultar = "SELECT * FROM nave_espacial";
        
        /* Ejecución de la sentencia SQL */
        try {
            PreparedStatement inst = conexion.getConnection().prepareStatement(sqlConsultar);
            ResultSet res = inst.executeQuery();
            
            /* Guarda la consulta en un String */
            while (res.next()) {
                cons = cons + res.getString(1) + " - " + res.getString(2) + " - " + res.getString(3) + " - " + res.getDouble(4) + " - " + res.getDouble(5) + "\n";
            }
            
            /* Devuelve la consulta en un String*/
            return cons;
            
            /* Excepciones en caso de error */
            } catch (SQLException e) {
                System.out.println(e);
                return "";
            } catch (Exception ex) {
                System.out.println(ex.toString());
                return "";
            }
    }
}
