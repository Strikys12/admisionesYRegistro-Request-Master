package requests.models;

import java.time.LocalDate; //Importamos la clase LocalDate para manipular datos con fechas esto nos permite evitar errores de formato y realizar operaciones con fechas más eficientes
import java.util.List;

public class Request {
  
    // ID de solicitud
    private final int idSolicitud;

    // INFORMACIÓN DE IDENTIFICACIÓN
    private final String numeroDocumento;
    private final String primerApellido;
    private final String segundoApellido;
    private final String nombre;

    // INFORMACIÓN DE NACIMIENTO
    private final String municipioNacimiento;
    private final LocalDate fechaDeNacimiento;

    // INFORMACIÓN DE RESIDENCIA ACTUAL Y CONTACTO
    private final String municipioResidencia;
    private final String direccion;
    private final String numeroContacto;
    private final int estrato;
    private final String correoElectronico;

    // Información del título de Secundaria
    private final String nombreInstitucion;
    private final LocalDate anoTitulo;

    // Otra información
    private final String genero;
    private final String estadoCivil;

    // Programas a los cuales aspira
    private final List<String> programasOpciones;

    // Constructores


    public Request(
            int idSolicitud,
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

        this.idSolicitud = idSolicitud;
        this.primerApellido = primerApellido;
        this.numeroDocumento = numeroDocumento;
        this.segundoApellido = segundoApellido;
        this.nombre = nombre;
        this.municipioNacimiento = municipioNacimiento;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.municipioResidencia = municipioResidencia;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
        this.estrato = estrato;
        this.correoElectronico = correoElectronico;
        this.nombreInstitucion = nombreInstitucion;
        this.anoTitulo = anoTitulo;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.programasOpciones = programasOpciones;

    }

    // SETTERS//
   
    //Se omiten los setters por la seguridad de los datos ya que lo idela es que la mayoría no puedan ser modificados por eso asignamos la palabra final a los atributos.
    
    // GETTERS//

    public int getIdSolicitud(){
        return idSolicitud;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMunicipioNacimiento() {
        return municipioNacimiento;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getMunicipioResidencia() {
        return municipioResidencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public int getEstrato() {
        return estrato;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public LocalDate getAnoTitulo() {
        return anoTitulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public List<String> getProgramasOpciones() {
        return programasOpciones;
    }

}
