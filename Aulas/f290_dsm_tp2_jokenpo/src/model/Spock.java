package model;

public class Spock extends Algoritmo {

    @Override
    public void executar(Tipo jogadaComputador) {
        switch (jogadaComputador) {
            case Papel -> System.out.println("Perdeu!!!! Spock Perde de Papel");
            case Tesoura -> System.out.println("Ganhou!!! Spock Ganha de Tesoura");
            case Pedra -> System.out.println("Ganhou!!! Spock Ganha de Pedra");
            case Lagarto -> System.out.println("Perdeu!!! Spock Perde de Lagarto");
            default -> System.out.println("Empatou");
        }
    }
}
