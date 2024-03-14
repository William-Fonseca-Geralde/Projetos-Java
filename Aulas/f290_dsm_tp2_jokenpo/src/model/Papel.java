package model;

public class Papel extends Algoritmo {

    @Override
    public void executar(Tipo jogadaComputador) {
        switch (jogadaComputador) {
            case Tesoura -> System.out.println("Perdeu!!!! Papel Perde de Tesoura");
            case Pedra -> System.out.println("Ganhou!!! Papel Ganha de Pedra");
            case Lagarto -> System.out.println("Perdeu!!! Papel Perde de Lagarto");
            case Spock -> System.out.println("Ganhou!!! Papel Ganha de Spock");
            default -> System.out.println("Empatou");
        }
    }   
}
