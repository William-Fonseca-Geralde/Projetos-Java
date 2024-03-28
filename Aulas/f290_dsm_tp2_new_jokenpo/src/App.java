import java.util.Random;
import java.util.Scanner;

import model.Jokenpo;
import model.Lagarto;
import model.Papel;
import model.Pedra;
import model.Spock;
import model.Tesoura;
import model.Tipo;
import model.interfaces.Algoritmo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma das opções (1 - Papel, 2 - Tesoura, 3 - Pedra, 4 - Lagarto, 5 - Spock)");
        int jogada = in.nextInt();

        int computador = new Random().nextInt(5) + 1;
        System.out.println("Escolha do computador: " + computador);

        // Converter jogada do jogador e do computador em Enum, para se adequar ao sistema
        Tipo jogadaUser = Tipo.geTipo(jogada);
        Tipo jogadaComputer = Tipo.geTipo(computador);

        Algoritmo algoritmo = getAlgoritmo(jogadaUser);
        Jokenpo jokenpo = new Jokenpo();

        jokenpo.setAlgoritmo(algoritmo);

        jokenpo.jogar(jogadaComputer);

        in.close();
    }

    public static Algoritmo getAlgoritmo(Tipo tipo) {
        return switch(tipo){
            case Papel -> new Papel();
            case Pedra -> new Pedra();
            case Tesoura -> new Tesoura();
            case Lagarto -> new Lagarto();
            case Spock -> new Spock();
            default -> null;
        };
    }
}
