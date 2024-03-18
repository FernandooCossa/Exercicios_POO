package Contador;

public class Contador {
    int valor;
    public void incrementar(){
        valor++; // valor = valor + 1;
    }

    public void decremenatar(){
        valor--; // valor = valor - 1;
    }

    public void exibirValor(){
        System.out.println("O valor atual é: "+ valor);
    }
}
