/**
 * Created by Patrick on 19.11.2014.
 */
public class Euro2Yen extends WR {
    public Euro2Yen() {
        super("Euro2Yen");
    }

    @Override
    protected double doUmrechnen(double betrag) {
        double faktor = 147.0;
        return betrag * faktor;
    }
}
