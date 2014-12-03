/**
 * Created by Patrick on 03.12.2014.
 */
public class SammelUmrechung implements ISammelUmrechnung {

    IUmrechnen umrechnen;

    public SammelUmrechung(IUmrechnen umrechnen) {
        this.umrechnen = umrechnen;
    }

    @Override
    public double sammelUmrechnen(double[] betraege, String variante) {
        double sum = 0;
        for (double betrag : betraege) {
            sum += umrechnen.umrechnen(variante, betrag);
        }
        return sum;
    }
}
