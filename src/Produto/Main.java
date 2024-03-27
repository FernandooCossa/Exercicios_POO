package Produto;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do produto: ");
        produto.nome = scanner.next();
        System.out.println("Informe o Preço: ");
        produto.preco = scanner.nextDouble();
        System.out.println("Informe a Quantidade: ");
        produto.quantidade = scanner.nextInt();

        produto.calcularValorTotalEstoque();
    }
}
