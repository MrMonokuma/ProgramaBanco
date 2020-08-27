import org.junit.Test;

import static org.junit.Assert.*;

public class consultarSaldoCuentaTest {

    @Test
    public void consultarSaldo() {
        Ahorro ahorrito = new Ahorro(1,2000000);
        Corriente corrientica = new Corriente(2, 1000000);
        Cliente clientico = new Cliente("Nicolás",1007634202,null,null,ahorrito,0);
        long saldito = clientico.cuenta.consultarSaldo(clientico);
        assertEquals(2000000,saldito);
    }
}