package banking;

public class main {
    static void main() {
        ContaBancaria conta1 = new ContaBancaria(23232, "Hiago");
        System.out.println(conta1.depositar(500));
        conta1.exibirDados();

        System.out.println();
        ContaBancaria conta2 = new ContaBancaria(2323132, "Dedé");
        System.out.println(conta2.depositar(-1));
        conta2.exibirDados();
    }
}
