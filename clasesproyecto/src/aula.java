import java.util.Scanner;

public class aula {
    private int idAula;
    private String nombreAula;

    Scanner sc = new Scanner(System.in);

    public aula() {
    }

    public aula(int idAula, String nombreAula) {
        this.idAula = idAula;
        this.nombreAula = nombreAula;
    }

    public int getidAula() {
        return idAula;
    }

    public void setidAula(int idAula) {
        this.idAula = idAula;
    }

    public String getnombreAula() {
        return nombreAula;
    }

    public void setnombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }

    public void elegirAula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Ingrese cantidad de estudiantes (1- De 1 a 20 estudiantes, 2- De 21 a 30 estudiantes, 3- De 31 a 40 estudiantes): ");
        idAula = sc.nextInt();

        if (idAula == 1) {
            System.out.println("Aula 501");
        } else if (idAula == 2) {
            System.out.println("Aula 502");
        } else if (idAula == 3) {
            System.out.println("Aula 503");

            scanner.close();
        }
    }
}