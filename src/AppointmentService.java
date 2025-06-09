import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AppointmentService {

    public static LocalDateTime parseAppointmentTime(String timeStr) {
        try {
            return LocalDateTime.parse(timeStr); 
        } catch (DateTimeParseException e) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            return LocalDateTime.parse(timeStr, formatter);
        }
    }

    public static String formatAppointmentTime(LocalDateTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");
        return time.format(formatter);
    }

    public static String formatAppointmentTimeISO(LocalDateTime time) {
        return time.toString();     }
}
