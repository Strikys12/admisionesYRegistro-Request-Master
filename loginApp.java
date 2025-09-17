import loginEstudiante.useCases.LoginEstudianteUseCase;
import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        LoginEstudianteUseCase loginUseCase = new LoginEstudianteUseCase();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== LOGIN PORTAL DE ADMISIONES =====");
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();

        boolean autenticado = loginUseCase.autenticar(usuario, contrasena);

        if (autenticado) {
            System.out.println("Bienvenido al sistema " + usuario);
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }

        sc.close();
    }
}
