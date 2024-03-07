import java.util.Arrays;
import java.util.List;

import domain.Estagiario;
import domain.Estudante;
import domain.Funcionaro;
import domain.Pessoa;
import domain.Professor;

public class App {
    public static void main(String[] args) {
        Estudante Robs = new Estudante("Roberto", 19, 185);
        Professor Prof = new Professor("Nilton", 36, 185);
        Funcionaro Func = new Funcionaro("Aroldo", 41, 178);
        Estagiario Estag = new Estagiario("Iara", 22, 170);
        
        List<Pessoa> pessoas = Arrays.asList(Robs, Prof, Func, Estag);

        for (Pessoa pessoa : pessoas) {
            System.out.println();
            System.out.println(pessoa);
            pessoa.Trabalhar();
        }
    }
}