/**
 * Created by Patrick on 26.11.2014.
 */
public class LoggingDekorierer extends WR{

    WR rechner;

    public LoggingDekorierer(WR rechner) {
        super(rechner.getVariante());
        this.rechner = rechner;
    }

    @Override
    protected double doUmrechnen(double betrag) {
        System.out.println("Umrechnungsvorgang, Variante: " + rechner.getVariante() + " mit dem Betrag von " + betrag + ".");
        return rechner.doUmrechnen(betrag);
    }
}