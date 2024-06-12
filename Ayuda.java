import java.util.Date;
// Clase Ayuda
class Ayuda {
    private Estudiante estudiante;
    private TipoAyuda tipoAyuda;
    private Estado estado;
    private Date fechaAsignacion;
    private Date fechaEntrega;

    // Constructor
    public Ayuda(Estudiante estudiante, TipoAyuda tipoAyuda, Date fechaAsignacion) {
        this.estudiante = estudiante;
        this.tipoAyuda = tipoAyuda;
        this.estado = Estado.ASIGNADA;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = null;
    }

    public TipoAyuda getTipoAyuda() {
        return tipoAyuda;
    }
    // Método para entregar la ayuda
    public void entregar() {
        this.estado = Estado.ENTREGADA;
        this.fechaEntrega = new Date();
    }

    // Método para rechazar la ayuda
    public void rechazar() {
        this.estado = Estado.RECHAZADA;
        this.fechaEntrega = null;
    }

    // Getter para el estado
    public Estado getEstado() {
        return estado;
    }
}
