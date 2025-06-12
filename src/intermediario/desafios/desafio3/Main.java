package intermediario.desafios.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Uchiha sasuke = new Uchiha();
//        sasuke.nome = "Sasuke";
//        sasuke.idade = 18;
//        sasuke.missao = "Acabar com Itachi";
//        sasuke.nivelDificuldade = "S";
//        sasuke.statusMissao = "Realizando";
//        sasuke.habilidadeEspecial = "Amaterasu";
//        sasuke.mostrarHabilidadeEspecial();
//        sasuke.mostrarInformacoes();

        Scanner scanner = new Scanner(System.in);

        Ninja[] aldeiaNinja = new Ninja[3];
        int indiceAldeiaNinja = 0;

        Uchiha[] aldeiaUchiha = new Uchiha[3];
        int indiceAldeiaUchiha = 0;


        int opcaoEscolhidaPorUsuario = 0;

        while (opcaoEscolhidaPorUsuario != 6) {

            System.out.println("1. Criar um Ninja: ");
            System.out.println("2. Criar um Uchiha: ");
            System.out.println("3. Ficha Ninja: ");
            System.out.println("4. Ficha Uchiha: ");
            System.out.println("5. Atualizar habilidade Especial: ");
            System.out.println("6. Sair da aldeia: ");
            System.out.print("Escolha uma opção: ");

            opcaoEscolhidaPorUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoEscolhidaPorUsuario) {
                case 1:
                    if (indiceAldeiaNinja < 3) {
                        System.out.println("Criando um Ninja");

                        Ninja ninjaUsuario = new Ninja();

                        System.out.print("Nome do Ninja: ");
                        String nomeNinja = scanner.nextLine();

                        System.out.print("Idade do Ninja: ");
                        int idadeNinja = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Missão do Ninja: ");
                        String missaoNinja = scanner.nextLine();

                        System.out.print("Nivel da Missão: ");
                        String nivelMissao = scanner.nextLine();

                        System.out.print("Status da Missão: ");
                        String statusDaMissao = scanner.nextLine();

                        ninjaUsuario.criarNinja(nomeNinja, idadeNinja, missaoNinja, nivelMissao, statusDaMissao);

                        aldeiaNinja[indiceAldeiaNinja] = ninjaUsuario;
                        indiceAldeiaNinja++;
                    } else {
                        System.out.println("A aldeia está lotada!");
                    }

                    break;
                case 2:
                    if (indiceAldeiaUchiha < 3) {
                        System.out.println("Criando um Uchiha");

                        Uchiha uchihaUsuario = new Uchiha();

                        System.out.print("Nome do Uchiha: ");
                        String nomeNinja = scanner.nextLine();

                        System.out.print("Idade do Uchiha: ");
                        int idadeNinja = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Habilidade Especial: ");
                        String uchihaHabilidadeEspecial = scanner.nextLine();

                        System.out.print("Missão do Uchiha: ");
                        String missaoNinja = scanner.nextLine();

                        System.out.print("Nivel da Missão: ");
                        String nivelMissao = scanner.nextLine();

                        System.out.print("Status da Missão: ");
                        String statusDaMissao = scanner.nextLine();

                        uchihaUsuario.criarUchiha(nomeNinja, idadeNinja, missaoNinja, nivelMissao, statusDaMissao, uchihaHabilidadeEspecial);

                        aldeiaUchiha[indiceAldeiaUchiha] = uchihaUsuario;
                        indiceAldeiaUchiha++;
                    } else {
                        System.out.println("Os Uchihas estão lotados !");
                    }
                    break;
                case 3:
                    if (aldeiaNinja[0] != null) {
                        System.out.println("\n== Seus Ninjas ==");
                            for (Ninja ninja : aldeiaNinja) {
                                if (ninja != null) {
                                    System.out.println("Ninja: ");
                                    System.out.println(ninja.nome);
                                    System.out.println(ninja.idade);
                                    System.out.println(ninja.missao);
                                    System.out.println(ninja.nivelDificuldade);
                                    System.out.println(ninja.statusMissao + "\n");
                                } else {
                                    System.out.println("Ninja não específicado!");
                                }
                            }
                    } else  {
                        System.out.println("Aldeia vazia");
                    }
                    break;
                case 4:
                    if (aldeiaUchiha[0] != null) {
                        System.out.println("\n== Seus Uchihas ==");
                        for (Uchiha Uchiha : aldeiaUchiha) {
                            if (Uchiha != null) {
                                System.out.println("Ninja: ");
                                System.out.println(Uchiha.nome);
                                System.out.println(Uchiha.idade);
                                System.out.println(Uchiha.missao);
                                System.out.println(Uchiha.nivelDificuldade);
                                System.out.println(Uchiha.statusMissao);
                                System.out.println(Uchiha.habilidadeEspecial + "\n");
                            } else {
                                System.out.println("Uchiha não específicado!");
                            }
                        }
                    } else  {
                        System.out.println("Aldeia uchiha vazia");
                    }
                    break;
                case 5:
                    if (aldeiaUchiha[0] != null) {
                        System.out.println("Alterando habilidade especial!");
                        System.out.println("Qual número do uchiha que deseja alterar sua habilidade especial");
                        int numeroUchihaEscolhido = scanner.nextInt();
                        scanner.nextLine();
                        numeroUchihaEscolhido -=1;

                        if (aldeiaUchiha[numeroUchihaEscolhido] != null) {
                            System.out.println("Uchiha encontrado!");
                            System.out.println("Qual sua habilidade nova? ");
                            String habilidadeEspecialNova = scanner.nextLine();
                            aldeiaUchiha[numeroUchihaEscolhido].habilidadeEspecial = habilidadeEspecialNova;
                        } else {
                            System.out.println("Uchiha não encontrado!");

                        }
                    } else {
                        System.out.println("Aldeia uchiha vazia");
                    }
                    break;
                case 6:
                    System.out.println("Saindo da Aldeia!!\nAdeus!!");
                    break;
                default:
                    System.out.println("Opção Inválida.\nEscolha algumas das seguintes opções: ");
                    break;
            }
        }
    }
}
