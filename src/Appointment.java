import java.time.LocalDateTime;

public class Appointment {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime appointmentTime;
    private String status;

    public Appointment(int id, Patient patient, Doctor doctor, LocalDateTime appointmentTime, String status) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentTime = appointmentTime;
        this.status = status;
    }

        public String getFormattedTime() {
        return AppointmentService.formatAppointmentTime(this.appointmentTime);
    }

       public String getIsoFormattedTime() {
        return AppointmentService.formatAppointmentTimeISO(this.appointmentTime);
    }

        public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public String getStatus() {
        return status;
    }
}
