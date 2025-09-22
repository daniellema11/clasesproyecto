public abstract class persona {
    protected String identificacionPersona;
    protected String nombrePersona;
    protected String correoPersona;
    protected String contrasenaPersona;
    protected int id_rol;

    public persona() {
    }

    public persona(String identificacionPersona, String nombrePersona, String correoPersona, String contrasenaPersona,
            int id_rol) {
        this.identificacionPersona = identificacionPersona;
        this.nombrePersona = nombrePersona;
        this.correoPersona = correoPersona;
        this.contrasenaPersona = contrasenaPersona;
        this.id_rol = id_rol;
    }

    void mostrarInformacion() {

        System.out.println("La identificacion de la persona es: " + identificacionPersona);
        System.out.println("El nombre de la persona es: " + nombrePersona);
        System.out.println("El correo de la persona es: " + correoPersona);
        System.out.println("La contraseña de la persona es: " + contrasenaPersona);
        System.out.println("El rol de la persona es: " + id_rol);
    }

    void creandoPersona() {
        System.out.println("creando usuario persona");
    }

    public abstract void mostrarRol();
    

}
