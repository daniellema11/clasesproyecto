public class Administrador extends persona {
    
    public Administrador() {
        super();
        this.id_rol = 1;
    }
    
    public Administrador(String identificacion, String nombre, String correo, String contrasena) {
        super(identificacion, nombre, correo, contrasena, 1);
    }
    

    @Override
    public void mostrarRol() {
        System.out.println("Rol: ADMINISTRADOR");
        System.out.println("Responsable de gestionar horarios y usuarios");
    }
    
    
    public void gestionarSistema() {
        System.out.println("Accediendo al panel de administración...");
    }
}