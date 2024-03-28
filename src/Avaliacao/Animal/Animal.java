package Avaliacao.Animal;

public class Animal {
    String nome;
    String tipo;
    int idade;

    public void emitirSom(String som){
        System.out.println(tipo + " faz "+ som);
    }
}
