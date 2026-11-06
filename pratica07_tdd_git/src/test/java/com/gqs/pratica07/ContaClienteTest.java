
package com.gqs.pratica07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testes unitarios da classe ContaCliente.
 */
public class ContaClienteTest {

    private static final int CLIENTE_ID = 1;
    private static final int CONTA_ID = 101;
    private static final double SALDO_QUINHENTOS = 500.0;
    private static final double SALDO_QUATROCENTOS = 400.0;
    private static final double SALDO_TREZENTOS = 300.0;
    private static final double SALDO_DUZENTOS = 200.0;
    private static final double DEPOSITO = 150.0;
    private static final double SAQUE = 100.0;
    private static final double SAQUE_INSUFICIENTE = 250.0;
    private static final double SALDO_APOS_DEPOSITO = 450.0;
    private static final double TOLERANCIA = 0.0001;

    @Test
    public void testConstrutorEGets() {
        Cliente cliente = new Cliente(CLIENTE_ID, "Ana Silva", 0);
        ContaCliente conta = new ContaCliente(
                CONTA_ID, cliente, SALDO_QUINHENTOS);

        assertEquals(CONTA_ID, conta.getNumeroConta());
        assertEquals(cliente, conta.getCliente());
        assertEquals(SALDO_QUINHENTOS, conta.getSaldo(), TOLERANCIA);
    }

    @Test
    public void testAddDeposito() {
        Cliente cliente = new Cliente(CLIENTE_ID, "Ana Silva", 0);
        ContaCliente conta = new ContaCliente(
                CONTA_ID, cliente, SALDO_TREZENTOS);

        conta.addDeposito(DEPOSITO);

        assertEquals(SALDO_APOS_DEPOSITO, conta.getSaldo(), TOLERANCIA);
    }

    @Test
    public void testSubSaldoComSucesso() {
        Cliente cliente = new Cliente(CLIENTE_ID, "Ana Silva", 0);
        ContaCliente conta = new ContaCliente(
                CONTA_ID, cliente, SALDO_QUATROCENTOS);

        boolean resultado = conta.subSaldo(SAQUE);

        assertTrue(resultado);
        assertEquals(SALDO_TREZENTOS, conta.getSaldo(), TOLERANCIA);
    }

    @Test
    public void testSubSaldoInsuficiente() {
        Cliente cliente = new Cliente(CLIENTE_ID, "Ana Silva", 0);
        ContaCliente conta = new ContaCliente(
                CONTA_ID, cliente, SALDO_DUZENTOS);

        boolean resultado = conta.subSaldo(SAQUE_INSUFICIENTE);

        assertFalse(resultado);
        assertEquals(SALDO_DUZENTOS, conta.getSaldo(), TOLERANCIA);
    }
}
