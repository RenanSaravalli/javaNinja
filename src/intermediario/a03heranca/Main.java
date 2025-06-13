package intermediario.a03heranca;

public class Main {
    public static void main(String[] args) {

        // Obj 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 18;
        naruto.modoSabio();

        // Obj 2 // A classe uchiha é filha da classe ninja então posso pegar tudo o tem na classe Ninja para Uchiha e
        // Os Atributos e métods exclusivos dos Uchihas
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivivado();


        // Obj 3
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura";
        sakura.idade = 18;
        sakura.aldeia = "Aldeia da Folha";
        sakura.AtivarCura();

        // Obj 4
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata";
        hinata.idade = 18;
        hinata.aldeia = "Aldeia da Folha";
        hinata.ativarByagugan();
    }
}
