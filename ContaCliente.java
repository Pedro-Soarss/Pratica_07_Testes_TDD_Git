public class ContaCliente {
    private int numeroConta;
    private Cliente cliente;
    private double saldo;

    public ContaCliente() {
    }

    public ContaCliente(int numeroConta, Cliente cliente, double saldo) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public ContaCliente(int numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void addDeposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean subSaldo(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaCliente [numeroConta=" + numeroConta + ", cliente=" + cliente + ", saldo=" + saldo + "]";
    }
}