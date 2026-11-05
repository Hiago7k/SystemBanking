package banking;

public class main {
    static void main() {
        ContaBancaria conta1 = new ContaBancaria(23213, "Hiago");
        ContaBancaria conta2 = new ContaBancaria(123, "Dede");
        ContaBancaria conta3 = new ContaBancaria(14345, "Nathalia");

        conta1.depositar(1000);
        conta2.depositar(3000);
        conta3.depositar(2300);

        conta1.aplicarTaxaManutencao();
        conta2.aplicarTaxaManutencao();

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());


    }
}



