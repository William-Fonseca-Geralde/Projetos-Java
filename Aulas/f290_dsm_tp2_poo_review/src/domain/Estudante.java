package domain;

import domain.interfaces.EstudIdeia;

public class Estudante extends Pessoa implements EstudIdeia{

    public Estudante(String nome, int idade, int altura) {
        super(nome, idade, altura);
    }

    @Override
    public void Trabalhar() {
        Ler();
    }

    @Override
    public void Ler() {
        System.out.println("Bora Estudar " + getNome());
    }
}
