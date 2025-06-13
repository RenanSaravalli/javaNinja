package intermediario.a26Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
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
