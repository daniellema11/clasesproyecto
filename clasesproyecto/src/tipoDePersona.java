import java.util.Scanner;

public class tipoDePersona {
    private int idRol;
    private String rolPersona;

    Scanner sc = new Scanner(System.in);


    public tipoDePersona() {

    }

    public tipoDePersona(int idRol, String rolPersona) {
        this.idRol = idRol;
        this.rolPersona = rolPersona;
    }

    public int getidRol() {
        return idRol;
    }

    public void setidRol(int idRol) {
        this.idRol = idRol;
    }

    public String getrolPersona() {
        return rolPersona;
    }

    public void setrolPersona(String rolPersona) {
        this.rolPersona = rolPersona;
    }

    void tipoRol (){
        System.out.println("\"Ingrese el rol de la persona (1-Administrador, 2-Profesor): \"");
        idRol = sc.nextInt();

        if (idRol == 1) {
            System.out.println("Bienveido Administrador");
        } else if (idRol == 2) {
            System.out.println("Bienveido Profesor");
        
        }
    
    }

}