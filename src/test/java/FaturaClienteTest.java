import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FaturaClienteTest {

    @Test
    void testConstrutoresEGettersSetters() {
        Cliente cliente = new Cliente(1, "Miguel", 10);
        FaturaCliente fatura = new FaturaCliente(101, cliente, 500.0);

        assertEquals(101, fatura.getId());
        assertEquals(cliente, fatura.getCliente());
        assertEquals(500.0, fatura.getValor());

        FaturaCliente faturaApenasId = new FaturaCliente(102);
        assertEquals(102, faturaApenasId.getId());

        faturaApenasId.setCliente(cliente);
        faturaApenasId.setValor(250.0);
        assertEquals(cliente, faturaApenasId.getCliente());
        assertEquals(250.0, faturaApenasId.getValor());
    }
}