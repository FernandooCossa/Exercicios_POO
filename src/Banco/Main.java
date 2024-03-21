package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        //titular
        System.out.println("Titular: ");
        banco.titular = scanner.next();
        //depositar
        System.out.println("Informe o valor do deposito : ");
        double valor = scanner.nextDouble();
        banco.depositarDinheiro(valor);
        //sacar
        System.out.println("Informe o valor do saque : ");
        valor = scanner.nextDouble();
        banco.sacarDinheiro(valor);
    }
}
