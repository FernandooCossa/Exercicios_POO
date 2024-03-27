package Produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    // metodos
    public void calcularValorTotalEstoque (){
        double valorTotal = preco * quantidade;
        System.out.println("Valor total em estoque R$"+ valorTotal);
    }
}
