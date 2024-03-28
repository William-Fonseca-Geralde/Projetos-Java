import java.util.Random;
import java.util.Scanner;

import model.Jokenpo;
import model.Tipo;
import model.interfaces.Algoritmo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma das opções (1 - Papel, 2 - Tesoura, 3 - Pedra, 4 - Lagarto, 5 - Spock)");
        int jogada = in.nextInt();

        int computador = new Random().nextInt(5) + 1;

        // Converter jogada do jogador e do computador em Enum, para se adequar ao sistema
        Tipo jogadaUser = Tipo.geTipo(jogada);
        Tipo jogadaComputer = Tipo.geTipo(computador);

        Jokenpo jokenpo = new Jokenpo();

        jokenpo.setAlgoritmo();

        in.close();
    }

    public static Algoritmo getAlgoritmo(Tipo tipo) {
        
        return null;
    }
}
