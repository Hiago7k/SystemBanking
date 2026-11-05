package banking;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular){
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

    public boolean depositar(double saldo){
        if (saldo > 0){
            this.saldo += saldo;
            return true;
        }else {
            System.out.println("Erro valor invalido!");
            return false; // so para exibir true ou false, preferi usar retorno boolean
        }
    }

    public void exibirDados(){
        System.out.println("--- Detalhes da Conta ---");
        System.out.printf("Titular: %s%n", getNomeTitular());
        System.out.printf("Numero Conta: %s%n", getNumeroConta());
        System.out.printf("Saldo R$: %.2f%n", getSaldo());
    }
}
