public class Gastos {
    public String itemDesc;
    public double valorGastos;
    public double valorTotalGastos;

    // construtor padrão
    public Gastos(){}

    // construtor com parâmetros
    public Gastos(String itemDesc, double valorGastos, double valorTotalGastos){
        this.itemDesc = itemDesc;
        this.valorGastos = valorGastos;
        this.valorTotalGastos = valorTotalGastos;
    }

    // exemplo de método
    public void cadastrarGasto(){

        //Cadstro de um novo gasto
        System.out.println("Insira a descrição e o valor do gasto: ");
    }

    public void exibirGasto(){
        // Exibição do gasto
        System.out.println("Estes são os gastos e o valor total");
    }
}