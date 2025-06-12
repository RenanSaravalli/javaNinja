package intermediario.interfaces;
// implements -> Acessando essa janela (interface)
public class Boruto extends Uzumaki implements HyugaUzumaki{
    @Override
    public void ativarOKarma() {
        System.out.println("Karma foi ativado! Eu sou um HyugaUzumaki");
    }

    @Override
    public void ativarJougan() {
        System.out.println("Jougan foi ativado com sucesso!!! Eu sou um HyugaUzumaki");
    }
}
