public class Ahorro extends Cuenta{
    public Ahorro(long codigo, long saldo) {
        super(codigo, saldo);
    }

    @Override
    public String toString() {
        return "Ahorro{" +
                "codigo=" + codigo +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public long consultarSaldo(Cliente cliente) {
        long saldito;
        saldito = cliente.cuenta.saldo;
        return saldito;
    }
}
