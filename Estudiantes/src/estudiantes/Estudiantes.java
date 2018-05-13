package estudiantes;
 
import java.util.Date;
 
/**
 *
 * @author Brayan Loachamin
 */
public class Estudiantes {
 
   private String nombre;
   private String apellido;
   private String cedula;
   private Date fechaNacimiento;
   private String[] materias;
//Constructor vacio  
//  public Estudiantes(){}
    
//Constructor
   public Estudiantes(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
   //Getters y Setters
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellido() {
        return apellido;
    }
 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    public String getCedula() {
        return cedula;
    }
 
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
 
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
 
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
 
    public String[] getMaterias() {
        return materias;
    }
 
    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
   
    
}