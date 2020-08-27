import java.util.Arrays;

public class Cliente {
    public String nombre;
    public long id;
    public Credito credito;
    public Debito debito;
    public Cuenta cuenta;
    public long prestamo;

    public Cliente(String nombre, long id, Credito credito, Debito debito, Cuenta cuenta, long prestamo) {
        this.nombre = nombre;
        this.id = id;
        this.credito = credito;
        this.debito = debito;
        this.cuenta = cuenta;
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", credito=" + credito +
                ", debito=" + debito +
                ", cuenta=" + cuenta +
                ", prestamo=" + prestamo +
                '}';
    }

    public String realizarCompraTarjeta(){
        String recibo = "";
        return recibo;
    }
}
