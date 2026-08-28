package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        ContaCorrente cc = new ContaCorrente();

        cp.consultarSaldo();
        cp.depositar(500);
        cp.consultarSaldo();
        cp.depositar(cc,100);

        cp.consultarSaldo();

        cc.consultarSaldo();
    }
}
