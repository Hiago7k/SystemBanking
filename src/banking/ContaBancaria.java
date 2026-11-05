package banking;

import java.util.LinkedList;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    private static double taxa = 30;

    private LinkedList<String> historico = new LinkedList<>();

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
            historico.add("deposito realizado no valor de R$ " + saldo);
            return true;
        } else {
            System.out.println("Erro valor invalido!");
            return false;
        }
    }

    public void exibirDados() {
        System.out.println("--- Detalhes da Conta ---");
        System.out.printf("Titular: %s%n", getNomeTitular());
        System.out.printf("Numero Conta: %s%n", getNumeroConta());
        System.out.printf("Saldo R$: %.2f%n", getSaldo());
    }

    public boolean sacar(double saldo) {
        if (saldo <= 0) {
            System.out.println("Erro não pode sacar números menores ou igual a 0");
            return false;
        }

        if (saldo > this.saldo) {
            System.out.println("Não tem saldo suficiente para realizar o saque");
            return false;
        }

        this.saldo -= saldo;
        historico.add("saque realizado no valor de R$ " + saldo);
        return true;
    }

    public double consultarSaldo() {
        System.out.println("Seu saldo é de...");
        return this.getSaldo();
    }

    public void aplicarTaxaManutencao(){
        if (taxa <= this.saldo){
            this.saldo -= taxa;
        }else {
            saldo = 0;
        }
    }

    public void exibirHistorico(){
        System.out.println("---- Extrato ----");
        for (String log : historico){
            System.out.println(log);
        }
    }
}
