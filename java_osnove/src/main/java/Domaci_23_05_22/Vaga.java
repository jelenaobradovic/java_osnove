package Domaci_23_05_22;

public class Vaga {
    //	Kreirati klasu Vaga koja ima:
    //merna jedinica (kg ili lb)

    //proizvod (proizvod koji se meri)

    //TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!

    private String mernaJedinica;

    private Proizvod proizvod;


    //default-ni konstuktor
    //getteri i setteri za sve atribute

    public Vaga() {
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    //metodu sracunajCenu koja vraca cenu proizvoda
    // za unetu tezinu (tezina je parametar funkcije).
    // Na racunanje cene utice i merna jedinica na koju je vaga podesena.

    public double cenaProizvoda(String mernaJedinica, double tezina) {
        if (this.mernaJedinica.equals("kg")) {
            return tezina * this.proizvod.getCenaKg();
        } else {
            return tezina * this.proizvod.cenaPOLb();
        }
    }
    //metodu stampaj koja stampa racun u formatu.
    // POMOC: trebace vam tezina kao parametar u ovoj metodi
    //   (sifra) - (naziv)
    //   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
    //   Ukupno: (ukupna cena)

    public void stampaRacuna(double tezina, String mernaJedinica) {
        System.out.println("Sifra:" + this.proizvod.getSifra() + " - " + this.proizvod.getNaziv());
        if (mernaJedinica.equals("lb")) {
            System.out.println(this.proizvod.cenaPOLb() + "-" + this.mernaJedinica
                    + " x " + tezina);
            System.out.println("ukupno: " + cenaProizvoda(mernaJedinica, tezina));
        } else {
            System.out.println(this.proizvod.getCenaKg() + "-" + this.mernaJedinica
                    + " x " + tezina);
            System.out.println("ukupno: " + cenaProizvoda(mernaJedinica, tezina));
        }


    }
}