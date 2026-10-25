public class Huesped {
    // Atributos
    private String nombreCompleto;
    private String numeroIdentificacion;
    private String telefono;
    private String correoElectronico;


    // Constructor
    public Huesped(String nombreCompleto, String numeroIdentificacion, String telefono, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    // Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // toString()
    @Override
    public String toString() {
        return "Huesped{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

}
