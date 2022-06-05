package Domaci_03_06_Ambalaza;

import java.util.ArrayList;

public class Korpa {
    //Kreirati klasu Korpa koja ima:
    //niz ambalaza

    private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<>();

    //metodu dodaj ambalazu

    public void dodajAmbalazu(Ambalaza a) {
        this.nizAmbalaza.add(a);
    }


    //metodu izbaci ambalazu, u funkciju se prosledjuje
    // barkod flase (String) koju treba izbaciti


    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            if (this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
                this.nizAmbalaza.remove(i);
            }

        }
    }
    //privatnu metodu koja vraca cenu svih ambalaza sa
    // popustom, metoda kao parametar prima popust.

    private double cenaSvihAmbalaza(double popust) {
        double suma = 0;
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            suma += this.nizAmbalaza.get(i).cenaArtikla();
        }
        return suma - popust;
    }

    //metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
    // kao parametar funkcije se prima Super karticu iz koje se cita popust.
    //

    public double cenaKorpe(SuperKartica superKartica) {
      return  cenaSvihAmbalaza(superKartica.getPopust());


    }

}
