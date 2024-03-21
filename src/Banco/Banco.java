package Banco;

public class Banco {
    String titular;
    double saldo=0;

    public void depositarDinheiro(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo Atual: " + this.saldo);
    }
    public void sacarDinheiro( double valor){
        if (valor <= saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("seu saldo atual é: "+this.saldo);
        }else{
            System.out.println("saldo insuficiente");
        }
    }
}
