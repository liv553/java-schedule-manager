import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

import model.Appointment;
import model.Company;
import model.Individual;
import model.Person;
import service.Schedule;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        List<Appointment> appointments = new ArrayList<>();
        Schedule schedule = new Schedule(appointments);

        int response = 1;
        
        while (response != 0){
            System.out.println("Select an option: ");
            System.out.println("[1] - Add appointment");
            System.out.println("[2] - Remove appointment");
            System.out.println("[3] - View schedule");
            System.out.println("[4] - Find appointment by date");
            System.out.println("[0] - Exit program");
            response = sc.nextInt();
            sc.nextLine();
            
            if (response == 1) {
                System.out.println("Please type the Date and Time of the appointment (yyyy-MM-dd HH:mm)");
                String appDate = sc.nextLine();
                DateTimeFormatter appDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime appointmentDateTime = LocalDateTime.parse(appDate, appDateFormatter);
                System.out.println("Please enter the description of this appointment: ");
                String description = sc.nextLine();
                System.out.println("Appointment set for: " + appointmentDateTime);
                
                System.out.println("Are you [Company - type '1'] or [Individual - type '2']? ");
                int companyOrIndividual = sc.nextInt();
                sc.nextLine();
                if (companyOrIndividual == 2) {
                    System.out.println("Please type your ID [CPF]: ");
                    String cpf = sc.nextLine();
                    Individual individual = new Individual(cpf);
                } else {
                    System.out.println("Please type your Company ID [CNPJ]: ");
                    String cnpj = sc.nextLine();
                    Company company = new Company(cnpj);
                }
                System.out.println("Please enter your name: ");
                String name = sc.nextLine();
                System.out.println("Please enter your email: ");
                String email = sc.nextLine();
                Person person = new Person(email, name);
                System.out.println(person.toString());

                Appointment appointment = new Appointment(appointmentDateTime, description, person);
                appointments.add(appointment);
                schedule.addAppointment(appointment);
            }
            else if (response == 2){
                System.out.println("Please type the id number of the appointment to be removed: ");
                schedule.listAppointments();
                int id = sc.nextInt();
                schedule.removeAppointment(id);
                System.out.println(id + "º appointment succesfully removed");
                schedule.listAppointments();
            }
            else if (response == 3){
                System.out.println("Full schedule view: ");
                schedule.listAppointments();
            }
            else if (response == 4){
                System.out.println("Type the appointment's date: (yyyy-MM-dd)");
                String appointmentdate = sc.nextLine();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime ldt = LocalDateTime.parse(appointmentdate, dtf);
                //schedule.findAppointmentByDate(ldt);
            }

        }

        sc.close();
    }
}
