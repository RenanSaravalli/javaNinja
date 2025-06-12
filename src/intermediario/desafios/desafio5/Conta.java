package intermediario.desafios.desafio5;

public interface Conta {
    void consultarSaldo();

    void depositar(double valor);

    void transferenciaBancaria(double valor, ContaBancaria contaBancaria);

}
