import java.util.Scanner;

public class horarioProfesor extends horario {
    private int idHorarioProfesor;
    private String instituto;

    public horarioProfesor() {
        super();
    }

    public horarioProfesor(int idHorarioProfesor, String materia, String fechaInicio,
            String fechaFin, String horaInicio, String horaFin,
            String instituto, String recurrenciaDia,
            String identificacionPersona ) {
        super(fechaInicio, fechaFin, horaInicio, horaFin, materia, recurrenciaDia, identificacionPersona);
        this.idHorarioProfesor = idHorarioProfesor;
        this.instituto = instituto;

    
    }

   @Override 

   public void mostrarHorario() {
    System.out.println("\n=== INFORMACIÓN DEL PROFESOR ===");
    System.out.println("ID Horario: " + idHorarioProfesor);
    System.out.println("Instituto: " + instituto);
    super.mostrarHorario();
   }

   public String obtenerResumenHorario() {
        return "\n=== RESUMEN DEL HORARIO ===\n"
        + "Horario #" + idHorarioProfesor + " - " + super.materia + 
               " (" + super.horaInicio + "-" + super.horaFin + ") en " + instituto;
    }

}