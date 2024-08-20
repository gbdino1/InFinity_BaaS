public class Metas {
    public String descMeta;
    public double valorInicial;
    public double valorAtual;
    public double valorMeta;
    public String dataAtingirMeta;
    public double deposito;

    // Construtor padrão
    public Metas(){
    }

    // Construro com parâmetros
    public Metas(String descMeta, double valorInicial, double valorAtual, double valorMeta, String dataAtingirMeta, double deposito){
        this.descMeta = descMeta;
        this.valorInicial = valorInicial;
        this.valorAtual = valorAtual;
        this.valorMeta = valorMeta;
        this.dataAtingirMeta = dataAtingirMeta;
        this.deposito = deposito;
    }

    // Exemplo de método
    public void novaMeta(){
        //Cadastro de uma nova meta
        System.out.println("Insira a descrição e o valor total para a meta: ");
    }

    public void exibirMeta(){
        // Exibição da meta
        System.out.println("Esse é o valorAtual da meta ainda faltam R$xxx para atingir o valorMeta, você ainda tem até dataAtingir" +
                "meta para chegar ao valorMeta");
    }

    public void novoDeposito(){
        System.out.println("Realizar um novo deposito na descMeta");
    }
}
