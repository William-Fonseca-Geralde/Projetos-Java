package domain;

import domain.interfaces.EstudIdeia;
import domain.interfaces.FuncIdeia;

public class Estagiario extends Pessoa implements FuncIdeia, EstudIdeia {
    public Estagiario(String nome, int idade, int altura) {
        super(nome, idade, altura);
    }

    @Override
    public void Trabalhar() {
        Laborar();
        Ler();
    }

    @Override
    public void Laborar() {
        System.out.println("Bora Trabalhar " + getNome());
    }

    @Override
    public void Ler() {
        System.out.println("Bora Estudar " + getNome());
    }
}
