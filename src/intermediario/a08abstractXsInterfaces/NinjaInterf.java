package intermediario.a08abstractXsInterfaces;

public interface NinjaInterf {
    // Caso crie um atributo na interface. Ele será FINAL, ou seja tenho que declarar seu valor aqui mesmo.
    boolean ehNinja = true;

    // Nas interfaces obrigatóriamente tods métods são abstratos
    void socar();

    void jutsuMuitoFoda();
}
