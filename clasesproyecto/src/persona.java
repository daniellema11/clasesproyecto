import java.util.Scanner;

public abstract class persona {
    protected String identificacionPersona;
    protected String nombrePersona;
    protected String correoPersona;
    protected String contrasenaPersona;
    protected int id_rol;

    Scanner sc = new Scanner(System.in);

    public void crearPersona() {
        System.out.print("Ingrese la identificacion de la persona: ");
        identificacionPersona = sc.nextLine();
        System.out.print("Ingrese el nombre de la persona: ");
        nombrePersona = sc.nextLine();
        System.out.print("Ingrese el correo de la persona: ");
        correoPersona = sc.nextLine();
        System.out.print("Ingrese la contraseña de la persona: ");
        contrasenaPersona = sc.nextLine();
        System.out.print("Ingrese el rol de la persona (1-Administrador, 2-Profesor): ");
        id_rol = sc.nextInt();
    }

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

    // public String getIdentificacionPersona() {
    //     return identificacionPersona;
    // }

    // public void setIdentificacionPersona(String identificacionPersona) {
    //     this.identificacionPersona = identificacionPersona;
    // }

    // public String getNombrePersona() {
    //     return nombrePersona;
    // }

    // public void setNombrePersona(String nombrePersona) {
    //     this.nombrePersona = nombrePersona;
    // }

    // public String getCorreoPersona() {
    //     return correoPersona;
    // }

    // public void setCorreoPersona(String correoPersona) {
    //     this.correoPersona = correoPersona;
    // }

    // public String getContrasenaPersona() {
    //     return contrasenaPersona;
    // }

    // public void setContrasenaPersona(String contrasenaPersona) {
    //     this.contrasenaPersona = contrasenaPersona;
    // }

    // public int getId_rol() {
    //     return id_rol;
    // }

    // public void setId_rol(int id_rol) {
    //     this.id_rol = id_rol;
    // }

    public abstract void mostrarRol();
    

}
