import java.util.Scanner;

public class materia {
    private String nombremateria;
    private int id_materia;
    
    


     public void nombreMaterias() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una materia:");
        System.out.println("1. Gestion de Base de Datos");
        System.out.println("2. Programación de Aplicaciones Móviles 1");
        System.out.println("3. Programacion para la WEB 1");
        System.out.print("Ingrese el número de la opción: ");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Opción 1: Gestion de Base de Datos");
        } else if (opcion == 2) {
            System.out.println("Opción 2: Programación de Aplicaciones Móviles 1");
        } else if (opcion == 3) {
            System.out.println("Opción 3: Programacion para la WEB 1");
        } else {
            System.out.println("Opción inválida");
        }
        
    }
    public materia() {
    }

    public materia(String nombremateria, int id_materia) {
        this.nombremateria = nombremateria;
        this.id_materia = id_materia;
    }

    public String getNombremateria() {
        return nombremateria;
    }

    public void setNombremateria(String nombremateria) {
        this.nombremateria = nombremateria;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;

        
    }
}