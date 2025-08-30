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

    // CREATE

    /*public String create(int id_solicitud,
            String numeroDocumento,
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
            Request request = new Request(id_solicitud,
            numeroDocumento,
            primerApellido,
            segundoApellido,
            nombre,
            municipioNacimiento,
            fechaDeNacimiento,
            municipioResidencia,
            direccion,
            numeroContacto,
            estrato,
            correoElectronico,
            nombreInstitucion,
            anoTitulo,
            genero,
            estadoCivil,
            programasOpciones);
            this.requests.add(request); // Uso de la lista
            return "Solicitud de admisión enviada, Esté atento a sus medios de contacto dónde se le irá notificando la gestión";

        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo de nuevo";
        }*

    }

    //UPDATE


    /*public String update(
            int index,
            int id_solicitud,
            String numeroDocumento,
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
            Request requestFound = new Request();
            for(int i = 0; i < requests.size(); i++){
                if(index == 1){
                    
                }
            }

        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo de nuevo";
        }

    }*/
}
