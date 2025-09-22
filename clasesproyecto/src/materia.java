import java.util.Scanner;

public class materia {
    private String nombremateria;
    private int id_materia;
    
    
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