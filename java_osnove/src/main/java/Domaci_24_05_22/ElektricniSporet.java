package Domaci_24_05_22;

public class ElektricniSporet {
    //Kreirati klasu ElektricniSporet koja ima:
    //marku storeta (npr: Beko, Bosh)
    //garanciju kao broj godina
    //maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
    //4 ringle
    //gore levo
    //gore desno
    //dole levo
    //dole desno
    //konstruktor koji postavlja sve atribute
    //gettere za sve atribut
    //ne postoje setteri


    private String markaSporeta;
    private int garancija;
    private int maxBrUkljRingli;
    private Ringla ringlaDoleLevo;
    private Ringla ringlaDoleDesno;
    private Ringla ringlaGoreDesno;
    private Ringla ringlaGoreLevo;

    public ElektricniSporet() {
    }

    public ElektricniSporet(String markaSporeta, int garancija, int maxBrUkljRingli, Ringla ringlaDoleLevo, Ringla ringlaDoleDesno, Ringla ringlaGoreDesno, Ringla ringlaGoreLevo) {
        this.markaSporeta = markaSporeta;
        this.garancija = garancija;
        this.maxBrUkljRingli = maxBrUkljRingli;
        this.ringlaDoleLevo = ringlaDoleLevo;
        this.ringlaDoleDesno = ringlaDoleDesno;
        this.ringlaGoreDesno = ringlaGoreDesno;
        this.ringlaGoreLevo = ringlaGoreLevo;
    }

    public String getMarkaSporeta() {
        return markaSporeta;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxBrUkljRingli() {
        return maxBrUkljRingli;
    }

    public Ringla getRinglaDoleLevo() {
        return ringlaDoleLevo;
    }

    public Ringla getRinglaDoleDesno() {
        return ringlaDoleDesno;
    }

    public Ringla getRinglaGoreDesno() {
        return ringlaGoreDesno;
    }

    public Ringla getRinglaGoreLevo() {
        return ringlaGoreLevo;
    }


    //metodu pojacaj kojoj se prosledjuje pozicija ringle
    //pozicija 1 je ringla gore levo
    //pozicija 2 je ringla gore desno
    //pozicija 3 je ringla dole levo
    //pozicija 4 je ringla dole desno

        public void pojacaj (Ringla pozicija)
        {if (pozicija.equals(1))
        {pozicija.pojacajRinglu();}

        }

    //metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
    //pozicija 1 je ringla gore levo
    //pozicija 2 je ringla gore desno
    //pozicija 3 je ringla dole levo
    //pozicija 4 je ringla dole desno

    public void iskljuciRingluES (Ringla pozicija)
    {
        pozicija.iskljuciRinglu();
    }

    //Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava
    // u tom pozivu funkije
    //Za gasenje ringli iskoristite metodu koja je definisana

    public void prekoracenjeBrojaukljucenihRingli (Ringla ringla)
    {int brojac = 0;
        if (this.ringlaGoreLevo.daLiJeRinglaUkljucena()==true)
        {brojac++;}
        if(this.ringlaGoreDesno.daLiJeRinglaUkljucena()==true)
        {brojac++;}
            if (this.ringlaDoleDesno.daLiJeRinglaUkljucena()==true)
            {brojac++;}
            if (this.ringlaDoleLevo.daLiJeRinglaUkljucena()==true)
            {brojac++;}
            if (brojac<this.maxBrUkljRingli)
            {this.pojacaj(ringla);}
            else
            {
                for (int i = 0; i < 4; i++) {
                    iskljuciRingluES(ringla);

                }
            }
        }


    //metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
    //metodu koja stampa podatke u formatu:
}
