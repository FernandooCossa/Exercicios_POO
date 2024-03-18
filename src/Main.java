//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1);
        pessoa1.nome = "Fernando";
        pessoa1.Sobrenome = "Cossa";
        pessoa1.idade = 28;
        pessoa1.exibirDetalhes();

        Pessoa pessoa2 = new Pessoa();
        System.out.println(pessoa2);
        pessoa2.nome = "Alice";
        pessoa2.Sobrenome = "Cossa";
        pessoa2.idade = 19;
        pessoa2.exibirDetalhes();

        PessoaFisica pessoaFisica1 = new PessoaFisica();
        pessoaFisica1.nome = "Maria";
        pessoaFisica1.Sobrenome = "Cossa";
        pessoaFisica1.idade = 50;
        pessoaFisica1.cpf = "123456";
        pessoaFisica1.exibirDetalhes();

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.nome = "Joao";
        pessoaJuridica.Sobrenome = "Cossa";
        pessoaJuridica.idade = 25;
        pessoaJuridica.cnpj = "789999852";
        pessoaJuridica.exibirDetalhes();

    }
}