package Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Digite a largura: ");
        double largura = scanner.nextDouble();
        retangulo.calcularAreaRetangulo(altura,largura);
    }
}
