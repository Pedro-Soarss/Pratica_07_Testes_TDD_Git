package com.gqs.pratica07;

public class FaturaCliente {
    private int id;
    private Cliente cliente;
    private double valor;

    public FaturaCliente(int id, Cliente cliente, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
    }

    public FaturaCliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

       public void setValor(double valor) {
        this.valor = valor;
    }

    /** Percentual usado para calcular o desconto. */
    private static final double PERCENTUAL = 100.0;

    /**
     * Calcula o valor da fatura com o desconto do cliente.
     *
     * @return valor com desconto aplicado
     */
    public double getValorComDesconto() {
        if (cliente == null) {
            return valor;
        }
        return valor * (1.0 - (cliente.getDesconto() / PERCENTUAL));
    }

    @Override
    public String toString() {
     String clienteStr = (cliente != null) ? cliente.toString() : "null";
    return "Fatura [id=" + id + ", cliente=" + clienteStr + ", valor=" + valor + "]";
    }
}
