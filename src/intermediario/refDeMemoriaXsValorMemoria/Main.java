package intermediario.refDeMemoriaXsValorMemoria;

public class Main {
    public static void main(String[] args) {

        System.out.println("------ Sasuke -----");
        Uchiha sasuke = new Uchiha("Sasuke", "Aldeia da folha", 10, 2, NivelNinja.CHUUNIN);
        System.out.println(sasuke);



        System.out.println("----- Naruto -----");

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 10, 2, NivelNinja.CHUUNIN);
        System.out.println(naruto);
    }
}
