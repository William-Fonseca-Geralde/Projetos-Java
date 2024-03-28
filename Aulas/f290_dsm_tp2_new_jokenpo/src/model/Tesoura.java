package model;

import model.interfaces.Algoritmo;

public class Tesoura implements Algoritmo {

    @Override
    public void executar(Tipo jogadaComputador) {
        switch (jogadaComputador) {
            case Papel -> System.out.println("Ganhou!!!! Tesoura Ganha de Papel");
            case Pedra -> System.out.println("Perdeu!!! Tesoura Perde de Pedra");
            case Lagarto -> System.out.println("Ganhou!!! Tesoura Ganha de Lagarto");
            case Spock -> System.out.println("Perdeu!!! Tesoura Perde de Spock");
            default -> System.out.println("Empatou");
        }
    }
}
