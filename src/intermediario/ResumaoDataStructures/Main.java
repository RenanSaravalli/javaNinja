package intermediario.ResumaoDataStructures;

import java.util.*;

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

        System.out.println("\nQUEUES");
        // ATENÇÃO AGORA VAMOS APRENDER SOBRE AS QUEUES -> FILAS

        Queue<String> ninjasQueue = new LinkedList<>();
        // Adicionando ninjas para a Queue
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");

        // Mostrando os itens da nossa Queue
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll(); // vai direto no primeiro elemento da fila

        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);

        // Pomos mostrar quem é o primeiro elemento da fila
        System.out.println("Primeiro ninja na fila do lamen: " + ninjasQueue.peek());

        // Adicionando na fila
        ninjasQueue.add("Tobirama");
        ninjasQueue.add("Rock Lee");

        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Esvaziando a fila.
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        // Podemos verificar se a fila está vazia:
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia: " + ninjasQueue);
        } else  {
            int contador = 0;
            for (int i = 0; i < ninjasQueue.size(); i++) {
                contador+=1;
            }
            System.out.println("A fila ainda tem: " + contador + " elementos");
        }

    }
}
