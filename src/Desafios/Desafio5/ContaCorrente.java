package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria {
    private final TipoConta tipoConta = TipoConta.CORRENTE;

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Valor final depositado: "+ valor);
    }
}
