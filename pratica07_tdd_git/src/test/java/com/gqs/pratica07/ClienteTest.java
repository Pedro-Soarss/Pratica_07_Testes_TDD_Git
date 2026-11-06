
package com.gqs.pratica07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Testes unitarios da classe Cliente.
 */
public class ClienteTest {

    @Test
    public void deveCriarClienteComDadosCorretos() {
        final int descontoEsperado = 10;
        Cliente cliente = new Cliente(1, "Carlos Silva", descontoEsperado);

        assertEquals(1, cliente.getId());
        assertEquals("Carlos Silva", cliente.getNome());
        assertEquals(descontoEsperado, cliente.getDesconto());
    }

    @Test
    public void deveAlterarDescontoDoCliente() {
        final int descontoInicial = 5;
        final int novoDesconto = 15;

        Cliente cliente = new Cliente(2, "Ana", descontoInicial);

        cliente.setDesconto(novoDesconto);

        assertEquals(novoDesconto, cliente.getDesconto());
    }

    @Test
    public void deveRetornarDadosFormatadosDoCliente() {
        final int idCliente = 3;
        final int desconto = 20;
        Cliente cliente = new Cliente(idCliente, "Pedro", desconto);

        String resultado = cliente.toString();

        assertEquals("Pedro(3)(20%)", resultado);
    }

    @Test
    public void deveRetornarGeneroNaoInformado() {
        final int idCliente = 4;
        final int desconto = 10;
        Cliente cliente = new Cliente(idCliente, "Mariana", desconto);

        assertNull(cliente.getGenero());
    }

    @Test
    public void deveCriarClienteComDescontoZeroPorCento() {
        final int idCliente = 5;
        final int descontoMinimo = 0;
        Cliente cliente = new Cliente(idCliente, "Ana", descontoMinimo);

        assertEquals(descontoMinimo, cliente.getDesconto());
    }

    @Test
    public void deveCriarClienteComDescontoCemPorCento() {
        final int idCliente = 6;
        final int descontoMaximo = 100;
        Cliente cliente = new Cliente(idCliente, "Bruno", descontoMaximo);

        assertEquals(descontoMaximo, cliente.getDesconto());
    }

    @Test
    public void deveAlterarDescontoParaZeroPorCento() {
        final int idCliente = 7;
        final int descontoInicial = 10;
        final int descontoMinimo = 0;
        Cliente cliente = new Cliente(idCliente, "Carla", descontoInicial);

        cliente.setDesconto(descontoMinimo);

        assertEquals(descontoMinimo, cliente.getDesconto());
    }

    @Test
    public void deveAlterarDescontoParaCemPorCento() {
        final int idCliente = 8;
        final int descontoInicial = 10;
        final int descontoMaximo = 100;
        Cliente cliente = new Cliente(idCliente, "Diego", descontoInicial);

        cliente.setDesconto(descontoMaximo);

        assertEquals(descontoMaximo, cliente.getDesconto());
    }
}
