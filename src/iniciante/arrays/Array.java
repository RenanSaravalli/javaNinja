package iniciante.arrays;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referência!!

        String[] ninjas = new String[6];

        // Array idade
        int[] idadeNinjas = new int[2];

        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";
        ninjas[3] = "Hinata";
        ninjas[4] = "Kakashi";

        boolean[] verdadeiroOuFalso = new boolean[1];

        System.out.println(ninjas[5]); // Mostrando os valores padrões de inicialização (null)
        System.out.println(idadeNinjas[0]); // Mostrando os valores padrões de inicialização (0)
        System.out.println(verdadeiroOuFalso[0]); // Mostrando os valores padrões de inicialização (false)

        // Redeclarar o Array
        ninjas = new String[7];
        System.out.println(ninjas[0]); // Agora teremos um array vazio
        // A partir de agora para baixo não conseguimos mais acessar o array antigo
        // Por conta do mesmo ter sido sobreescrito por este novo array.

        // E o carbage colector vai fazer a função de mandar o array antigo para casa do caralho
        // Economizando a memória do nosso array

        // E podemos colocar novos elementos nesse novo array
        ninjas[0] = "Hashirama";
        ninjas[1] = "Tobirama";
        ninjas[2] = "Sarutobi";
        ninjas[3] = "Minato";
        ninjas[4] = "Tsunade";
        ninjas[5] = "Kakashi";
        ninjas[6] = "Naruto";

        // For para fazer um loop no array

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }

    }
}
