public class Cadastro {

    public String nomeCompleto;
    private String cpf;
    public String email;
    private String celular;
    public String senha;

    //   Construtor padrão
    public Cadastro(){}

    // Construtor com parâmetros
    public  Cadastro(String nomeCompleto, String cpf, String email, String celular, String senha){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.senha = senha;
    }

    // Exemplo de método
    public void realizarCadastro(){
        System.out.println("Olá " + nomeCompleto +" seu cadastro foi feito com sucesso");
    }
}



