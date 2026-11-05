package banking;

public class main {
    static void main() {
       ContaBancaria conta = new ContaBancaria(23217312, "Hiago");
        System.out.println(conta.depositar(1000));

        System.out.println(conta.sacar(200));
        System.out.println(conta.consultarSaldo());
        System.out.println(conta.sacar(900));
        System.out.println(conta.consultarSaldo());

        System.out.println(conta.depositar(500));
        System.out.println(conta.consultarSaldo());
        System.out.println(conta.sacar(1300));
        System.out.println(conta.consultarSaldo());


    }
}



