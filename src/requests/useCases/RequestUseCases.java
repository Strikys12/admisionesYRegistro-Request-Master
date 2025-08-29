package requests.useCases;

    import java.util.ArrayList;
    import java.util.List;

import requests.models.Request;

// Contenedor métodos y atributos
public class RequestUseCases {

    // Propiedad
    private final List<Request> request;

    // Constructor
    public RequestUseCases() {
        this.request = new ArrayList<>();
    }

    // CREATE

    public String create(String name, String id, String email, String numberCellPhone) {
        try {
            Request request = new Request(name, id, email, numberCellPhone, false);
            this.request.add(request); // Uso de la lista
            return "Solicitud de admisión enviada, Esté atento a sus medios de contacto dónde se le irá notificando la gestión";

        } catch (Exception e) {
            return "Ha ocurrido un error, por favor intentelo de nuevo";
        }

    }
}
