package Cas_4_05_22_klaseIObjekti;

public class ZoomKorisnikMain {
    //	U glavnom programu kreirati objekte
    //	definisanih klasa i testirati rad definisanih funkcija

    public static void main(String[] args) {

        Korisnik guest = new Korisnik("jelena Obradovic");

        Korisnik host = new Korisnik("Nenad Obradovic");

        ZoomCall call1 = new ZoomCall("ghdgdhhgkjhg", "123456", guest, host);

        int uplata = 100;

        host.tipLicence(uplata);

        host.trajanjePoziva();

        call1.pokreniPoziv();



    }
}
