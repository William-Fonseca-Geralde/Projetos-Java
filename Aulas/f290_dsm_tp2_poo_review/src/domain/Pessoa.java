package domain;

public abstract class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private float altura;

    //Comportamentos (Métodos)

    //Método Construtor
    public Pessoa(String nome, int idade, int altura) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    //Métodos getters e setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Não pode setar idade menor que zero");
        } else {
            this.idade = idade;
        }
    }

    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float altura) {
        if (altura < 0) {
            System.out.println("Não pode setar altura menor que zero");
        } else {
            this.altura = altura;
        }
    }

    
    public void Amanhecer() {
        System.out.println("Bom Dia");
    }

    public void Entardecer() {
        System.out.println("Boa Tarde");
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }  
}