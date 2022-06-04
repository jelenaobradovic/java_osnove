package Cas_03_06_Atleticar;

import java.util.ArrayList;

public class Disciplina {

//Kreirati i klasu Disciplina čiji su privatni atributi:
//ime discipline
//tip discipline (Trkacka ili Skakacka)
//niz atletičara koji učestvuju u toj disciplini.

    private String imeDiscipline;
    private String tipDiscipline;
    private ArrayList<Atleticar> nizAtleticara = new ArrayList<>();

//    U javnom delu klase definisati:
//    konstuktore, gettere i settere
//    konstruktor koji postavlja ime discipline i tip

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public ArrayList<Atleticar> getNizAtleticara() {
        return nizAtleticara;
    }

    public void setNizAtleticara(ArrayList<Atleticar> nizAtleticara) {
        this.nizAtleticara = nizAtleticara;
    }

//    metodu dodaj atleticara u disciplinu

    public void dodajAtleticara(Atleticar a) {
        nizAtleticara.add(a);
    }


//    metodu diskvalifikuj atleticara iz discipline, za parametar funkcije
//    prima se ime i prezime atleticara

    public void diskvalifikujIgraca(String imeIprezime) {
        for (int i = 0; i < this.nizAtleticara.size(); i++) {
            if (this.nizAtleticara.get(i).getImeIPrezime().equals(imeIprezime)) {
                this.nizAtleticara.remove(i);
            }
        }
    }

//            (za vezbanje) privatnu metodu koja pronalazi i vraca atletircara
//    (ne ime i prezime) sa najboljim rezultatom

    private Atleticar najboljiRezultat ()
    {Atleticar najbolji = nizAtleticara.get(0);
        for (int i = 0; i < this.nizAtleticara.size(); i++) {
            if(this.nizAtleticara.get(i).daLiJeRezultatBolji(najbolji))

            {najbolji=this.nizAtleticara.get(i);}
        }

    return najbolji;
    }


// (za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.

public void najboljiUDisciplini ()
{najboljiRezultat().stampaj();}
}
