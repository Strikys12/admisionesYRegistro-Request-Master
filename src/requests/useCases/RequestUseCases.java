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
            if (requests.size() == 0) {
                return "No hay ningún requerimiento";
            } else {
                for (int i = 0; i < requests.size(); i++) {

                    Request request = requests.get(i); // Se obtiene la tarea.
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

                            .append("Programas que aspira: ").append(request.getProgramasOpciones()).append("\n")

                            .append("\n\n");

                }

                return result.toString();
            }

        } catch (Exception e) {
            return "No ha sido posible listar las solicitudes.";
        }
    }

    // ReadIndex

    public String findByIndex(int index) {
        try {

            StringBuilder requestFound = new StringBuilder();
            for (int i = 0; i < requests.size(); i++) {
                if (index == i) {
                    Request request = requests.get(index);
                    requestFound.append("ID: ").append(request.getIdSolicitud()).append("\n")

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
            }

            return requestFound.toString();

        } catch (Exception e) {
            return "no ha sido posible encontrar el requerimiento.";
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

            int newId = this.requests.size();
            Request newRequest = new Request(newId, numeroDocumento, primerApellido, segundoApellido, nombre,
                    municipioNacimiento, fechaDeNacimiento, municipioResidencia, direccion, numeroContacto, estrato,
                    correoElectronico, nombreInstitucion, anoTitulo, genero, estadoCivil, programasOpciones);

            this.requests.add(newRequest);
            return "Solicitud con ID " + newRequest.getIdSolicitud() + " ha sido creada exitosamente.";

        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo nuevo";
        }
    }

    // DELETE

    public String delete(int index) {

        try {

            requests.remove(index);

            return "El requerimiento # " + (index) + ", Se ha eliminado correctamente";

        } catch (Exception e) {
            return "Hubo un error y no pudo borrarse la solicitud";
        }
    }

    // UPDATE

    public String update(int id, String numeroDocumento,
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
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < requests.size(); i++) {
                if (id == i) {
                    Request request = requests.get(id);
                    request.setNumeroDocumento(numeroDocumento);
                    request.setPrimerApellido(primerApellido);
                    request.setSegundoApellido(segundoApellido);
                    request.setNombre(nombre);
                    request.setMunicipioNacimiento(municipioNacimiento);
                    request.setFechaDeNacimiento(fechaDeNacimiento);
                    request.setMunicipioResidencia(municipioResidencia);
                    request.setDireccion(direccion);
                    request.setNumeroContacto(numeroContacto);
                    request.setEstrato(estrato);
                    request.setCorreoElectronico(correoElectronico);
                    request.setNombreInstitucion(nombreInstitucion);
                    request.setAnoTitulo(anoTitulo);
                    request.setGenero(genero);
                    request.setEstadoCivil(estadoCivil);
                    request.setProgramasOpciones(programasOpciones);

                    requestFound = request;

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

                            .append("Programas que aspira: ").append(request.getProgramasOpciones()).append("\n")

                            .append("\n\n");

                }
            }

            return "Datos actualizados Correctamente: \n\n" + result.toString();

        } catch (Exception e) {
            return "Hubo un error, por favor, vuelva a intentarlo.";
        }
    }
}
