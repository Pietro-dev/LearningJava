package Desafios.Desafio5;

public interface Conta {
    void depositar(double valor);
    void depositar(ContaBancaria contaBancaria, double valor);
    void consultarSaldo();
}
