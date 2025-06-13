package intermediario.a21lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Arrays
        * -> São estáticos, não alteram de tamanho*/
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto (Array)";
        ninjasArray[1] = "Sasuke";

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);
        }

        System.out.println(" ");

        /*Listas
        * -> NÃO são estáticas, podem aumentar ou diminuir de tamanho*/
        List<String> ninjasList = new ArrayList<>();


        // Adicionamos valores nas listas com o metod .add()
        ninjasList.add("Naruto Uzumaki");   // Index: 0
        ninjasList.add("Sasuke Uchiha");    // Index: 1
        ninjasList.add("Tobirama Senju");   // Index: 2
        ninjasList.add("Neji");             // Index: 3
        System.out.println("NinjaList: " + ninjasList);

        // Removemos valores nas listas com o metod .remove()
        ninjasList.remove("Neji");
        System.out.println("NinjaList: " + ninjasList);

        // Podemos realizar uma troca de valores. Através do métod .set()
        ninjasList.set(2, "Hashirama Senju");
        // Trocamos o Tobirama pelo Hashirama
        System.out.println("NinjaList: " + ninjasList);

        // Podemos ver o tamanho da nossa List. Através do métod .size()
        System.out.println("Tamanho da Lista = " + ninjasList.size() + " elementos");

        // Acessando elementos. Com o métod .get()
        System.out.println(ninjasList.get(4));

    }
}
