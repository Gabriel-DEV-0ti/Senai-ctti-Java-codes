package Construtores.Ex_2;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
        this.nome = "Deconhecido";
        this.idade = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void informacaoPessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
