package intermediario.exemplo2Generics;

public class Pergaminho {
    private String nome;

    public Pergaminho(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
