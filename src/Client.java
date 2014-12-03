/**
 * Created by Patrick on 19.11.2014.
 */
public class Client {

    public static void main(String[] args) {
        IUmrechnen chain = createChain();
        double betrag = 20.0;

        System.out.println(betrag + " € sind " + chain.umrechnen("Euro2Yen", betrag) + " YEN.");

        ISammelUmrechnung sammelChain = new SammelUmrechung(createChain());
        double[] betraege = {10.0, 14.0, 28.0};
        System.out.println("Die Summe von " + betraegeToString(betraege) + " in €uro ergibt als Summe in Yen: " + sammelChain.sammelUmrechnen(betraege, "Euro2Yen"));
    }

    private static String betraegeToString(double[] betraege){
        if (betraege == null || betraege.length == 0)
        {
            return "";
        }
        if (betraege.length == 1)
        {
            return Double.toString(betraege[0]);
        }
        String result = Double.toString(betraege[0]);
        for (int i = 1; i < betraege.length; i++){
            result += ", " + betraege[i];
        }
        return result;
    }

    private static IUmrechnen createChain() {
        WR EuroDollarRechner = new Euro2Dollar();
        WR EuroYenRechner = new Euro2Yen();
        WR DollarYenRechner = new Dollar2Yen();

        WR DollarYenLogging = new LoggingDekorierer(DollarYenRechner);
        WR EuroYenGebuehren = new GebuehrenDekorierer(EuroYenRechner, 0.5);

        EuroDollarRechner.setNext(EuroYenGebuehren);
        EuroYenGebuehren.setNext(DollarYenLogging);

        return EuroDollarRechner;
    }
}
