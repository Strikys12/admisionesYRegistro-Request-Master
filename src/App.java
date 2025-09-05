import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import requests.models.Request;
import requests.useCases.RequestUseCases;;

public class App{
    public static void main(String[] args) throws Exception{

        RequestUseCases request = new RequestUseCases();
        
        //DATOS

        String numeroDocumento = "1020304050";
        String primerApellido = "Gómez";
        String segundoApellido = "Pérez";
        String nombre = "Juan";
        String municipioNacimiento = "Medellín";
        LocalDate fechaDeNacimiento = LocalDate.of(2000, 5, 20);
        String municipioResidencia = "Envigado";
        String direccion = "Calle 10 # 20-30";
        String numeroContacto = "3001234567";
        int estrato = 3;
        String correoElectronico = "juan.gomez@example.com";
        String nombreInstitucion = "Colegio Mayor";
        LocalDate anoTitulo = LocalDate.of(2018, 6, 15);
        String genero = "Masculino";
        String estadoCivil = "Soltero";
        
        // Creamos una lista de programas a los que aspira
        List<String> programasOpciones = new ArrayList<>();
        programasOpciones.add("Ingeniería de Sistemas");
        programasOpciones.add("Diseño Gráfico");

       String resultado = request.create(numeroDocumento, primerApellido, segundoApellido, nombre, municipioNacimiento, fechaDeNacimiento, municipioResidencia, direccion, numeroContacto, estrato, correoElectronico, nombreInstitucion, anoTitulo, genero, estadoCivil, programasOpciones);

       System.out.println(resultado);
       System.out.println("\n");



       //READ

       String read = request.read();
       System.out.println(read);
    }
}