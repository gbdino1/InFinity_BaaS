public class Dividas {
    public String dividaDesc;
    public double valorDividas;
    public double valorTotalDividas;

    // construtor padrão
    public Dividas(){}

    // construtor com parâmetros
    public Dividas(String dividaDesc, double valorDividas, double valorTotalDividas){
        this.dividaDesc = dividaDesc;
        this.valorDividas = valorDividas;
        this.valorTotalDividas = valorTotalDividas;
    }

    // exemplo de método
    public void cadastrarDivida(){

        //Cadastro de uma nova dívida
        System.out.println("Insira a descrição e o valor da dívida: ");
    }

    public void exibirDividas(){
        // Exibição das dívidas
        System.out.println("Estes são as dívodas e o valor total");
    }
}