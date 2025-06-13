package intermediario.ResumaoDataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Array
        String[] nomesNinjaArray = new String[3];
        nomesNinjaArray[0] = "Sakura";
        nomesNinjaArray[1] = "Gai";
        for (String nome : nomesNinjaArray) {
            System.out.println(nome);
        }

        // List
        List<String> nomesNinjaList = new ArrayList<>();
        nomesNinjaList.add("Sasuke");
        nomesNinjaList.add("Itachi");
        nomesNinjaList.add("Danzo");
        nomesNinjaList.add("Obito");
        nomesNinjaList.remove("Danzo");
        System.out.println("Lista Completa: " + nomesNinjaList);


        // Stack
        Stack<String> nomesNinjaStack = new Stack<>();
        nomesNinjaStack.push("Naruto");
        nomesNinjaStack.push("Tobirama");
        nomesNinjaStack.push("Hashirama");
        nomesNinjaStack.push("Kakashi");
        System.out.println("Pilha: " + nomesNinjaStack);
        System.out.println("Topo Pilha: " + nomesNinjaStack.peek());
        System.out.println("Removendo o topo: " + nomesNinjaStack.pop());
        System.out.println("Pilha atualizada: " + nomesNinjaStack);

    }
}
