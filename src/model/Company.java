public class Company extends Person {

    private String cnpj;

    public Company(String email, String name, String cnpj){
        super(email, name);
        this.cnpj = cnpj;
    }

    public Company(String cnpj){
        super("", ""); 
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

}
