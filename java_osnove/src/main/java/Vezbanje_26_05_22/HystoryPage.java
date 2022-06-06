package Vezbanje_26_05_22;

public class HystoryPage {
    //Za potrebe google istorije potrebno je kreirati sledece klase.
    //Klasu HistoryPage koja ima:
    //naziv stranice
    //link do stranice
    //vreme otvaranja stranice - sat i minut (2 atributa)
    //username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)

    private String nazivStranice;
    private String linkDoStranice;
    private int vremeOtvaranjaSat;
    private int vremeOtvaranjaMin;
    private String username;
    private String password;

    //konstuktore koji su logicni

    public HystoryPage() {
    }

    public HystoryPage(String nazivStranice, String linkDoStranice, int vremeOtvaranjaSat,
                       int vremeOtvaranjaMin, String username, String password) {
        this.nazivStranice = nazivStranice;
        this.linkDoStranice = linkDoStranice;
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
        this.vremeOtvaranjaMin = vremeOtvaranjaMin;
        this.username = username;
        this.password = password;
    }
//gettere i setter (username i password nemaju settere)

    public String getNazivStranice() {
        return nazivStranice;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public String getLinkDoStranice() {
        return linkDoStranice;
    }

    public void setLinkDoStranice(String linkDoStranice) {
        this.linkDoStranice = linkDoStranice;
    }

    public int getVremeOtvaranjaSat() {
        return vremeOtvaranjaSat;
    }

    public void setVremeOtvaranjaSat(int vremeOtvaranjaSat) {
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
    }

    public int getVremeOtvaranjaMin() {
        return vremeOtvaranjaMin;
    }

    public void setVremeOtvaranjaMin(int vremeOtvaranjaMin) {
        this.vremeOtvaranjaMin = vremeOtvaranjaMin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    //metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre
    // prima username i password i setuje te atribute.

    public void sacuvajKredencijale (String password, String username)
    {this.password=password;
    this.username=username;}


    //Metoda obrisi kolacice koja setuje username i password na null.

    public void obrisiKolaciceHP ()
    {this.password=null;
    this.username=null;}


    //Metoda stampaj koja stampa podatke u formatu:
    //[datum] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]

    public void stampa ()

    {
        System.out.println(this.vremeOtvaranjaSat + " : " + this.vremeOtvaranjaMin + " - "
                + this.nazivStranice + " - " + this.linkDoStranice);
        {
            if (this.getUsername() != null) {
                System.out.println("****");
            }


        }}}

