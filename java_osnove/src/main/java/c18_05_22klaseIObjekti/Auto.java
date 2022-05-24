package c18_05_22klaseIObjekti;

public class Auto {

//Dopuna 2)
//U okviru klase Auto, implementirati jos 2 metode:
//metoda koja vraca informaciju da li je vozac prekoracio brzinu.
// Kao parametar metode se prima ogranicenje (kao broj) a metoda
// vraca true ili false ako je trenutna brzina veca od ogranicenja.
//metoda koja vraca visinu novcane kazne za prekoracenje, za svaku
// jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//U glavnom programu pozvati ove metode i odstmpajte neke poruke na
// osnovu informacija koje dobijete od njih.

    //Dopuniti klasu Auto tako da ima:
//atribut broj registracije
//da li je ukljucena klima u autu
//metodu dodajGas, koja povecava trenutnu brzinu za 10.
//metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

    ////(Dopuna 4)
    ////Dopuniti klasu Auto tako da ima:
    ////atribut godinu proizvodnje
    ////atribut mesec do kad je registrovan auto (int)
    ////atribut kubikaza auta (npr: 1600 - 5000)
    ////metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
    ////metodu koja vraca da li je istekla registracije. Metoda kao parametar prima
    //// trenutni mesec i na osnovu toga vraca true ili false.
    ////metodu koja racuna i vraca cenu registracije za auto. Za automobile
    //// do 2000 kubika cena registracije kubikaza * 100din, za automobile preko
    //// 2000 kubika dodatno se uracunava 30% na cenu.
    //

    public String vozac;
    public String marka;
    public int brojVrata;
    public int potrosnjaNa100km;
    public int trenutnaBrzina;

    public String registracija0;

    public boolean daLiJeUkljucenaKlima;
    public int godinaproizvodnje;
    public int mesecRegistracije;
    public int kubikazaAuta;


    public void stampa() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100km + " na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina");
    }

    public boolean daLiJeAutoRegistrovan(int trenutniDatum) {
        if (this.mesecRegistracije > trenutniDatum) {
            return true;
        }
        return false;
    }

    public double cenaRegistracije() {
        if (this.kubikazaAuta < 2000) {
            return this.kubikazaAuta * 100*1.0;
        }
        return this.kubikazaAuta * 100 * 1.3;
    }

    public boolean daLijeAutoOldtimer() {
        if (this.godinaproizvodnje < 1950) {
            return true;
        }
        return false;
    }

    public boolean daLiJeBrzinaPrekoracena(int ogranicenje) {
        if (this.trenutnaBrzina > ogranicenje) {
            return true;
        } else {
            return false;
        }
    }

    public int kazna(int ogranicenje) {
        if (ogranicenje - this.trenutnaBrzina < 0) {
            return (this.trenutnaBrzina - ogranicenje) * 1000;
        } else {
            return 0;
        }
    }

    public void dodajGas() {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
    }

    public void koci() {
        if (this.trenutnaBrzina > 10) {
            this.trenutnaBrzina = this.trenutnaBrzina - 10;
        } else {
            this.trenutnaBrzina = this.trenutnaBrzina;
        }
    }

    public double trenutnaPotrosnja() {
        if (this.daLiJeUkljucenaKlima == true) {
            double trenutnaPotrosnja = this.trenutnaBrzina / 100.0 * this.potrosnjaNa100km * 1.2;
            return trenutnaPotrosnja;
        }
        return this.trenutnaBrzina / 100 * this.potrosnjaNa100km * 1;
    }
}

