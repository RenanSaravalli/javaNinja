package intermediario.exemplo2Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    // Incializar a lista genérica
    private List<T> ferramentas;

    //Inicializando o construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    // Agora vamos criar nosso métod de adicionar ferramenta genérica para a lista de ferramentas Genéricas
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    // Mostrando os itens que estão na lista de ferramentas
    public void mostrarFerramentas(){
        System.out.println("===== Bolsa Ninja =====");
        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }
}
