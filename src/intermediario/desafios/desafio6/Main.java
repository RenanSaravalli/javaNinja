package intermediario.desafios.desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Iniciar uma Linked list com 7 ninjas
        LinkedList<Ninja> ninjas = new LinkedList<>();
        Ninja ninja1 = new Ninja("Naruto", 17, "Aldeia da folha");
        Ninja ninja2 = new Ninja("Kakashi", 34, "Aldeia da folha");
        Ninja ninja3 = new Ninja("Sasuke", 17, "Aldeia da folha");
        Ninja ninja4 = new Ninja("Sakura", 17, "Aldeia da folha");
        Ninja ninja5 = new Ninja("Obito", 34, "Aldeia da folha");
        Ninja ninja6 = new Ninja("Gaara", 17, "Aldeia Oculta da areia");
        Ninja ninja7 = new Ninja("Jiraya", 50, "Aldeia da folha");

        ninjas.add(ninja1);
        ninjas.add(ninja2);
        ninjas.add(ninja3);
        ninjas.add(ninja4);
        ninjas.add(ninja5);
        ninjas.add(ninja6);
        ninjas.add(ninja7);

        int opcaoEscolhidaUsuario = 0;

        while (opcaoEscolhidaUsuario != 6) {
            System.out.println(" ");
            System.out.println("==== Sistema Ninja ====");
            System.out.println("|[0] - Adicionar Ninja no início");
            System.out.println("|[1] - Remover o primeiro Ninja");
            System.out.println("|[2] - Exibir a lista de Ninjas");
            System.out.println("|[3] - Acessar o Ninja específico");
            System.out.println("|[4] - Ordenar a lista de ninjas");
            System.out.println("|[5] - Buscar um ninja pelo nome");
            System.out.println("|[6] - Sair do sistema");
            opcaoEscolhidaUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoEscolhidaUsuario) {

                case 0:
                    ninjas.addFirst(usuarioCriaNinja());
                    System.out.println("Ninja adicionado no começo!!");
                    break;

                case 1:
                    System.out.println("Removendo primeiro ninja");
                    ninjas.removeFirst();
                    break;

                case 2:
                    System.out.println("Exibindo a lista");
                    for (Ninja ninja : ninjas) {
                        System.out.println(ninja);
                    }
                    break;

                case 3:
                    System.out.println("Acessando ninja específico");
                    System.out.print("Digite a posição do ninja a qual deseja acessar: ");
                    int posicicaoNinjaUsuario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nome ninja: " + ninjas.get(posicicaoNinjaUsuario).getNome());
                    System.out.println("Idade ninja: " + ninjas.get(posicicaoNinjaUsuario).getIdade());
                    System.out.println("Aldeia ninja: " + ninjas.get(posicicaoNinjaUsuario).getAldeia());
                    break;

                case 4:
                    System.out.println("ordenando a lista");
                    System.out.println("Escolha o critério para ordenar a lista: ");
                    System.out.println("[0] - nome");
                    System.out.println("[1] - idade");
                    System.out.println("[2] - aldeia");
                    int criterioEscolhidoUsuario = scanner.nextInt();
                    switch (criterioEscolhidoUsuario) {

                        case 0:
                            System.out.println("Ordenando a lista pelo nomes dos ninjas");
                            ninjas.sort(Comparator.comparing(Ninja::getNome));
                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja);
                            }
                            break;

                        case 1:
                            System.out.println("Ordenando a lista pela idade dos ninjas");
                            ninjas.sort(Comparator.comparingInt(Ninja::getIdade));
                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja);
                            }
                            break;

                        case 2:
                            System.out.println("Ordenando a lista pela aldeia dos ninjas");
                            ninjas.sort(Comparator.comparing(Ninja::getAldeia));
                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja);
                            }
                            break;

                        default:
                            System.out.println("Opção inválida. Não foi possível ordenar a lista!");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Buscando um ninja pelo nome");

                    System.out.print("Digite o nome do ninja que deseja encontrar: ");
                    String nomeNinjaParaEncontrar = scanner.nextLine();
                    System.out.println(buscaNinjaPeloNome(ninjas, nomeNinjaParaEncontrar));

                    break;


                default:
                    System.out.println("Saindo do sistema...");
                    break;
            }

        }


    }

    public static Ninja usuarioCriaNinja() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Criando ninja");
        System.out.print("Nome: ");
        String nomeNinjaUsuario = scanner.nextLine();
        System.out.print("Idade: ");
        int idadeNinjaUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Aldeia: ");
        String aldeiaNinjaUsuario = scanner.nextLine();
        Ninja ninjaCriadoUsuario = new Ninja(nomeNinjaUsuario, idadeNinjaUsuario, aldeiaNinjaUsuario);
        System.out.println("Ninja: " + ninjaCriadoUsuario.getNome() + " criado!!");
        return ninjaCriadoUsuario;
    }

    public static String buscaNinjaPeloNome(LinkedList<Ninja> ninjas, String target) {
        ninjas.sort(Comparator.comparing(Ninja::getNome));
        int firstIndex = 0;
        int lastIndex = ninjas.size() - 1;


        while (lastIndex >= firstIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            Ninja ninjaMeio = ninjas.get(midIndex);

            if (target.compareTo(ninjas.get(midIndex).getNome()) == 0) {
                return "Ninja encontrado: " + ninjaMeio.getNome();
            } else if (target.compareTo(ninjas.get(midIndex).getNome()) < 0) {
                lastIndex = midIndex - 1;
            } else {
                firstIndex = midIndex + 1;
            }
        }
        return null;
    }


}
