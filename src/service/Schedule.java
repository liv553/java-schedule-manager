package service;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Appointment;

public class Schedule {

   private ArrayList<Appointment> appointments = new ArrayList<>();

    
   public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment){
        appointments.add(appointment);
    }

    public void removeAppointment(int id) {
        appointments.remove(id);
    }

    public void listAppointments() {
        for (int i = 0; i < appointments.size(); i++){
            System.out.println(appointments.get(i));
        }
        
    }

    public ArrayList<Appointment> findAppointmentByDate(LocalDate date){
        ArrayList<Appointment> matchingAppointments = new ArrayList<>();
        for (Appointment appointment : appointments){
            if (appointment.getDateTime().toLocalDate().equals(date)) {
                matchingAppointments.add(appointment);
            }
        }
        return matchingAppointments;

    }
}
