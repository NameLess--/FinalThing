/**
 * Created by Patrick on 26.11.2014.
 */
public class GebuehrenDekorierer extends WR {

    WR rechner;
    double gebuehrProzent;

    public GebuehrenDekorierer(WR rechner, double gebuehrProzent) {
        super(rechner.getVariante());
        this.rechner = rechner;
        if(gebuehrProzent >= 0 && gebuehrProzent <= 100) {
            this.gebuehrProzent = gebuehrProzent;
        }
    }

    @Override
    protected double doUmrechnen(double betrag) {
        double gebuehrBetrag = betrag *  this.gebuehrProzent / 100;
        System.out.println("Es wurden Gebühren in der Höhe von " + gebuehrBetrag + " abgezogen.");
        return rechner.doUmrechnen(betrag - gebuehrBetrag);
    }
}