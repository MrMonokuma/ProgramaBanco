import java.util.Date;

public class Credito {
    public long BIN;
    public Date fechaVenc;
    public int CVV;
    public long cupo;

    public Credito(long BIN, Date fechaVenc, int CVV, long cupo) {
        this.BIN = BIN;
        this.fechaVenc = fechaVenc;
        this.CVV = CVV;
        this.cupo = cupo;
    }

    @Override
    public String toString() {
        return "Credito{" +
                "BIN=" + BIN +
                ", fechaVenc=" + fechaVenc +
                ", CVV=" + CVV +
                ", cupo=" + cupo +
                '}';
    }

    public String realizarPago(){
        String recibo = "";
        return recibo;
    }

    public long consultarCupo(){
        long saldo = 0;
        return saldo;
    }
}
