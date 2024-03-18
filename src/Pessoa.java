public class Pessoa {
    // Atributos
    String nome;
    String Sobrenome;
    int idade;
    // Métodos que são as funções
    public void correr() {
        System.out.println("Está correndo");
    }

    public void  exibirDetalhes(){
        System.out.println("Nome:"+ this.nome);
        System.out.println("Sobrenome:"+ this.Sobrenome);
        System.out.println("Idade:"+ this.idade);
    }

}
