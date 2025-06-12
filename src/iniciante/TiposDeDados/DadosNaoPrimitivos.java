package iniciante.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /* Dados não Primitivos -> String, Array, Class, Enum
        * -> Nesses dados pode-se colocar métodos para fazer alteracoes na variavel
        * -> Sem que seja mudado seu escopo

        * Objetivo: Criar um ninja e atribuir métodos a ele.
        * */

        String nomeNinja = "Naruto Uzumaki";
        String aldeia = "ALDEIA DA FOLHA";

        String nomeNinjaUpperCase = nomeNinja.toUpperCase(); // toUpperCase() VAI DEIXAR GRANDAO
        System.out.println("Esse texto está em caixa alta: " + nomeNinjaUpperCase);
        System.out.println("Esse texto está normal: " + nomeNinja);

        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("Esse texto está em caixa baixa: " + aldeiaLowerCase);

        System.out.println("sasuke chorao".substring(2, 4)); // su -> retorno
        String removendoEspacosIniciaisEFinais = "    Madara Uchiha x ! hashirama safadao ".trim();
        System.out.println(removendoEspacosIniciaisEFinais);



    }
}
