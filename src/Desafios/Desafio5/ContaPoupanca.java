package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria {
    private final TipoConta tipoConta = TipoConta.POUPANCA;

    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.01;
        setSaldo(getSaldo() + (valor-taxa));
        System.out.println("Taxa para depositar: " + taxa+ "\nValor final depositado: "+ (valor-taxa));
    }

}
