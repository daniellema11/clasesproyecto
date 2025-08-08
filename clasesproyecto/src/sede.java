import java.util.Scanner;

public class sede {
    private int idSede;
    private String nombreSede;

    Scanner sc = new Scanner(System.in);


    public sede() {

    }

     public sede(int idSede, String nombreSede) {
        this.idSede = idSede;
        this.nombreSede = nombreSede;
    }

    public int getidSede() {
        return idSede;
    }

    public void setidSede(int idSede) {
        this.idSede = idSede;
    }

     public String getrnombreSede() {
        return nombreSede;
    }

    public void setnombreSede(String nombreSede ) {
        this.nombreSede = nombreSede;
    }

    void elegirSede (){
        System.out.println("\"Ingrese la sede a la que quiere ingresar (1-Rionegro, 2-Bello, 3-Medellín): \"");
        idSede = sc.nextInt();

        if (idSede == 1) {
            System.out.println("Bienvendo a la sede de Rionegro");
        } else if (idSede == 2) {
            System.out.println("Bienvenido a la sede de Bello");
        
        } else if (idSede == 3) {
            System.out.println("Bienvenido a la sede de Medellín");
        
        }

    
    }
}