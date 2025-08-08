public class Main {
    public static void main(String[] args) throws Exception {

        tipoDePersona tp = new tipoDePersona();
        tp.tipoRol();

        System.out.println("__________________________________________");

        persona p = new persona();
        p.crearPersona();
        p.mostrarInformacion();
        p.creandoPersona();

        System.out.println("__________________________________________");

        horarioAdmin horarioAdm = new horarioAdmin();
        horarioAdm.ingresarHorario();

        System.out.println("__________________________________________");

        horarioProfesor hp = new horarioProfesor();
        hp.crearHorario();
        hp.mostrarHorario();

        System.out.println("__________________________________________");

        sede sede = new sede();
        sede.elegirSede();

        System.out.println("__________________________________________");

        materia materia = new materia();
        materia.nombreMaterias();

        System.out.println("__________________________________________");

        aula aula = new aula();
        aula.elegirAula();

    }
}
