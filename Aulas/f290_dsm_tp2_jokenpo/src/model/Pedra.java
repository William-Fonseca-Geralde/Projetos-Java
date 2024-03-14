package model;

public class Pedra extends Algoritmo {

    @Override
    public void executar(Tipo jogadaComputador) {
        switch (jogadaComputador) {
            case Papel -> System.out.println("Perdeu!!!! Pedra Perde de Papel");
            case Tesoura -> System.out.println("Ganhou!!! Pedra Ganha de Tesoura");
            case Lagarto -> System.out.println("Ganhou!!! Pedra Ganha de Lagarto");
            case Spock -> System.out.println("Perdeu!!! Pedra Perde de Spock");
            default -> System.out.println("Empatou");
        }
    }    
}
