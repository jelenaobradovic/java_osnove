package Cas_23_05_22_klaseIObjekti;

public class KorisnikFacebookPostMain {
    public static void main(String[] args) {

        Korisnik autor = new Korisnik();

        autor.setIme("JOvan");
        autor.setPrezime("Jovanovic");


        FacebookPost rodjendan = new FacebookPost();
        rodjendan.setOpis("Srecan rodjendan");
        rodjendan.stampa();
    }
}
