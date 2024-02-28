package domain;

public class Pessoa {
    //Atributos
    public String nome;
    public int idade;
    public float altura;

    //Comportamentos (Métodos)

    //Método Construtor
    public Pessoa(String nome, int idade, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void Amanhecer() {
        System.out.println("Bom Dia");
    }

    public void Entardecer() {
        System.out.println("Boa Noite");
    }
}