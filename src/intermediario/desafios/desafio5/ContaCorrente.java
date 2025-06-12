package intermediario.desafios.desafio5;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente() {
    }

    public ContaCorrente(String titularConta, double saldo) {
        super(titularConta, saldo);
    }

    public ContaCorrente(String titularConta, double saldo, TipoConta tipoConta) {
        super(titularConta, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            saldo += 0;
            System.out.println("Deposite um valor positivo;");
        } else {
            saldo += valor;
            System.out.println("==== Conta Bancaria ====");
            System.out.println("Olá " + titularConta + ". Com o Depósito:\nR$ " + valor);
            System.out.println("Seu saldo agora é: R$ "+ saldo);
        }

    }
}
