public class Appointment {

    private LocalDateTime dateTime;
    private String description;
    private Person person;

    public Appointment(LocalDateTime dateTime, String description, Person person) {
        this.dateTime = dateTime;
        this.description = description;
        this.description = person;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    

}
