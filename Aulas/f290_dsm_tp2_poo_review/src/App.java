import domain.Estudante;

public class App {
    public static void main(String[] args) throws Exception {
        Estudante serVivo = new Estudante("Roberto", 19, 185, "2413534");
        System.out.println(serVivo);
    }
}
