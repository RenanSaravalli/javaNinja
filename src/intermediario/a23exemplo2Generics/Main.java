package intermediario.a23exemplo2Generics;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        // agora vamos instanciar objetos para dentro de bolsa ninja
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai explsiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken("Shuriken Grandona"));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Pergaminho Proibido"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Mamanoraku"));

        bolsaNinja.mostrarFerramentas();
    }
}
