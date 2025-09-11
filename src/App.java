import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import requests.models.Request;
import requests.useCases.RequestUseCases;;

public class App {
  public static void main(String[] args) throws Exception {

    RequestUseCases request = new RequestUseCases();

    // DATOS

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

    // Datos de la nueva solicitud
    String numeroDocumento2 = "9876543210";
    String primerApellido2 = "Pérez";
    String segundoApellido2 = "López";
    String nombre2 = "Ana";
    String municipioNacimiento2 = "Bogotá";
    LocalDate fechaDeNacimiento2 = LocalDate.of(1999, 11, 8);
    String municipioResidencia2 = "Suba";
    String direccion2 = "Carrera 50 # 15-25";
    String numeroContacto2 = "3159876543";
    int estrato2 = 4;
    String correoElectronico2 = "ana.perez@example.com";
    String nombreInstitucion2 = "Instituto Técnico Central";
    LocalDate anoTitulo2 = LocalDate.of(2017, 10, 20);
    String genero2 = "Femenino";
    String estadoCivil2 = "Casada";

    // Creamos una lista de programas a los que aspira
    List<String> programasOpciones2 = new ArrayList<>();
    programasOpciones2.add("Arquitectura");
    programasOpciones2.add("Diseño Industrial");





    String resultado = request.create(numeroDocumento2, primerApellido2, segundoApellido2, nombre2,
    municipioNacimiento2, fechaDeNacimiento2, municipioResidencia2, direccion2, numeroContacto2, estrato2,
    correoElectronico2, nombreInstitucion2, anoTitulo2, genero2, estadoCivil2, programasOpciones2);

    System.out.println(resultado);

        String readAll = request.read();

         System.out.println(readAll);

    String update = request.update(0,numeroDocumento, primerApellido, segundoApellido, nombre, municipioNacimiento, fechaDeNacimiento, municipioResidencia, direccion, numeroContacto, estrato, correoElectronico, nombreInstitucion, anoTitulo, genero, estadoCivil, programasOpciones);

    System.out.println(update);
    


   
    
  }
}