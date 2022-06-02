package Cas_02_06_StudentOsnovnihMaster;

public abstract class Student {
    //  Kreirati apstraktnu klasu Student koja ima:
    //ime i prezime studenta
    //broj indeksa
    //godinu studija

    protected String imeIPrezime;
    protected int brojIndexa;
    protected int godinaStudija;


    //gettere, settere i konstruktore

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public Student() {
    }

    public Student(String imeIPrezime, int brojIndexa, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndexa = brojIndexa;
        this.godinaStudija = godinaStudija;
    }

    //apstraktnu metodu koja vraca cenu skolarine.

    public abstract int cenaSkolarine();

    //apstraktnu metodu koja vraca da li je student na buzetu ili ne.

    public abstract boolean daLiJeStudentNaBudzetu ();


    //metodu koja stampa podatke u formatu:
    //ime i prezime, broj indeksa, godina studija
    //Finansiranje: budzet/samofinansirajuci
    //Cena skolarine: cena

    public void stampaj ()
    {
        System.out.println("Ime i prezime: "+ this.imeIPrezime);
        System.out.println("Broj indexa: "+ this.brojIndexa);
        System.out.println("Godina studija: "+ this.godinaStudija);
        System.out.println("Finansiranje:");
        if (daLiJeStudentNaBudzetu())
        {
            System.out.println("budyet");
        }
        else {
        System.out.println("samofinansiranje");
    }
    }


}
