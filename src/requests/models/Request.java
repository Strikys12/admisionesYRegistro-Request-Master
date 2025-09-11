package requests.models;

import java.time.LocalDate; //Importamos la clase LocalDate para manipular datos con fechas esto nos permite evitar errores de formato y realizar operaciones con fechas más eficientes
import java.util.List;

public class Request {
  
    // ID de solicitud
    private  int idSolicitud;

    // INFORMACIÓN DE IDENTIFICACIÓN
    private String numeroDocumento;
    private String primerApellido;
    private String segundoApellido;
    private String nombre;

    // INFORMACIÓN DE NACIMIENTO
    private String municipioNacimiento;
    private LocalDate fechaDeNacimiento;

    // INFORMACIÓN DE RESIDENCIA ACTUAL Y CONTACTO
    private String municipioResidencia;
    private String direccion;
    private String numeroContacto;
    private int estrato;
    private String correoElectronico;

    // Información del título de Secundaria
    private String nombreInstitucion;
    private LocalDate anoTitulo;

    // Otra información
    private  String genero;
    private  String estadoCivil;

    // Programas a los cuales aspira
    private  List<String> programasOpciones;

    // Constructores

    public Request(){

    }

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

    //SETTERS//
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMunicipioNacimiento(String municipioNacimiento) {
        this.municipioNacimiento = municipioNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setMunicipioResidencia(String municipioResidencia) {
        this.municipioResidencia = municipioResidencia;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public void setAnoTitulo(LocalDate anoTitulo) {
        this.anoTitulo = anoTitulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setProgramasOpciones(List<String> programasOpciones) {
        this.programasOpciones = programasOpciones;
    }

    
}



