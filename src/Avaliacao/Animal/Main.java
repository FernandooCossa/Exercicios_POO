package Avaliacao.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do animal");
        animal.nome = scanner.next();
        System.out.println("Digite a especie do animal");
        animal.tipo = scanner.next();
        System.out.println("Digite a idade do animal");
        animal.idade = scanner.nextInt();
        System.out.println("Digite o som que o animal faz");
        String som = scanner.next();
        animal.emitirSom(som);

    }
}
