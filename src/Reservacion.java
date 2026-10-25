import java.time.LocalDate;
public class Reservacion {
    // Atributos
    private int numeroReservacion;
    private Huesped huesped;
    private Habitacion habitacion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;

    // Constructor
    public Reservacion(int numeroReservacion, Huesped huesped, Habitacion habitacion, LocalDate fechaIngreso, LocalDate fechaSalida) {
        this.numeroReservacion = numeroReservacion;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    // Getters
    public int getNumeroReservacion() {
        return numeroReservacion;
    }
    public Huesped getHuesped() {
        return huesped;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    // Setters
    public void setNumeroReservacion(int numeroReservacion) {
        this.numeroReservacion = numeroReservacion;
    }
    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    // Metodos
    public double calcularCosto(Habitacion habitacion, int noches) {
        return habitacion.getPrecioPorNoche() * noches;
    }

    // toString()
    @Override
    public String toString() {
        return "Reservacion{" +
                "numeroReservacion=" + numeroReservacion +
                ", huesped=" + huesped +
                ", habitacion=" + habitacion +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}
