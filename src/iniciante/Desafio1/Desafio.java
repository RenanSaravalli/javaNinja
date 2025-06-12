package iniciante.Desafio1;

public class Desafio {
    public static void main(String[] args) {
        /*Crie um programa que represente três ninjas da Vila
        da Folha (Konoha) de "Naruto" e suas respectivas
        missões.
        Cada ninja tem um nome, uma idade e uma missão
        atribuída a ele, com o nome da missão, nível de
        dificuldade e status de conclusão
*/
        // Ninja1
        String nomeNinja1 = "Shikamaru";
        int idadeNinja1 = 12;
        String missaoNinja1 = "Limpar os banheiros de Konoha";
        char nivelMissao1 = 'D';
        boolean statusConlusaoMissao1 = false;

        // Ninja2
        String nomeNinja2 = "Rock Lee";
        int idadeNinja2 = 16;
        String missaoNinja2 = "Espancar uma arvóre até ficar bombadão";
        char nivelMissao2 = 'B';
        boolean statusConlusaoMissao2 = false;

        // Ninja3
        String nomeNinja3 = "Naruto";
        int idadeNinja3 = 10;
        String missaoNinja3 = "Roçar a grama de Konoha com uma tesoura (Sem ponta) ";
        char nivelMissao3 = 'D';
        boolean statusConlusaoMissao3 = false;

        boolean ehMissaoCouD = nivelMissao3 == 'D' || nivelMissao3 == 'C';

        if (idadeNinja1 <= 15 && ehMissaoCouD) {
            statusConlusaoMissao1 = true;
            System.out.println("Atenção " + nomeNinja1 + "\nSua missão é: " + missaoNinja1 + "\nSeu nível: " + nivelMissao1);
            System.out.println("Missão pode ser concluida? " + statusConlusaoMissao1);
        } else {
            statusConlusaoMissao1 = true;
            System.out.println("Então você está crescidinho! " + nomeNinja1);
            System.out.println("Sua missão: " + missaoNinja1 + "\nSeu nível: " + nivelMissao1);
            System.out.println("Missão pode ser concluida? " + statusConlusaoMissao1);
            System.out.println("Agora tu se fudeu mermao");
        }

        System.out.println("------------------------------------------------------------------");

        if (idadeNinja2 <= 15 && ehMissaoCouD) {
            statusConlusaoMissao2 = true;
            System.out.println("Atenção " + nomeNinja2 + "\nSua missão é: " + missaoNinja2 + "\nSeu nível: " + nivelMissao2);
            System.out.println("Missão pode ser concluida? " + statusConlusaoMissao2);
        } else {
            statusConlusaoMissao2 = true;
            System.out.println("Então você está crescidinho! " + nomeNinja2);
            System.out.println("Sua missão: " + missaoNinja2 + "\nSeu nível: " + nivelMissao2);
            System.out.println("Missão pode ser concluida? " + statusConlusaoMissao2);
            System.out.println("Agora tu se fudeu mermao");
        }

        System.out.println("------------------------------------------------------------------");

        if (idadeNinja3 <= 15 && ehMissaoCouD) {
            statusConlusaoMissao3 = true;
            System.out.println("Atenção " + nomeNinja3 + "\nSua missão é: " + missaoNinja3 + "\nSeu nível: " + nivelMissao3);
            System.out.println("Missão pode ser concluida? " + statusConlusaoMissao3);
        } else {
            statusConlusaoMissao3 = true;
            System.out.println("Então você está crescidinho!" + nomeNinja3);
            System.out.println("Sua missão: " + missaoNinja3 + "\nSeu nível: " + nivelMissao3);
            System.out.println("Missão pode ser concluida? " + statusConlusaoMissao3);
            System.out.println("Agora tu se fudeu mermao");
        }
    }
}
