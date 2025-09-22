public class horario {
    protected String fechaInicio;
    protected String fechaFin;
    protected String horaInicio;
    protected String horaFin;
    protected String materia;
    protected String recurrenciaDia;
    protected String identificacionPersona;

    public horario() {
    }

    public horario(String fechaInicio, String fechaFin,
            String horaInicio,
            String horaFin, String materia, String recurrenciaDia,
            String identificacionPersona) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.materia = materia;
        this.recurrenciaDia = recurrenciaDia;
        this.identificacionPersona = identificacionPersona;
    }

    
    public void mostrarHorario() {
        System.out.println("Materia: " + materia);
        System.out.println("Hora inicio: " + horaInicio);
        System.out.println("Hora fin: " + horaFin);
        System.out.println("Fecha inicio: " + fechaInicio);
        System.out.println("Fecha fin: " + fechaFin);
        System.out.println("Recurrencia: " + recurrenciaDia);
        System.out.println("Profesor: " + identificacionPersona);
    
    }
}