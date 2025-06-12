package iniciante.Desafio2;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = 4;
        int posicaoAtualArray = 0;
        String[] aldeiaDaFolha = new String[tamanhoArray];

        boolean continuarRodandoPrograma = true;

        while (continuarRodandoPrograma) {

            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninja");
            System.out.println("3. Deletar Ninja ");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcaoEscolhidaUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoEscolhidaUsuario) {
                case 1:
                    if (posicaoAtualArray < tamanhoArray) {
                        System.out.println("===== Cadastrando Ninja =====");
                        System.out.print("Digite o nome do ninja: ");
                        String nomeNinjaDoUsuario = scanner.nextLine();

                        aldeiaDaFolha[posicaoAtualArray] = nomeNinjaDoUsuario;
                        posicaoAtualArray++;

                        System.out.println("===== Cadastro finalizado =====");
                    } else {
                        System.out.println("Número total de ninjas para missão Atingido");
                    }
                    break;
                case 2:
                    // Verificando se tenho algum ninja cadastrado para mostrar pro usuário.
                    if (posicaoAtualArray == 0) {
                        System.out.println("Nenhum ninja cadastrado!!");
                    } else {
                        System.out.println("===== Listando Ninjas =====");
                        for (int i = 0; i < aldeiaDaFolha.length; i++) {
                            // Personalizando a listagem de ninjas com o operador ternário
                            String mostrandoAListaDeNinjas = (aldeiaDaFolha[i] != null) ? "Ninja " + (i + 1) + ": " + aldeiaDaFolha[i] : "Ninja " + (i + 1) + ": Nenhum ninja escolhido!" ;
                            System.out.println(mostrandoAListaDeNinjas);
                        }
                        System.out.println("===== Listagem finalizada =====");
                    }
                    break;
                case 3:
                    // Verificando se tenho ninjas para deletar
                    if (posicaoAtualArray == 0) {
                        System.out.println("Nenhum ninja para deletar!!");
                    } else {
                        // Realizando a deletagem de ninjas
                        System.out.println("===== Deletando Ninjas =====");
                        System.out.print("Qual o número do ninja para deletar: ");
                        int indiceNinjaParaDeletar = scanner.nextInt();
                        indiceNinjaParaDeletar -=1; // traduzindo essa caceta para o indice do array
                        // Se o usuário quiser exluir o 1 e digitar 1 ao invés de 0. Essa bomba vai arrumar.

                        String ninjaDeletado = aldeiaDaFolha[indiceNinjaParaDeletar];
                        if (ninjaDeletado == null) {
                            // Verificando se o idiota do usuário digitou o número certo.
                            System.out.println("Número de ninja inválido.");
                            System.out.println("Liste os ninjas para verificar seus números!");
                        } else {
                            // Puta gambiarra para exclui um ninja
                            System.out.println("Ninja: " + ninjaDeletado + " excluído!!");
                            aldeiaDaFolha[indiceNinjaParaDeletar] = null;

                            // Voltando a posição do array para que todos os ninjas pra missão sejam preenchidos
                            posicaoAtualArray = indiceNinjaParaDeletar;
                        }
                    }
                    break;
                case 4:
                    System.out.println("==== Saindo da aldeia ====");
                    System.out.println("==== Obrigado ninja! ====");
                    continuarRodandoPrograma = false;
                    break;
                default:
                    System.out.println("Número incorreto!!!");
                    System.out.println("Usuário escolha entre 1, 2 ou 3");
                    break;
            }
        }
    }
}
