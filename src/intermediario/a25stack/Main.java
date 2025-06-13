package intermediario.a25stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estáticos e referêcia de memória
        String[] ninjasArray = new String[3];

        // Listas
        // São dinâmicas e tamanho aumenta e diminui conforme precisa.
        List<String> ninjasList = new ArrayList<>();

        // Stack
        // O último elemento que entrou é obrigatoriamente o primeiro a sair.
        Stack<String> ninjasStack = new Stack<>();
        // Temos 4 métods principais para brincar com o stack

        // Adicionando elementos na pilha
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno"); // Último elemento a entrar na pilha
        System.out.println("Minha stack atual: " + ninjasStack);

        // Removendo o último elemento a entrar na pilha
        ninjasStack.pop();
        System.out.println("Stack atualizada com pop: " + ninjasStack);

        // Mostrando qual é o elemento que está no topo da pilha
        System.out.println("Elemento no topo da Stack: " + ninjasStack.peek());

        // Mostrando o tamanho da Stack
        System.out.println("Tamanho da Stack: " + ninjasStack.size() + " elementos");
    }
}
