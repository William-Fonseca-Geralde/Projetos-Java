import java.util.Scanner;

import domain.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Pessoa Roberto = new Pessoa("Roberto", 19, 185);
        int idade = in.nextInt();
        if (idade <= 0) {
            System.out.println("A idade não pode ser menor que zero");
        } else {
            Roberto.idade = idade;
        }
        System.out.println(Roberto);
        in.close();
    }
}
