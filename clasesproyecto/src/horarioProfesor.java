import java.util.Scanner;

public class horarioProfesor {
    private int idHorarioProfesor;
    private String materiaProfesor;
    private String fechaInicioProfesor;
    private String fechaFinalizacionProfesor;
    private String horaInicioProfesor;
    private String horaFinProfesor;
    private String instituto;
    private String recurrenciaDiaProfesor;
    private String identificacionPersona;

    public horarioProfesor() {
    }

    public horarioProfesor(int idHorarioProfesor, String materiaProfesor, String fechaInicioProfesor,
            String fechaFinalizacionProfesor, String horaInicioProfesor, String horaFinProfesor,
            String instituto, String recurrenciaDiaProfesor,
            String identificacionPersona) {
        this.idHorarioProfesor = idHorarioProfesor;
        this.materiaProfesor = materiaProfesor;
        this.fechaInicioProfesor = fechaInicioProfesor;
        this.fechaFinalizacionProfesor = fechaFinalizacionProfesor;
        this.horaInicioProfesor = horaInicioProfesor;
        this.horaFinProfesor = horaFinProfesor;
        this.instituto = instituto;
        this.recurrenciaDiaProfesor = recurrenciaDiaProfesor;
        this.identificacionPersona = identificacionPersona;
    }

    public int getidHorarioProfesor() {
        return idHorarioProfesor;
    }

    public String getmateriaProfesor() {
        return materiaProfesor;
    }

    public String getfechaInicioProfesor() {
        return fechaInicioProfesor;
    }

    public String getfechaFinalizacionProfesor() {
        return fechaFinalizacionProfesor;
    }

    public String gethoraInicioProfesor() {
        return horaInicioProfesor;
    }

    public String gethoraFinProfesor() {
        return horaFinProfesor;
    }

    public String getinstituto() {
        return instituto;
    }

    public String getrecurrenciaDiaProfesor() {
        return recurrenciaDiaProfesor;
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

    public void setfechaInicioProfesor(String fechaInicioProfesor) {
        this.fechaInicioProfesor = fechaInicioProfesor;
    }

    public void setfechaFinalizacionProfesor(String fechaFinalizacionProfesor) {
        this.fechaFinalizacionProfesor = fechaFinalizacionProfesor;
    }

    public void sethoraInicioProfesor(String horaInicioProfesor) {
        this.horaInicioProfesor = horaInicioProfesor;
    }

    public void sethoraFinProfesor(String horaFinProfesor) {
        this.horaFinProfesor = horaFinProfesor;
    }

    public void setinstituto(String instituto) {
        this.instituto = instituto;
    }

    public void setrecurrenciaDiaProfesor(String recurrenciaDiaProfesor) {
        this.recurrenciaDiaProfesor = recurrenciaDiaProfesor;
    }

    public void setidentificacionPersona(String identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }

    public void crearHorario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("profesor Ingrese el id de tu Horario: ");
        idHorarioProfesor = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la materia: ");
        materiaProfesor = sc.nextLine();

        System.out.println("Ingrese la fecha de inicio (YYYY-MM-DD): ");
        fechaInicioProfesor = sc.nextLine();

        System.out.println("Ingrese la fecha de finalización (YYYY-MM-DD): ");
        fechaFinalizacionProfesor = sc.nextLine();

        System.out.println("Ingrese la hora inicial (HH:mm): ");
        horaInicioProfesor = sc.nextLine();

        System.out.println("Ingrese la hora fin (HH:mm): ");
        horaFinProfesor = sc.nextLine();

        System.out.println("Ingrese el instituto: ");
        instituto = sc.nextLine();

        System.out.println("Ingrese la recurrencia: ");
        recurrenciaDiaProfesor = sc.nextLine();

        System.out.println("Ingrese la identificación de la persona: ");
        identificacionPersona = sc.nextLine();

        System.out.println("El Horario ha sido creado. ");

    }

    public void mostrarHorario() {

        System.out.println("___________________________________");

        System.out.println("El id delhorario es: " + idHorarioProfesor);
        System.out.println("La materia es: " + materiaProfesor);
        System.out.println("La fecha inicial es: " + fechaInicioProfesor);
        System.out.println("La fecha final es: " + fechaFinalizacionProfesor);
        System.out.println("La hora inicial es: " + horaInicioProfesor);
        System.out.println("La hora de finalización: " + horaFinProfesor);
        System.out.println("El instituto es: " + instituto);
        System.out.println("La recurrencia es: " + recurrenciaDiaProfesor);
        System.out.println("La identificación personal: " + identificacionPersona);
    }

}