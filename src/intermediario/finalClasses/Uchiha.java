package intermediario.finalClasses;

import intermediario.herancaMultipla.SharinganInterface;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String aldeia, String nome, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(aldeia, nome, idade, numeroDeMissoesConcluidas, rank);
    }

    // Esse métod vai vir direto da interface
    @Override
    public void sharinganAtivado() {
        System.out.println("Meu nome é: " + nome + " sou um Uchiha sharingan ativado");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " sou um Uchiha. Ataque de fogo\nJá completei " + this.numeroDeMissoesConcluidas + " Missões");
    }

    // Sobrecarga de métod - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " essa é a minha INTELIGENCIA de batalha!! ");
    }
    // Interligencia de combate. Sobrecarga de métod utilizando o parâmetro do métod
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }
    }
    /*Utilizar o Override nas sobrecargas dos métodos não é necessário
    * MAS é uma boa prática adotar a anotação @Override
    * */

}
