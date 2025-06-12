package intermediario.desafios.desafio4;

public class TesteDesafio4 {
    public static void main(String[] args) {
        NinjaBasico konohamaru = new NinjaBasico("konohamaru", 8, TipoHabilidade.NINJUTSU);

        konohamaru.mostrarInformacoes();
        konohamaru.executarHabilidade();

        System.out.println(" ");

        NinjaAvancado pain = new NinjaAvancado("Pain", 20, TipoHabilidade.RINNENGAN,"Shinra Tensei");

        pain.mostrarInformacoes();
        pain.executarHabilidade();
    }
}
