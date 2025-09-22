public class Profesor extends persona {
    
    public Profesor() {
        super();
        this.id_rol = 2;
    }
    
    public Profesor(String identificacion, String nombre, String correo, String contrasena) {
        super(identificacion, nombre, correo, contrasena, 2);
    }
    
    @Override
    public void mostrarRol() {
        System.out.println("Rol: PROFESOR");
        System.out.println("Responsable de impartir clases y consultar horarios");
    }
    
    public void consultarHorario() {
        System.out.println("Consultando horario personal...");
    }
}