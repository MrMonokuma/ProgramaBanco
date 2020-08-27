public class Corriente extends Cuenta{

    public Corriente(long codigo, long saldo) {
        super(codigo, saldo);
    }

    @Override
    public String toString() {
        return "Corriente{" +
                "codigo=" + codigo +
                ", saldo=" + saldo +
                '}';
    }
	//hola a todos
    @Override
    public long consultarSaldo(Cliente cliente) {
        return 0;
    }
//prueba 2
}
