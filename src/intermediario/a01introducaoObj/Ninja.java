package intermediario.a01introducaoObj;

public class Ninja {
    // Atributos no Ninja
    String nome;
    String aldeia;
    int idade;

    //Criar um métod público personalizado
    // void -> não retorna nenhum valor
    public void SharinganAtivado() {
        System.out.println("O Sharingan Ativou");
    }

    // Métod String, obrigatóriamente vai ter que retornar uma String
    public String euSouUmNinja() {
        return "Olá, eu sou um ninja!";
    }

    // Metod Int vai ter que retornar um int
    // Agora vamos começar a trabalhar com parâmetros
    public int anosParaSeTornarHogake(int idadeMinimaParaSerHogake ){
        return idadeMinimaParaSerHogake - idade;
    }
}
