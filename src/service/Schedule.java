package service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import model.Appointment;

public class Schedule {

   private List<Appointment> appointments;

    
    public Schedule(List<Appointment> appointments) {
    this.appointments = appointments;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment){
        appointments.add(appointment);
    }

    public void removeAppointment(int id) {
        appointments.remove(id);
    }

    public void listAppointments() {
        for (Appointment obj : appointments) System.out.println(obj);
    }

    public List<Appointment> findAppointmentByDate(LocalDate date){
        return appointments.stream().filter(appointment -> appointment.getDateTime().toLocalDate().equals(date)).collect(Collectors.toList());
    }
}
