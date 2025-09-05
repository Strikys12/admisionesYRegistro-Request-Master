package requests.useCases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import requests.models.Request;

// Contenedor métodos y atributos
public class RequestUseCases {

    // Propiedad
    private final List<Request> requests;

    // Constructor
    public RequestUseCases() {
        this.requests = new ArrayList<>();
    }

    // READ
    public String read() {
        try {
            StringBuilder result = new StringBuilder(); 
            for (int i = 0; i < requests.size(); i++) { 
                Request request = requests.get(i); 
                result.append("ID: ").append(request.getIdSolicitud()).append("\n")

                        .append("Documento: ").append(request.getNumeroDocumento()).append("\n")

                        .append("Nombre: ").append(request.getNombre()).append("\n")

                        .append("Primer Apellido: ").append(request.getPrimerApellido()).append("\n")

                        .append("Segundo Apellido: ").append(request.getSegundoApellido()).append("\n")

                        .append("Municipio de Nacimiento: ").append(request.getMunicipioNacimiento()).append("\n")

                        .append("Fecha de Nacimiento: ").append(request.getFechaDeNacimiento()).append("\n")

                        .append("Municipio de Residencia: ").append(request.getMunicipioResidencia()).append("\n")

                        .append("Dirección: ").append(request.getDireccion())
                        .append("\n")

                        .append("Número de Contacto: ").append(request.getNumeroContacto()).append("\n")

                        .append("Estrato: ").append(request.getEstrato()).append("\n")


                        .append("Nombre de Institución: ").append(request.getNombreInstitucion()).append("\n")

                        .append("Año de Título: ").append(request.getAnoTitulo()).append("\n")

                        .append("Género: ").append(request.getGenero()).append("\n")

                        .append("Estado Civil: ").append(request.getEstadoCivil()).append("\n")

                        .append("Programas que aspira: ").append(request.getProgramasOpciones()).append("\n");

            }

            return result.toString();

        } catch (Exception e) {
            return "No ha sido posible listar las solicitudes.";
        }
    }

    // CREATE

    public String create(String numeroDocumento,
            String primerApellido,
            String segundoApellido,
            String nombre,
            String municipioNacimiento,
            LocalDate fechaDeNacimiento,
            String municipioResidencia,
            String direccion,
            String numeroContacto,
            int estrato,
            String correoElectronico,
            String nombreInstitucion,
            LocalDate anoTitulo,
            String genero,
            String estadoCivil,
            List<String> programasOpciones) {
        try {

            int newId = this.requests.size() + 1;
            Request newRequest = new Request(newId, numeroDocumento, primerApellido, segundoApellido, nombre,
                    municipioNacimiento, fechaDeNacimiento, municipioResidencia, direccion, numeroContacto, estrato,
                    correoElectronico, nombreInstitucion, anoTitulo, genero, estadoCivil, programasOpciones);

            this.requests.add(newRequest);
            return "Solicitud con ID " + newRequest.getIdSolicitud() + " ha sido creada exitosamente.";

        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }
}
