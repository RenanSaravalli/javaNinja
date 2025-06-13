package intermediario.a29LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Classes que implementam de collection
        ArrayList<String> arrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Interface que implementa de Collection
        Queue<String> queue = new LinkedList<>();

        // Adicionando elementos na LinkedList
        linkedList.add("Naruto");
        linkedList.add("Sasuke");
        linkedList.add("Sakura");

        System.out.println("Lista encadeada: " + linkedList);

        linkedList.add(1, "Kakashi");

        System.out.println("Lista encadeada: " + linkedList);

        linkedList.remove("Sasuke"); // linkedList.remove(2);

        System.out.println("Lista encadeada: " + linkedList);
    }
}
