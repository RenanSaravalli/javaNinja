package intermediario.interfaces;

public class Main {
    public static void main(String[] args) {

        // Obj 1
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 18;
        naruto.modoSabio();

        // Obj 2
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

        // Obj 5
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.idade = 9;
        boruto.aldeia = "Aldeia da folha";
        boruto.modoSabio();
        boruto.ativarOKarma();
        boruto.ativarJougan();
    }
}
