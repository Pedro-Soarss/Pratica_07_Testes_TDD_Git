import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaClienteTest {

    @Test
    public void testConstrutorEGets() {
        Cliente cliente = new Cliente(1, "Ana Silva", 0.0, 'F');
        ContaCliente conta = new ContaCliente(101, cliente, 500.0);
        
        assertEquals(101, conta.getNumeroConta());
        assertEquals(cliente, conta.getCliente());
        assertEquals(500.0, conta.getSaldo(), 0.0001);
    }

    @Test
    public void testAddDeposito() {
        Cliente cliente = new Cliente(1, "Ana Silva", 0.0, 'F');
        ContaCliente conta = new ContaCliente(101, cliente, 300.0);
        
        conta.addDeposito(150.0);
        
        assertEquals(450.0, conta.getSaldo(), 0.0001);
    }

    @Test
    public void testSubSaldoComSucesso() {
        Cliente cliente = new Cliente(1, "Ana Silva", 0.0, 'F');
        ContaCliente conta = new ContaCliente(101, cliente, 400.0);
        
        boolean resultado = conta.subSaldo(100.0);
        
        assertTrue(resultado);
        assertEquals(300.0, conta.getSaldo(), 0.0001);
    }

    @Test
    public void testSubSaldoInsuficiente() {
        Cliente cliente = new Cliente(1, "Ana Silva", 0.0, 'F');
        ContaCliente conta = new ContaCliente(101, cliente, 200.0);
        
        boolean resultado = conta.subSaldo(250.0); // Tenta tirar mais do que o saldo atual
        
        assertFalse(resultado);
        assertEquals(200.0, conta.getSaldo(), 0.0001); // O saldo deve permanecer inalterado
    }
}