package banking;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.LinkedList;

public class Investimentos {
    private String titular;
    private double saldoInvestido;

    private LinkedList<Double> valoresInvestidos = new LinkedList<>();
    private LinkedList<LocalDate> datasInvestimentos = new LinkedList<>();

    public Investimentos(String titular, double saldoInvestido) {
        this.titular = titular;
        this.saldoInvestido = saldoInvestido;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoInvestido() {
        return saldoInvestido;
    }

    public void setSaldoInvestido(double saldoInvestido) {
        this.saldoInvestido = saldoInvestido;
    }


    public boolean investir(double valor) {

        if (valor <= 0) {
            System.out.println("Erro valor deve ser positivo ou maior que 0");
            return false;
        }

        if (valor > this.saldoInvestido) {
            System.out.println("Saldo na corretora, insuficiente para realizar o investimento");
            return false;
        }

        this.saldoInvestido -= valor;
        valoresInvestidos.add(valor);
        datasInvestimentos.add(OffsetDateTime.now().toLocalDate());
        return true;
    }

    public void consultarInvestimentos() {
        System.out.println("--- Saldo na Correta ---");
        System.out.printf("R$ %.2f%n", this.getSaldoInvestido());
    }

    public void consultarTotalInvestidos() {
        System.out.println("--- Pórtfolio ---");
        double totalInvestido = 0;

        if (valoresInvestidos.isEmpty()){
            System.out.println("Não possúi investimentos ainda");
            return;
        }

        for (int i = 0; i < valoresInvestidos.size(); i++){
            System.out.printf("Valor R$ %.2f | Data: %s%n", valoresInvestidos.get(i), datasInvestimentos.get(i));
            totalInvestido += valoresInvestidos.get(i);
        }

        System.out.printf("Total Investidos: R$ %.2f%n", totalInvestido);
    }
}
