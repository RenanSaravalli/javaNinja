package intermediario.desafios.desafio5;

public class TesteDesafio5 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Cleber", 0, TipoConta.CORRENTE);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(829.80);

        System.out.println(" ");

        ContaPoupanca contaPoupanca = new ContaPoupanca("Enzo", 0, TipoConta.POUPANCA);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(10000);
        contaPoupanca.depositar(2131);
        contaPoupanca.depositar(100000);

        System.out.println(" ");

        contaPoupanca.transferenciaBancaria(100, contaCorrente);


        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();
    }
}
