package intermediario.herancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface {


    // Vamoas aprender a comentar: Utilizamos um comentário para lembrar de alguma parte do código
    // Exemplo de comentário abaixo

    /*Metdo:
    * Implementa da interface Sharingan*/
    @Override
    public void sharinganAtivado() {
        System.out.println("Meu nome é: " + nome + " sou um Uchiha sharingan ativado");
        // Esse métod vai vir direto da interface
    }
}
