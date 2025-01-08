public class Individual extends Person {

    private String cpf;

    public Individual(String email, String name, String cpf) {
        super(email, name);
        this.cpf = cpf;
    }

    public Individual(String cpf) {
        super("", ""); 
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
