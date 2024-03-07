package domain;

import domain.interfaces.ProfeIdeia;

public class Professor extends Pessoa implements ProfeIdeia {
    public Professor(String nome, int idade, int altura) {
        super(nome, idade, altura);
    }

    @Override
    public void Trabalhar() {
        Ensinar();
    }

    @Override
    public void Ensinar() {
        System.out.println("Bora Ensinar " + getNome());
    }
}
