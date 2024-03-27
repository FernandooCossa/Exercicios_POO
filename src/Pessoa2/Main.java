package Pessoa2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa2 pessoa2 = new Pessoa2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        pessoa2.nome = scanner.next();
        System.out.println("Digite a idade: ");
        pessoa2.idade = scanner.nextInt();
        pessoa2.imprimirNomePessoa();
    }
}
