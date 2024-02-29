package domain;

public class Estudante extends Pessoa{
    private String ra;

    public Estudante(String nome, int idade, int altura, String ra) {
        super(nome, idade, altura);
        setRa(ra);
    }

    public String getRa() {
        return this.ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

    public void Estudar() {
        System.out.println("Bora Estudar!!!");
    }

    @Override
    public String toString() {
        return "Estudante [ra=" + ra + "]";
    }

    
}
