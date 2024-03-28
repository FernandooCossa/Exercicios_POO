package Avaliacao.Funcionario;

public class Funcionario {
    String nome;
    String departamento;
    double salario;
    public void aumentoSalario(double percentual){
        double novoPercentual = percentual / 100;
        double novoSalario = (salario * novoPercentual) + salario;
        System.out.println("novo salario é "+novoSalario);
    }

    public void exibirInformacoes(){
        System.out.println("Funcionario: "+nome);
        System.out.println("Departamento: "+departamento);
    }
}
