import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("001", TipoDocumento.CC, "Juan Pérez", new Date(), 3, "juan@correo.com");
        Estudiante estudiante2 = new Estudiante("002", TipoDocumento.TI, "María Gómez", new Date(), 2, "juana@examplecorreo.com");

        // Crear ayudas
        Ayuda ayuda1 = new Ayuda(estudiante1, TipoAyuda.MERCADO, new Date());
        Ayuda ayuda2 = new Ayuda(estudiante2, TipoAyuda.COMPUTADOR, new Date());
        Ayuda ayuda3 = new Ayuda(estudiante1, TipoAyuda.INTERNET, new Date());

        // Entregar algunas ayudas
        ayuda1.entregar();
        ayuda2.rechazar();
        ayuda3.entregar();
        

        System.out.println("Ayuda registrada para el estudiante " + estudiante1.getNombre() + " y el tipo de ayuda es: " + ayuda1.getTipoAyuda());
         System.out.println("Ayuda registrada para el estudiante " +estudiante2.getNombre() + " y el tipo de ayuda es: " + ayuda2.getTipoAyuda());
            System.out.println("Ayuda registrada para el estudiante " + estudiante1.getNombre() + " y el tipo de ayuda es: " + ayuda3.getTipoAyuda());
            
               System.out.println("---------------------------");
            
        System.out.println("La ayuda para "+ estudiante1.getNombre()+" fue "+ ayuda1.getEstado());
        System.out.println("La ayuda para "+ estudiante2.getNombre() +" fue "+ ayuda2.getEstado());
        System.out.println("La ayuda para "+estudiante1.getNombre() +" fue "+ ayuda3.getEstado());
            
                 System.out.println("---------------------------");
                 
        // Contar ayudas entregadas
        int ayudasEntregadas = contarAyudasEntregadas(ayuda1, ayuda2, ayuda3);
        System.out.println("Cantidad de ayudas entregadas: " + ayudasEntregadas);
                 System.out.println("---------------------------");
        // Contar estudiantes favorecidos
        int estudiantesFavorecidos = contarEstudiantesFavorecidos(ayuda1, ayuda2, ayuda3);
        System.out.println("Cantidad de estudiantes favorecidos: " + estudiantesFavorecidos);
    }

    // Método para contar las ayudas entregadas
    public static int contarAyudasEntregadas(Ayuda... ayudas) {
        int contador = 0;
        for (Ayuda ayuda : ayudas) {
            if (ayuda.getEstado() == Estado.ENTREGADA) {
                contador++;
            }
        }
        return contador;
    }
    // Método para contar los estudiantes favorecidos
    public static int contarEstudiantesFavorecidos(Ayuda... ayudas) {
        int contador = 0;
        for (Ayuda ayuda : ayudas) {
            if (ayuda.getEstado() == Estado.ENTREGADA || ayuda.getEstado() == Estado.RECHAZADA) {
                contador++;
            }
        }
        return contador;
    }
}