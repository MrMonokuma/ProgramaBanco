public abstract class Cuenta {
    public long codigo;
    public long saldo;

    public Cuenta(long codigo, long saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public long consultarSaldo(){
        return 0;
    }

    public long retirarDinero(){
        return 0;
    }

    public void consignarDinero(){

    }

    public abstract long consultarSaldo(Cliente cliente);
}
