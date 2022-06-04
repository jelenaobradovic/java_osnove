package Makao;

public class Makao {
    //Kreirati klasu Makao koja ima:
    //spil karata - objekat SPIL !!
    //niz igraca za stolom (Uvek igramo sa 4 igraca da bude jednostavnije)
    //niz odigranih karata.
    //indeks igraca koji je na redu da igra. Indeks varira od 0 do 3) i
    // u startu je 0 tj. kada se napravi objekat Sto treba da igra igrac na poziciji 0.
    //konstuktor koji postavlja spil karata
    //metodu pristupi stolu - metodi se prosledjuje igrac i dodaje se u niz igraca
    //metodu podeli karte koja za svakog igraca iz spila izvlaci pod 6 random
    // (mozete 3 pa jos 3, svejedno je) karata i dodeljuje ih igracima.
    //metodu sledeci koja pomera indeks na sledeceg igraca
    //metodu koja stampa trenutno stanje na stolu.Igrace sa kartama i trenutnu
    // kartu na stolu. Igrac koji je na redu da igra uokvirite zvedicama i tackicama.
    // Npr ako je Sima na redu, print je
    //----------------------------------------------------------------------------------------------------
    //Milan Jovanovic
    //[ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]
    //
    //Petar Petrovic
    //[ A <3 ] [ 4 /\ ] [ 3 <> ]
    //
    //………………………………………………………………………..
    //Sima Simic
    //[ Q <3 ] [ 7 /\ ] [ 6 <> ]
    //***********************************************************************
    //
    //Darko Petovic
    //[ 9 <3 ] [ 8 <3 ]
    //
    //Zadnja karta na stolu je [ 3 *** ]
    //-----------------------------------------------------------------------------------------------------
    //
    //
    //metodu za kraj igre. Metoda vraca boolean, true ako postoji neki igrac sa bez
    // ijedne karte u suprotnom vraca false.
    //metoda koja vraca pobednika igre. Metoda vraca igraca (objekat) koji kod sebe nema nijednu kartu.
    //metodu izvuciKartu. Simuliramo situaciju kada igrac nema sta da odigra, pa mora da
    // izvuce novu kartu. Metoda iz spila izvlaci kartu i dodaje je igracu koji je na redu da igra.
    //metoda odigraj kartu:
    //od parametara prima broj i znak karte. Npr: makao.odigraj(11, “srce”)
    //potrebna je prover da li igrac, koji je na redu da igra, ima tu kartu kod sebe.
    // Ako je nema ispisati gresku!
    //potrebna je provera da li je moguce odgirati tu kartu. Da li je moguce postaviti
    // tu kartu preko one koja je zadnja odigrana. Ako nije moguce ispisati gresku.
    //[Ako je moguce odigrati tu kartu i igrac koji je na redu ima tu kartu] onda tu
    // kartu izvucete od igraca (imate metodu odigraj koja i izbaci to iz niza karata
    // koji ima igrac) i postavite je u niz odigranih karata.
    //Zatim potrebno je izvrsiti igru po pravilima. Ako je odigrana karta:
    //7 - onda sledecem igracu dodate 2 karte i taj igrac je sledeci na redu.
    //8 - preskacete sledeceg igraca
    //A - mora da poklopi kec. Tada ne prelazimo na sledec igraca, nego fokus ostaje na istog.
    //2 detelina - prethodnom igracu dodelite 4 karte iz spila i prelazite na sledeceg..
    //metodu preseci spil koja iz spila izvlaci jednu kartu i postavlja je na nulto mesto u niz odigranih.
}
