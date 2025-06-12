package iniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /* Laços de repetição
        *  Vão repetir até infinitamente ou até atingir um parâmetro desejado
        * While / For
        * */

        // while
        // while (condicao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

//        while (numeroDeClones <= numeroMaxDeClones) {
//            numeroDeClones++;
//            System.out.println("O naruto fez " + numeroDeClones +" clone das sombras");
//        }

        // FOR
        for (int i = 0; i <= numeroMaxDeClones; i++) {
            System.out.println("O naruto fez " + i +" clone das sombras");        }
    }
}
