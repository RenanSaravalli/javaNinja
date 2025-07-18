package intermediario.a31TreeSetVSLinkedHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Vamos ver dois exemplos com Strings e inteiros
        // Para ver o comportamentos das coleções

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Naruto");
        ninjasList.add("Naruto");
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");
        ninjasList.add("Obito");
        ninjasList.add("Minato");
        ninjasList.add("Danzo");
        ninjasList.add("Boruto");
        ninjasList.add("AminhaPIca");

        List<Integer> numerosList = new ArrayList<>();
        numerosList.add(69);
        numerosList.add(9);
        numerosList.add(0);
        numerosList.add(1);
        numerosList.add(45);
        numerosList.add(2);
        numerosList.add(5);
        numerosList.add(5);
        numerosList.add(5);

        Set<String> ninjasTreeSet = new TreeSet<>();
        ninjasTreeSet.addAll(ninjasList);

        Set<Integer> numerosTreeSet = new TreeSet<>();
        numerosTreeSet.addAll(numerosList);

        System.out.println("Ninjas em Tree Set: ");
        System.out.println(ninjasTreeSet);

        System.out.println(" ");

        System.out.println("Números em Tree Set: ");
        System.out.println(numerosTreeSet);



        /*
        * Ninjas em Tree Set:
          [AminhaPIca, Boruto, Danzo, Minato, Naruto, Obito, Sakura, Sasuke]

        Números em Tree Set:
        [0, 1, 2, 5, 9, 45, 69]*/

        System.out.println(" ");

        // Agora vamos ver uma outra implementação que é a LinkedHashSet
        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(ninjasList);

        Set<Integer> numerosLinkedHashSet = new LinkedHashSet<>();
        numerosLinkedHashSet.addAll(numerosList);

        System.out.println("Ninjas em LinkedHashSet: ");
        System.out.println(ninjasLinkedHashSet);

        System.out.println(" ");

        System.out.println("Numeros em LinkedHashSet: ");
        System.out.println(numerosLinkedHashSet);
        // Perceba que respeita a ordem de inserção
        /*Ninjas em LinkedHashSet:
            [Naruto, Sasuke, Sakura, Obito, Minato, Danzo, Boruto, AminhaPIca]

        Numeros em LinkedHashSet:
            [69, 9, 0, 1, 45, 2, 5]*/

        // Perceba também que não há elementos repetidos

    }
}
