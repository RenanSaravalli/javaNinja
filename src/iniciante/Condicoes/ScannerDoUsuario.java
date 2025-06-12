package iniciante.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /* Scanner
        *  -> Jeito de trazer o usuário para dentro da aplização
        *  -> Objetivo da aplicação: Usuário vai criar um ninja e vamos validar os dados.
        * */

        Scanner scanner = new Scanner(System.in);

        // Receber o nome do ninja

        System.out.print("Escreva o nome do ninja: ");
        String nomeDoNinja = scanner.nextLine();
        System.out.println("O nome do Ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.print("Escreva a idade do ninja: ");
        int idadeDoNinja = scanner.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir para missoes fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo!! Precisa treinar mais antes de sair da vila");
        }

        scanner.close(); // Temos que fechar SEMPRE o scanner (a caixa)
    }
}
