package intermediario.a30HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.add("Naruto");
        ninjasSet.add("Sakura");
        ninjasSet.add("Sasuke");
        ninjasSet.add("Naruto");

        System.out.println("Ninjas: " + ninjasSet);

        // Ninjas: [Sasuke, Naruto, Sakura]

        /*  Você pode se perguntar, mas cadê o outro naruto?
            Ele foi pra casa do KARALHO
            ------
            Veja também que a coleção não está ordenada pela
            ordem de inserção
        */

        // Passando uma lista para um Set, e removendo as duplicatas da lista

        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Itachi");
        ninjasList.add("Obito");
        ninjasList.add("Madara");
        ninjasList.add("Itachi");

        Set<String> ninjasSet2 = new HashSet<>();

        ninjasSet2.addAll(ninjasList);

        System.out.println("List:");
        System.out.println("Ninjas List: " + ninjasList);

        System.out.println(" ");

        System.out.println("Set: ");
        System.out.println("Ninjas set: " + ninjasSet2);

        /*
        * List:
            Ninjas List: [Itachi, Obito, Madara, Itachi]

        Set:
            Ninjas set: [Obito, Madara, Itachi]*/

        // Algumas coisas para você ficar atento:
        // Para remover um elemento, não conseguimos remover pelo index (Visto que o Set não possui)
        // temos que passar o objeto que queremos remover
        ninjasSet2.remove("Madara");
        System.out.println("Ninjas Set (Sem madara): " + ninjasSet2);
        // Ninjas Set (Sem madara): [Obito, Itachi]

    }
}
