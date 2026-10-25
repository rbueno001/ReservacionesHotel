public class Habitacion {
    // Atributos
    private int numeroHabitacion;
    private String tipoHabitacion;
    private double precioPorNoche;
    private boolean disponible;

    // Constructor
    public Habitacion(int numeroHabitacion, String tipoHabitacion, double precioPorNoche, boolean disponible) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }

    // Getters
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
    public double getPrecioPorNoche() {
        return precioPorNoche;
    }
    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // toString()
    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", precioPorNoche=" + precioPorNoche +
                ", disponible=" + disponible +
                '}';
    }

}
