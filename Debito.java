import java.util.Date;

public class Debito {
    public long BIN;
    public Date fechaVenc;
    public int CVC;

    public Debito(long BIN, Date fechaVenc, int CVC) {
        this.BIN = BIN;
        this.fechaVenc = fechaVenc;
        this.CVC = CVC;
    }

    @Override
    public String toString() {
        return "Debito{" +
                "BIN=" + BIN +
                ", fechaVenc=" + fechaVenc +
                ", CVC=" + CVC +
                '}';
    }
}
