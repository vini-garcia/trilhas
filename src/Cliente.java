public class Cliente {
    private String numeroConta;
    private String nomeCliente;
    private double saldoAtual;

    public Cliente(String numeroConta, String nomeCliente, double saldoAtual) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldoAtual = saldoAtual;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldoAtual += valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldoAtual >= valor) {
            saldoAtual -= valor;
        } else if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

}
