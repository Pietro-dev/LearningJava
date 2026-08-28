package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{
    private double saldo;
    private TipoConta tipoConta;

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void consultarSaldo() {
        System.out.println("==========Seu saldo é: " + this.saldo + "==========");
    }

    @Override
    public void depositar(ContaBancaria contaBancaria, double valor) {
        if(this.getSaldo() < valor){
            System.out.println("Saldo insuficiente");
        }else{
            this.setSaldo(this.getSaldo() - valor);

            if (contaBancaria.getTipoConta() == TipoConta.POUPANCA ) {
                System.out.println("========== Você está TRANSFERINDO para uma conta POUPANÇA.========== ");
                double taxa = valor * 0.01;
                contaBancaria.setSaldo(contaBancaria.getSaldo() + (valor-taxa));
                System.out.println("Taxa para depositar: " + taxa+ "\nValor final depositado: "+ (valor-taxa));
            } else {
                System.out.println("========== Você está TRANSFERINDO para uma conta CORRENTE.========== ");
                contaBancaria.setSaldo(getSaldo() + valor);
                System.out.println("Valor final depositado: "+ valor );
            }
        }
    }
}
