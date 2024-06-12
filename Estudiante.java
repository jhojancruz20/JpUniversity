import java.util.Date;

// Clase Estudiante
class Estudiante {
    private String codigo;
    private TipoDocumento documento;
    private String nombre;
    private Date fechaNacimiento;
    private Integer estrato;
    private String email;

    // Constructor
    public Estudiante(String codigo, TipoDocumento documento, String nombre, Date fechaNacimiento, Integer estrato, String email) {
        this.codigo = codigo;
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estrato = estrato;
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
}

