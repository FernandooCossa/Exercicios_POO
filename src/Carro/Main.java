package Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.next();
        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();
        carro.exibirInformacoes(marca,modelo,ano);
    }
}
