package intermediario.construtores;

public class Main {
    public static void main(String[] args) {
        Senju hashirama = new Senju();

        /*Hokages tobirama = new Hokages("Tobirama Senju", 27, false);
        * Iss agora vai me retornar um erro*/

        hashirama.nome = "Hashirama";
        hashirama.idade = 40;
        hashirama.vivoOuNao = false;

        hashirama.ganharSabedoria();
    }
}
