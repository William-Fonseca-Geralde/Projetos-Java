import java.util.Arrays;
import java.util.List;

import domain.Estudante;
import domain.Funcionaro;
import domain.Pessoa;
import domain.Professor;

public class App {
    public static void main(String[] args) {
        Estudante Robs = new Estudante("Roberto", 19, 185);
        Professor Prof = new Professor("Nilton", 36, 185);
        Funcionaro Func = new Funcionaro("Aroldo", 41, 178);
        
        List<Pessoa> pessoas = Arrays.asList(Robs, Prof, Func);

        for (Pessoa pessoa : pessoas) {
            pessoa.Trabalhar();
        }
    }
}