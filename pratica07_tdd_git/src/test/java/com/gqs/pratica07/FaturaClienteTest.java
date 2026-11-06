
package com.gqs.pratica07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testes unitarios da classe FaturaCliente.
 */
public class FaturaClienteTest {

    private static final int CLIENTE_ID = 1;
    private static final int FATURA_ID = 101;
    private static final int OUTRA_FATURA_ID = 102;
    private static final int DESCONTO_DEZ = 10;
    private static final int DESCONTO_QUINZE = 15;
    private static final double VALOR_QUINHENTOS = 500.0;
    private static final double VALOR_DUZENTOS_CINQUENTA = 250.0;
    private static final double VALOR_DUZENTOS = 200.0;
    private static final double VALOR_CENTO_OITENTA = 180.0;
    private static final double VALOR_TREZENTOS = 300.0;
    private static final double TOLERANCIA = 0.001;

    @Test
    void testConstrutoresEGettersSetters() {
        Cliente cliente = new Cliente(CLIENTE_ID, "Miguel", DESCONTO_DEZ);
        FaturaCliente fatura = new FaturaCliente(
                FATURA_ID, cliente, VALOR_QUINHENTOS);

        assertEquals(FATURA_ID, fatura.getId());
        assertEquals(cliente, fatura.getCliente());
        assertEquals(VALOR_QUINHENTOS, fatura.getValor());

        FaturaCliente faturaApenasId = new FaturaCliente(OUTRA_FATURA_ID);
        assertEquals(OUTRA_FATURA_ID, faturaApenasId.getId());

        faturaApenasId.setCliente(cliente);
        faturaApenasId.setValor(VALOR_DUZENTOS_CINQUENTA);
        assertEquals(cliente, faturaApenasId.getCliente());
        assertEquals(VALOR_DUZENTOS_CINQUENTA, faturaApenasId.getValor());
    }

    @Test
    void testGetValorComDesconto() {
        Cliente cliente = new Cliente(CLIENTE_ID, "Miguel", DESCONTO_DEZ);
        FaturaCliente fatura = new FaturaCliente(
                FATURA_ID, cliente, VALOR_DUZENTOS);

        // Desconto de 10% sobre 200 resulta em 180.
        assertEquals(
                VALOR_CENTO_OITENTA,
                fatura.getValorComDesconto(),
                TOLERANCIA);
    }

    @Test
    void testToString() {
        Cliente cliente = new Cliente(CLIENTE_ID, "Miguel", DESCONTO_QUINZE);
        FaturaCliente fatura = new FaturaCliente(
                FATURA_ID, cliente, VALOR_TREZENTOS);

        String esperado =
                "Fatura [id=101, cliente=Miguel(1)(15%), valor=300.0]";
        assertEquals(esperado, fatura.toString());
    }
}
