package Domaci_24_05_22;

public class Ringla {
    //Kreirati klasu Ringla koja ima:
    //tip ringle (obicna ili ekspres)
    //jacinu
    //za obicnu ringu jacina je u opsegu od 0 do 3
    //za ekspres ringlu jacina je u opsegu od 0 do 12
    //jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
    //konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
    //getter za jacinu
    //setteri ne postoje!!


    private String tipRingle;
    private int jacinaRingle;
    private double jacinaGrejaca;

    public Ringla(String tipRingle, double jacinaGrejaca) {
        this.tipRingle = tipRingle;
        this.jacinaRingle = 0;
        this.jacinaGrejaca = jacinaGrejaca;
    }

    public int getJacinaRingle() {
        return jacinaRingle;
    }


    //privatnu metodu koja vraca maksimalan broj pojacavanja
    //za obicnu je 3, za ekspres je 12

    private int maxBrojPOjacavanja() {
        if (this.tipRingle.equals("obicna")) {
            return 3;
        } else {
            return 12;
        }

    }

    //metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)

    public void pojacajRinglu() {
        if (jacinaRingle < 3 && this.tipRingle.equals("obicna")) {
            this.jacinaRingle = this.jacinaRingle + 1;
        } else if (jacinaRingle < 12 && this.tipRingle.equals("ekspres")) {
            this.jacinaRingle = this.jacinaRingle + 1;
        }
    }


    //metodu iskljuci ringlu - metoda postavlja jacinu na 0

    public void iskljuciRinglu() {
        this.jacinaRingle = 0;
    }


    //metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena

    public boolean daLiJeRinglaUkljucena() {
        if (this.jacinaRingle > 0) {
            return true;
        }
        return false;
    }

    //metodu koja vraca potrosnju elektricne energije prema formuli
    //100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi
    //metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi


    public double potrosnjaElEnergije(double vremenskiPeriodRada) {
        if (tipRingle.equals("obicna")) {
            double potrosnjaEE = 100 / 3 * this.jacinaRingle * this.jacinaGrejaca * vremenskiPeriodRada;
            return potrosnjaEE;
        } else {
            double potrosnjaEE = 100 / 12 * this.jacinaRingle * this.jacinaGrejaca * vremenskiPeriodRada;
            return potrosnjaEE;
        }
    }

    //metodu koja stampa podatke u formatu:
    //	Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste odstampali poruku)
    //Tip ringle: tip ringle
    //Jacina: jacina
    //Grejac: jacina grejaca kW

    public void stampa() {
        if (this.daLiJeRinglaUkljucena()) {
            System.out.println("Ringla je ukljucena.");
        } else {
            System.out.println("Ringla je iskljucena.");
        }
        System.out.println("Tip ringle: " + this.tipRingle);
        System.out.println("Jacina: " + this.jacinaRingle);
        System.out.println("Grejac" + this.jacinaGrejaca + "kW");
        System.out.println();

    }
}
