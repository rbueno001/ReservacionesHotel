import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Huesped huesped = new Huesped("Raquel Bueno", "184000008611", "84000000", "raquelbueno01@gmail.com");
        Habitacion habitacion = hotel.getHabitaciones().get(20);
        Reservacion reservacion = new Reservacion(1, huesped, habitacion,
                LocalDate.of(2026, 11, 1), LocalDate.of(2026, 11, 4));

        hotel.registrarReservacion(reservacion);

        long cantidadNoches = ChronoUnit.DAYS.between(reservacion.getFechaIngreso(), reservacion.getFechaSalida());
        double costoTotal = habitacion.getPrecioPorNoche() * cantidadNoches;

        System.out.println("Reservación: " + reservacion.getNumeroReservacion());
        System.out.println("Nombre del huésped: " + huesped.getNombreCompleto());
        System.out.println("Número de identificación: " + huesped.getNumeroIdentificacion());
        System.out.println("Correo: " + huesped.getCorreoElectronico());
        System.out.println("Número de habitación: " + habitacion.getNumeroHabitacion());
        System.out.println("Tipo de habitación: " + habitacion.getTipoHabitacion().toLowerCase());
        System.out.println("Precio por noche: $" + (int) habitacion.getPrecioPorNoche());
        System.out.println("Fecha de ingreso: " + reservacion.getFechaIngreso());
        System.out.println("Fecha de salida: " + reservacion.getFechaSalida());
        System.out.println("Costo total: $" + costoTotal);
    }
}
