/**
 * Created by Patrick on 19.11.2014.
 */
public class Euro2Dollar extends WR {
    public Euro2Dollar() {
        super("Euro2Dollar");
    }

    @Override
    protected double doUmrechnen(double betrag) {
        double faktor = 1.25;
        return betrag * faktor;
    }
}
