package model;

public class Lagarto implements Algoritmo {

    @Override
    public void executar(Tipo jogadaComputador) {
        switch (jogadaComputador) {
            case Papel -> System.out.println("Ganhou!!!! Lagarto Ganha de Papel");
            case Tesoura -> System.out.println("Perdeu!!! Lagarto Perde de Tesoura");
            case Pedra -> System.out.println("Perdeu!!! Lagarto Perde de Pedra");
            case Spock -> System.out.println("Ganhou!!! Lagarto Ganha de Spock");
            default -> System.out.println("Empatou");
        }
    }
}
