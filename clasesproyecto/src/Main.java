public class Main {
    public static void main(String[] args) throws Exception {

// herencias y super clases

        horarioAdmin ha = new horarioAdmin(1, "2025-01-01", "2025-06-31", "08:00", "10:00", "2025-01-01", "2025-06-31",
                "lunes", "logica", "bello", "503", "987654321");
        ha.mostrarHorario();
        System.out.println(ha.obtenerResumenHorario());


        horarioProfesor hp = new horarioProfesor(1, "fotografia", "2025-07-01", "2025-12-31", "12:00", "02:00", "UDEA",
                "viernes", "123456789");
        hp.mostrarHorario();
        System.out.println(hp.obtenerResumenHorario());

// abstracccion
        
        Administrador admin = new Administrador("123456", "Juan Pérez", "juan@admin.com", "admin123");

        Profesor profesor = new Profesor("789012", "María García", "maria@prof.com", "prof456");
        
        persona[] usuarios = {admin, profesor};
        
        System.out.println("MOSTRANDO ROLES:");
        for (persona user : usuarios) {
            user.mostrarRol(); 
        }

    }
}
