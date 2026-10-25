import java.util.ArrayList;
public class Hotel {
    // Atributos
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reservacion> reservaciones;

    // Constructor
    public Hotel() {
        habitaciones = new ArrayList<Habitacion>();
        reservaciones = new ArrayList<Reservacion>();

        for (int i = 1; i <= 20; i++) {
            habitaciones.add(new Habitacion(i, "Sencilla", 75, true));
        }
        for (int i = 21; i <= 40; i++) {
            habitaciones.add(new Habitacion(i, "Doble", 100, true));
        }
        for (int i = 41; i <= 50; i++) {
            habitaciones.add(new Habitacion(i, "Suite", 150, true));
        }
    }

    // Getters
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public ArrayList<Reservacion> getReservaciones() {
        return reservaciones;
    }

    // Metodos
    public void mostrarHabitaciones() {
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion);
        }
    }
    public void registrarReservacion(Reservacion reservacion) {
        reservaciones.add(reservacion);
    }
}
