package banking;

public class main {
    static void main() {
        Investimentos barsi = new Investimentos("Luiz Barsi", 5000);
        System.out.println(barsi.investir(1300));
        barsi.consultarInvestimentos();
        System.out.println(barsi.investir(500));
        barsi.consultarInvestimentos();
        System.out.println(barsi.investir(750));
        barsi.consultarInvestimentos();
        System.out.println(barsi.investir(10000));
        System.out.println(barsi.investir(750));

        System.out.println();
        barsi.consultarTotalInvestidos();
        System.out.println(barsi.getSaldoInvestido());


    }
}



