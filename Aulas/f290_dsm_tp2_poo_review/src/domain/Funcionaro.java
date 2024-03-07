package domain;

import domain.interfaces.FuncIdeia;

public class Funcionaro extends Pessoa implements FuncIdeia {
    public Funcionaro(String nome, int idade, int altura) {
        super(nome, idade, altura);
    }

    @Override
    public void Trabalhar() {
        Laborar();
    }

    @Override
    public void Laborar() {
        System.out.println("Bora Trabalhar " + getNome());
    }
}
