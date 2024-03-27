package Pessoa;

public class PessoaFisica extends Pessoa {
    //Pessoa.Pessoa.PessoaFisica é uma extensão de Pessoa.Pessoa
    String cpf;

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Sobrenome:" + this.Sobrenome);
        System.out.println("Idade:" + this.idade);
        System.out.println("CPF:" + this.cpf);
    }
}