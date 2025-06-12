package intermediario.abstractXsInterfaces;

public abstract class Ninja {
    String nome;
    int idade;
    String aldeia;

    // Nas classes abstratas podemos ter métodos normais
    public void chutar() {
        System.out.println("Ninja: " + nome + " chutando");
    }

    // Podemos ter métodos abstratos que não tem corpo
    public abstract void jutsuCabuloso();

    /*Os objetos não podem ser criados a partir dessa classe
    * e sim das classes filhas
    * */
}
