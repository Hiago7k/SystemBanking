package banking;

public class main {
    static void main() {
        ContaBancaria conta = new ContaBancaria(27323, "Hiago");
        conta.depositar(200);
        conta.sacar(100);
        conta.depositar(50);
        conta.sacar(1000);

        conta.exibirHistorico();



    }
}



