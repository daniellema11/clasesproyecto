import java.util.Scanner;

public class horarioAdmin extends horario {
    protected int idHorario;
    protected String inicioPeriodo;
    protected String finPeriodo;
    protected String sede;
    protected String aula;
    

    Scanner sc = new Scanner(System.in);

    public horarioAdmin(){
        super();
    }

    public horarioAdmin(int idHorario, String fechaInicio,String fechaFin, String horaInicio, String horaFin, String inicioPeriodo, String finPeriodo, String recurrenciaDia, String materia, String sede, String aula, String identificacionPersona) {
        super(fechaInicio, fechaFin, horaInicio, horaFin, materia, recurrenciaDia, identificacionPersona);
        this.idHorario = idHorario;
        this.inicioPeriodo = inicioPeriodo;
        this.finPeriodo = finPeriodo;
        this.sede = sede;
        this.aula = aula;
    }

    // public void ingresarHorario(){
    //     System.out.println("Admin Ingresa el horario del profesor: ");
        
    //     System.out.println("________________________");
        
    //     System.out.println("Ingrese el Id del Horario: ");
    //     idHorario = sc.nextInt();
    //     sc.nextLine();

    //     System.out.println("Ingrese el Inicio del Periodo: ");
    //     inicioPeriodo = sc.nextLine();

    //     System.out.println("Ingrese el Fin del Periodo: ");
    //     finPeriodo = sc.nextLine();

    //     System.out.println("Ingrese la Materia: ");
    //     materia = sc.nextLine();

    //     System.out.println("Ingrese la Sede: ");
    //     sede = sc.nextLine();

    //     System.out.println("Ingrese el Aula: ");
    //     aula = sc.nextLine();


    //     System.out.println("Horario ingresado correctamente.");
    // }

    
    @Override

    public void mostrarHorario() {
        
        System.out.println("\n=== INFORMACIÓN ADMINISTRATIVA ===");
        System.out.println("ID Horario: " + idHorario);
        System.out.println("Periodo: " + inicioPeriodo + " - " + finPeriodo);
        System.out.println("Sede: " + sede);
        System.out.println("Aula: " + aula);
        super.mostrarHorario(); 

    }

    public String obtenerResumenHorario() {
        return "\n=== RESUMEN DEL HORARIO ===\n"
        + "Horario #" + idHorario + " - " + super.materia + 
               " (" + super.horaInicio + "-" + super.horaFin + ") en " + sede;
    }

}
