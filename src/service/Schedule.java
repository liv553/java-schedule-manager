package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Appointment;

public class Schedule {
   private ArrayList<Appointment> appointments;

    public Schedule(){
        this.appointments = new ArrayList<>();
    }

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

    public LocalDateTime findAppointmentByDate(LocalDateTime localDateTime){
        for (int i = 0; i < appointments.size(); i++){

        }
        return 
    }
}
