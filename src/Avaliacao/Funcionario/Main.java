package Avaliacao.Funcionario;

import Avaliacao.Funcionario.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario:");
        funcionario.nome = scanner.next();
        System.out.println("Digite o departamento do Funcionario");
        funcionario.departamento = scanner.next();
        System.out.println("Digite o salario: ");
        funcionario.salario = scanner.nextDouble();
        System.out.println("Digite a porcentagem de aumento salarial: ");
        double percentual = scanner.nextDouble();
        funcionario.exibirInformacoes();
        funcionario.aumentoSalario(percentual);
    }
}
