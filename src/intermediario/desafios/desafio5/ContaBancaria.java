package intermediario.desafios.desafio5;

public abstract class ContaBancaria implements Conta{
    String titularConta;
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(String titularConta, double saldo) {
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    public ContaBancaria(String titularConta, double saldo, TipoConta tipoConta) {
        this(titularConta, saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("==== Conta Bancaria ====");
        System.out.println("Olá " + titularConta + " seu saldo é:\nR$ " + saldo);
        System.out.println("Seu tipo de conta: " + tipoConta);
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferenciaBancaria(double valor, ContaBancaria contaBancaria) {
        if (valor > 0 && valor < this.saldo) {
            this.saldo -= valor;
            contaBancaria.saldo += valor;
            System.out.println("Transferindo o valor de: " + valor + " para:");
            System.out.println(contaBancaria.titularConta);
            System.out.println("Seu saldo agora é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}
