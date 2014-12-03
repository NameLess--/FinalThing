/**
 * Created by Patrick on 19.11.2014.
 */
public class Dollar2Yen extends WR {

    public Dollar2Yen() {
        super("Dollar2Yen");
    }

    @Override
    protected double doUmrechnen(double betrag) {
        double faktor = 177.0;
        return betrag * faktor;
    }
}
