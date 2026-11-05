package banking;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

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
            return true;
        } else {
            System.out.println("Erro valor invalido!");
            return false; // so para exibir true ou false, preferi usar retorno boolean
        }
    }

    public void exibirDados() {
        System.out.println("--- Detalhes da Conta ---");
        System.out.printf("Titular: %s%n", getNomeTitular());
        System.out.printf("Numero Conta: %s%n", getNumeroConta());
        System.out.printf("Saldo R$: %.2f%n", getSaldo());
    }

    public boolean sacar(double saldo) {
        // poderia fazer os dois ifs utilizando ||
        // porem assim fica mais légivel e consigo usar mensagens especificas
        if (saldo <= 0) {
            System.out.println("Erro não pode sacar números menores ou igual a 0");
            return false;
        }

        if (saldo > this.saldo) {
            System.out.println("Não tem saldo suficiente para realizar o saque");
            return false;
        }

        this.saldo -= saldo;
        return true;
    }

    public double consultarSaldo() {
        System.out.println("Seu saldo é de...");
        return this.getSaldo();
    }
}
