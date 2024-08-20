public class Login {

    private String email;
    private String senha;


    // Construtor padrão
    public  Login() {}

    // Construtor com parâmetros
    public Login(String email, String senha){
        this.email = email;
        this.senha = senha;
    }

    //  Exemplo de método
    public void realizarLogin() {
        System.out.println("Login realizado com sucesso, bem-vindo novamente: " + email);
    }
}
