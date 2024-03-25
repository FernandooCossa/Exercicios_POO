package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do cachorro");
        String nome = scanner.next();
        System.out.println("Idada:");
        int idade = scanner.nextInt();
        Cachorro pug = new Cachorro(nome, idade);
        pug.exibirDetalhes();
    }
}
