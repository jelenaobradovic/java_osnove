package Zadaci_Slack_i_vezbanje;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class zadatak_3 {

    //Aploadovanje fajla se ne desava iz jednog slanja,
    // vec se podaci salju u paketima
    //Program prilikom slanja paketa mora da prikaze napredak
    //Pre pocetka programa korisnik unosi velicinu fajla za upload,
    // velicina fajla je ukupan broj karaktera koji treba da se uploaduje
    //Zatim se unose paketi dok se ne dostigne velicina fajla.
    // Paket je bilo koji niz karaktera
    //Na kraju programa prikazati sadrzaj aploadovanog teksutualnog fajla
    //Napomena: Ako velicina paketa predje velicinu fajla, to je okey :wink:
    //
    // Velicina fajla: 80
    //Unesite sledeci paket: Krece
    //Upload 6%
    //Unesite sledeci paket: Upload
    //Upload 13%
    //Unesite sledeci paket: fajla
    //Upload 20%
    //Unesite sledeci paket: blblb
    //Upload 26%
    //Unesite sledeci paket: 23lnafo
    //Upload 35%
    //Unesite sledeci paket: kldslfjdsjdskjlsdjoij23ij23oj-0rf2
    //Upload 77%
    //Unesite sledeci paket: ksldjolds
    //Upload 88%
    //Unesite sledeci paket: sddsd
    //Upload 95%
    //Unesite sledeci paket: ew
    //Upload 97%
    //Unesite sledeci paket: 3
    //Upload 98%
    //Unesite sledeci paket: 1
    //Upload 100%
    //Fajl je aploadovan uspesno.
    //Sadrzaj fajla: KreceUploadfajlablblb23lnafokldslfjdsjdskjlsdjoij23ij23oj-0rf2ksldjoldssddsdew31

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite velicinu fajla:");
        int velicinaFajla= s.nextInt();
        int velicinaPaketa = 0;
        int progres = 0;
        System.out.println("Unesite paket(rec): ");
        String rec = s.next();
        String fajl=rec;

        while (progres<velicinaFajla)
        {
            System.out.println("Unesite paket(rec): ");
            rec = s.next();
            velicinaPaketa= rec.length();
            progres=progres+velicinaPaketa;
            fajl = fajl.concat(rec);


        }

        System.out.println(fajl);





    }}
