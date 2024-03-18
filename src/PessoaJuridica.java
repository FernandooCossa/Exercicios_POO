public class PessoaJuridica extends Pessoa {
    String cnpj;

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Sobrenome:" + this.Sobrenome);
        System.out.println("Idade:" + this.idade);
        System.out.println("CNPJ:" + this.cnpj);
    }
}
