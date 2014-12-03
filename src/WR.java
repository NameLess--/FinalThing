/**
 * Created by Patrick on 19.11.2014.
 */
public abstract class WR implements IUmrechnen {

    private String variante = "";
    protected WR next;

    public WR(String variante) {
        this.variante = variante;
    }

    public void setNext(WR nextWR) {
        next = nextWR;
    }


    public double umrechnen(String variante, double betrag) {
        if (this.variante.equals(variante)) {
            return doUmrechnen(betrag);
        } else {
            if (next != null) {
                return next.umrechnen(variante, betrag);
            } else {
                return Double.NaN;
            }

        }

    }

    abstract protected double doUmrechnen(double betrag);

    public String getVariante() {
        return variante;
    }
}
