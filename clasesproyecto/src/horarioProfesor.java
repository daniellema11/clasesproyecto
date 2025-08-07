import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class horarioProfesor {
    private int idHorarioProfesor;
    private String materiaProfesor;
    private LocalDate fechaInicioProfesor;
    private LocalDate fechaFinalizacionProfesor;
    private LocalTime horaInicioProfesor;
    private LocalTime horaFinProfesor;
    private String instituto;
    private String recurrenciaDiaProfesor;
    private String identificacionProfesor;
    private String identificacionPersona;

    public horarioProfesor() {

    }

    public horarioProfesor(int idHorarioProfesor, String materiaProfesor, LocalDate fechaInicioProfesor,
            LocalDate fechaFinalizacionProfesor, LocalTime horaInicioProfesor, LocalTime horaFinProfesor,
            String instituto, String recurrenciaDiaProfesor, String identificacionProfesor,
            String identificacionPersona) {
        this.idHorarioProfesor = idHorarioProfesor;
        this.materiaProfesor = materiaProfesor;
        this.fechaInicioProfesor = fechaInicioProfesor;
        this.fechaFinalizacionProfesor = fechaFinalizacionProfesor;
        this.horaInicioProfesor = horaInicioProfesor;
        this.horaFinProfesor = horaFinProfesor;
        this.instituto = instituto;
        this.recurrenciaDiaProfesor = recurrenciaDiaProfesor;
        this.identificacionProfesor = identificacionProfesor;
        this.identificacionPersona = identificacionPersona;
    }

    public int getidHorarioProfesor() {
        return idHorarioProfesor;
    }

    public String getmateriaProfesor() {
        return materiaProfesor;
    }

    public LocalDate getfechaInicioProfesor() {
        return fechaInicioProfesor;
    }

    public LocalDate getfechaFinalizacionProfesor() {
        return fechaFinalizacionProfesor;
    }

    public LocalTime gethoraInicioProfesor() {
        return horaInicioProfesor;
    }

    public LocalTime gethoraFinProfesor() {
        return horaFinProfesor;
    }

    public String getinstituto() {
        return instituto;
    }

    public String getrecurrenciaDiaProfesor() {
        return recurrenciaDiaProfesor;
    }

    public String getidentificacionProfesor() {
        return identificacionProfesor;
    }

    public String getidentificacionPersona() {
        return identificacionPersona;
    }

    public void setidHorarioProfesor(int idHorarioProfesor) {
        this.idHorarioProfesor = idHorarioProfesor;
    }

    public void setmateriaProfesor(String materiaProfesor) {
        this.materiaProfesor = materiaProfesor;
    }

    public void setfechaInicioProfesor(LocalDate fechaInicioProfesor) {
        this.fechaInicioProfesor = fechaInicioProfesor;
    }

    public void setfechaFinalizacionProfesor(LocalDate fechaFinalizacionProfesor) {
        this.fechaFinalizacionProfesor = fechaFinalizacionProfesor;
    }

    public void sethoraInicioProfesor(LocalTime horaInicioProfesor) {
        this.horaInicioProfesor = horaInicioProfesor;
    }

    public void sethoraFinProfesor(LocalTime horaFinProfesor) {
        this.horaFinProfesor = horaFinProfesor;
    }

    public void setinstituto(String instituto) {
        this.instituto = instituto;
    }

    public void setrecurrenciaDiaProfesor(String recurrenciaDiaProfesor) {
        this.recurrenciaDiaProfesor = recurrenciaDiaProfesor;
    }

    public void setidentificacionProfesor(String identificacionProfesor) {
        this.identificacionProfesor = identificacionProfesor;
    }

    public void setidentificacionPersona(String identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }

    public void crearHorario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el id Horario: ");
        idHorarioProfesor = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la materia: ");
        materiaProfesor = sc.nextLine();

        System.out.println("Ingrese la fecha de inicio (YYYY-MM-DD): ");
        fechaInicioProfesor = LocalDate.parse(sc.nextLine());

        System.out.println("Ingrese la fecha de finalización (YYYY-MM-DD): ");
        fechaFinalizacionProfesor = LocalDate.parse(sc.nextLine());

        System.out.println("Ingrese la hora inicial (HH:mm): ");
        horaInicioProfesor = LocalTime.parse(sc.nextLine());

        System.out.println("Ingrese la hora fin (HH:mm): ");
        horaFinProfesor = LocalTime.parse(sc.nextLine());

        System.out.println("Ingrese el instituto: ");
        instituto = sc.nextLine();

        System.out.println("Ingrese la recurrencia: ");
        recurrenciaDiaProfesor = sc.nextLine();

        System.out.println("Ingrese la identificación del profesor: ");
        identificacionProfesor = sc.nextLine();

        System.out.println("Ingrese la identificación de la persona: ");
        identificacionPersona = sc.nextLine();

    }

    public void mostrarHorario() {

        System.out.println("El Horario ha sido creado. ");
        System.out.println("El id delhorario es: " + idHorarioProfesor);
        System.out.println("La materia es: " + materiaProfesor);
        System.out.println("La fecha inicial es: " + fechaInicioProfesor);
        System.out.println("La fecha final es: " + fechaFinalizacionProfesor);
        System.out.println("La hora inicial es: " + horaInicioProfesor);
        System.out.println("La hora de finalización: " + horaFinProfesor);
        System.out.println("El instituto es: " + instituto);
        System.out.println("La recurrencia es: " + recurrenciaDiaProfesor);
        System.out.println("La identificación del profesor es: " + identificacionProfesor);
        System.out.println("La identificación personal: " + identificacionPersona);
    }

}