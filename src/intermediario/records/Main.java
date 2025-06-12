package intermediario.records;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto", "naruto.email.com", 999999);
        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "Sasuke@gmail.com", 111111);

        System.out.println("Classe: " + cadastro);
        System.out.println("Record: " + cadastroRecord);

        System.out.println("Acessando atributo na classe: " + cadastro.getNome());
        System.out.println("Acessando atributo no record: " + cadastroRecord.nome());
    }
}
