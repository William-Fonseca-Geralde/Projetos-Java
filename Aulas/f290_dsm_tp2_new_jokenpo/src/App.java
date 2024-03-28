import java.util.Scanner;

import model.Algoritmo;
import model.Tipo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma das opções (1 - Papel, 2 - Tesoura, 3 - Pedra, 4 - Lagarto, 5 - Spock)");
        int jogada = in.nextInt();
    }

    public static Algoritmo getAlgoritmo(Tipo tipo) {
        return null;
    }
}
