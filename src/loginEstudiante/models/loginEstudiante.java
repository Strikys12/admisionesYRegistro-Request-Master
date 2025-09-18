package loginEstudiante.models;

import java.util.ArrayList;

public class LoginEstudiante {
    private String usuario;
    private String contrasena;

    // Constructor
    public LoginEstudiante(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // Getters and Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
