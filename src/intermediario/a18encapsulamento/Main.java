package intermediario.a18encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Naruto Uzumaki ------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 10, 2, 1.20);

        System.out.println("Meu nome é: " + naruto.getNome());

        naruto.setNome("Naruto Uzumaki");

        System.out.println("Meu nome é: " + naruto.getNome());


        System.out.println("------ Sasuke Uchiha ------");
        Uchiha sasuke = new Uchiha("Sasuke", "Aldeia da folha", 10, 2, 1.36);

        System.out.println("Meu nome é: " + sasuke.getNome());

        sasuke.setNome("Sasuke Uchiha");

        System.out.println("Meu nome é: " + sasuke.getNome());

        sasuke.setIdade(-190); // Validando o atributo idade
        System.out.println(sasuke.getIdade());


    }
}
