package loginEstudiante.useCases;

import loginEstudiante.models.loginEstudiante;
import java.util.ArrayList;
import java.util.List;

public class loginEstudianteUseCase {
    private List<loginEstudiante> estudiantesRegistrados;

    public loginEstudianteUseCase() {
        estudiantesRegistrados = new ArrayList<>();

        // Simulación estudiantes ya registrados
        estudiantesRegistrados.add(new loginEstudiante("ana123", "12345"));
        estudiantesRegistrados.add(new loginEstudiante("juan456", "abcde"));
    }

    public boolean autenticar(String usuario, String contrasena) {
        for (loginEstudiante estudiante : estudiantesRegistrados) {
            if (estudiante.getUsuario().equals(usuario) && estudiante.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }
}
