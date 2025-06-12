package iniciante.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*  Dados Primitivos -> int, boolean, char, float, double, byte, short
            -> de maneira geral um dado primitivo não consegue receber métodos de maneira padrão
            -------------------------------
            Objetivo da aula -> Criar um ninja - Naruto -
        * */

        int idade = 16; // ValorMáximo: 2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 231147483649L; // valor máximo  9 223 372 036 854 775 807
        System.out.println(idade); // Comando para mostrar para o usuário.
        System.out.println("saldoBancario = " + saldoBancario); // Comando soutv
        System.out.println("Minha idade é: " + idade);


    }
}