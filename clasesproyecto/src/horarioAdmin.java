import java.util.Scanner;

public class horarioAdmin {
    private int idHorario;
    private String fechaInicio;
    private String horaInicio;
    private String horaFin;
    private String inicioPeriodo;
    private String finPeriodo;
    private String recurrenciaDia;
    private String materia;
    private String sede;
    private String aula;
    private String identificacionPersona;

    Scanner sc = new Scanner(System.in);

    public horarioAdmin(){

    }

    public horarioAdmin(int idHorario, String fechaInicio, String horaInicio, String horaFin, String inicioPeriodo, String finPeriodo, String recurrenciaDia, String materia, String sede, String aula, String identificacionPersona) {
        this.idHorario = idHorario;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.inicioPeriodo = inicioPeriodo;
        this.finPeriodo = finPeriodo;
        this.recurrenciaDia = recurrenciaDia;
        this.materia = materia;
        this.sede = sede;
        this.aula = aula;
        this.identificacionPersona = identificacionPersona;
    }


    public int getIdHorario() {
        return this.idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return this.horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getInicioPeriodo() {
        return this.inicioPeriodo;
    }

    public void setInicioPeriodo(String inicioPeriodo) {
        this.inicioPeriodo = inicioPeriodo;
    }

    public String getFinPeriodo() {
        return this.finPeriodo;
    }

    public void setFinPeriodo(String finPeriodo) {
        this.finPeriodo = finPeriodo;
    }

    public String getRecurrenciaDia() {
        return this.recurrenciaDia;
    }

    public void setRecurrenciaDia(String recurrenciaDia) {
        this.recurrenciaDia = recurrenciaDia;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getSede() {
        return this.sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getIdentificacionPersona() {
        return this.identificacionPersona;
    }

    public void setIdentificacionPersona(String identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }

    public void ingresarHorario(){
        System.out.println("Admin Ingresa el horario del profesor: ");
        
        System.out.println("________________________");
        
        System.out.println("Ingrese el Id del Horario: ");
        idHorario = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la Fecha de Inicio: ");
        fechaInicio = sc.nextLine();

        System.out.println("Ingrese la Hora de Inicio: ");
        horaInicio = sc.nextLine();

        System.out.println("Ingrese la Hora de Fin: ");
        horaFin = sc.nextLine();

        System.out.println("Ingrese el Inicio del Periodo: ");
        inicioPeriodo = sc.nextLine();

        System.out.println("Ingrese el Fin del Periodo: ");
        finPeriodo = sc.nextLine();

        System.out.println("Ingrese la Recurrencia del Dia: ");
        recurrenciaDia = sc.nextLine();

        System.out.println("Ingrese la Materia: ");
        materia = sc.nextLine();

        System.out.println("Ingrese la Sede: ");
        sede = sc.nextLine();

        System.out.println("Ingrese el Aula: ");
        aula = sc.nextLine();

        System.out.println("Ingrese la Identificacion de la Persona: ");
        identificacionPersona = sc.nextLine();

        System.out.println("Horario ingresado correctamente.");
    }

}
