package intermediario.desafios.desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca() {
    }

    public ContaPoupanca(String titularConta, double saldo) {
        super(titularConta, saldo);
    }

    public ContaPoupanca(String titularConta, double saldo, TipoConta tipoConta) {
        super(titularConta, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            saldo += 0;
            System.out.println("Deposite um valor positivo;");
        } else {
            double valorComTaxaDeposito = valor - (0.01 * valor);
            saldo += valorComTaxaDeposito;
            System.out.println("==== Conta Bancaria ====");
            System.out.println("Olá " + titularConta + " com o Depósito:\nR$ " + valor);
            System.out.println("Com a taxa de 1% o valor de depósito fica: R$ " +valorComTaxaDeposito);
            System.out.println("Seu saldo agora é: R$ "+ saldo);
        }
    }
}
