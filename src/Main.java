public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("123456", "Vinicius Garcia", 0);
        cliente1.depositar(500.00);
        System.out.println(cliente1.getSaldoAtual());

        cliente1.sacar(200.00);
        System.out.println(cliente1.getSaldoAtual());

        cliente1.sacar(2000.00);
    }
}
