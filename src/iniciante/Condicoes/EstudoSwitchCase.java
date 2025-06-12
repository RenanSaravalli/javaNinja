package iniciante.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        /*  Switch Cases: Servem para gerar casos específicos
        *   -> Objetivo da aula: Pedir pro usuário escolher entre os Ninjas
        *   switchCase
        * */

        // Pedir ao usuário
        Scanner scanner = new Scanner(System.in);

        // Mostrar as opções para o usuário.
        System.out.println("Escolha um personagem");
        System.out.println("1 - Naruto uzumaki\n2 - Sasuke Uchiha\n3 - Sakura Haruno");

        // Pedir para o usuário escolher uma das opções
        System.out.print("Dígite o número do personagem: ");
        int personagemEscolhido = scanner.nextInt();

        // Reação ao escolher um personagem
        switch (personagemEscolhido) {
            case 1:
                System.out.println("Usuário escolheu o Naruto Uzumaki o ninja mais bosta");
                break;
            case 2:
                System.out.println("Usuário escolheu o Sasuke Uchiha O ninja mais chato");
                break;
            case 3:
                System.out.println("Usuário escolheu a Sakura Haruno a muie safada do Naruto ");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida. Tente denovo.");
        }


        // fechar a caixa
        scanner.close();
    }
}
