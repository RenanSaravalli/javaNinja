package intermediario.a01introducaoObj;

public class Main {
    public static void main(String[] args) {
        /* Pense que os ninjas são objetos e e para construção desses objetos precisamos
        *  de um molde o qual a partir desse molde vamos construir nossos ninjas.
        * No java representamos o molde como class
        * */

//        // Criar o ninja naruto do modo antigo como um BURRO
//        String nome = "Naruto";
//        int idadeNinja = 18;
//        String aldeia = "Aldeia da Folha";

        // Criar ninja sasuke que é um objeto DO MODO SÁBIO

        Ninja sasuke = new Ninja(); // Inicializamos um objeto e trabalhamos com os valores para esses objetos
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 20;

        // Aplicando métodos aos meus objetos
        sasuke.SharinganAtivado();
        String chamandoMetodo = sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = sasuke.anosParaSeTornarHogake(30);
        System.out.println("Você tem " + sasuke.idade + " anos então falta no mínimo " + quantoTempoFalta + " anos para se tornar um Hogake");


//        System.out.println(sasuke);

        // Criando o ninja naruto através do modo Sábio
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.idade = 13;
        naruto.aldeia = "Aldeia da Folha";

        // Criar Sakura
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura";
        sakura.idade = 14;
        sakura.aldeia = "Aldeia da Folha";
    }
}
