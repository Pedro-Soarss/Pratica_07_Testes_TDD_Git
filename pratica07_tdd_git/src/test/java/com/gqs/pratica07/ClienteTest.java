
package com.gqs.pratica07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    public void deveCriarClienteComDadosCorretos() {
        Cliente cliente = new Cliente(1, "Carlos Silva", 10);

        assertEquals(1, cliente.getId());
        assertEquals("Carlos Silva", cliente.getNome());
        assertEquals(10, cliente.getDesconto());
    }
}
