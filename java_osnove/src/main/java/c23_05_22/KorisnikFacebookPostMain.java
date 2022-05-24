package c23_05_22;

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
