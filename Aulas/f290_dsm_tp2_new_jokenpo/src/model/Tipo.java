package model;

import java.util.stream.Stream;

public enum Tipo {
    Papel(1),
    Tesoura(2), 
    Pedra(3), 
    Lagarto(4), 
    Spock(5);

    private final Integer id;

    Tipo(Integer id){
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static Tipo geTipo(Integer id) throws Exception{
        return Stream.of(values())
            .filter(t -> t.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Usuário Burro do Catapimbas"));
    }
}
