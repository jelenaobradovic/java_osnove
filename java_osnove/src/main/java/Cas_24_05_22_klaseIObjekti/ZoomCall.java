package Cas_24_05_22_klaseIObjekti;

public class ZoomCall {
    //Kreirati klasu ZoomCall koja ima:
    //link za poziv
    //password
    //korisnika koji je host
    //korisnika koji je guest
    //gettere za sve atribute
    //setter samo za guest-a


    private String url;
    private String password;
    private Korisnik guest;
    private Korisnik host;

    public ZoomCall(String linkPoziva, String password, Korisnik guest, Korisnik host) {
        this.url = linkPoziva;
        this.password = password;
        this.guest = guest;
        this.host = host;
    }

    public ZoomCall() {
    }

    public String getLinkPoziva() {
        return url;
    }


    public String getPassword() {
        return password;
    }


    public Korisnik getGuest() {
        return guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public Korisnik getHost() {
        return host;
    }

    //metodu pokreni poziv koja stampa podatke u formatu:
    //		Zoom Call: url
    //		Password: password
    //		Host: ime i prezime
    //		Guest: ime i prezime
    //		Maksimalno trajanje poziva je (broj minuta)min
    //
    //		Maksimalno trajanje poziva se cita od korisnika koji je host!

    public void pokreniPoziv ()
    {
        System.out.println("Zoom call: " + url);
        System.out.println("Password: " + password);
        System.out.println("Host: " + this.host.getImeIPrezime());
        System.out.println("Guest: "+ this.guest.getImeIPrezime());
        System.out.println("Maksimalno trajanje poziva je: "+ this.host.trajanjePoziva());
    }
}
