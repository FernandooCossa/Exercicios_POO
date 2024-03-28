package Avaliacao.Pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Pet");
        pet.nome = scanner.next();
        System.out.println("digite a especie do pet");
        pet.especie = scanner.next();
        System.out.println("digite a idade do pet");
        pet.idade = scanner.nextInt();
        pet.exibirInformacoes();

    }
}
