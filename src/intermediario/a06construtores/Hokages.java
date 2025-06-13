package intermediario.a06construtores;

// Isso é uma classe abstrata. Ela não pode instanciar objetos 
public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    /*Normalmente em um código real
    * Criamos dois construtores
    * Um com TODOS argumentos
    * Um SEM argumentos*/

    // COnseguimos construir automaticamente nossos construtores com o intellij
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        // AllArgs Constructor
    }

    public Hokages() {
//         Construtor vazio (Sem argumentos )
//         NoArgs Constructor
    }

    // Criando um métod abstrato
    public abstract void ganharSabedoria();


}
