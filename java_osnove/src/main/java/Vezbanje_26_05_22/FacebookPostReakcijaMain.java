package Vezbanje_26_05_22;

public class FacebookPostReakcijaMain {
    public static void main(String[] args) {

        Reakcija reakcija1 = new Reakcija("srce", "Pera Peric");
        Reakcija reakcija2 = new Reakcija("lajk", "Pera Peric");
        Reakcija reakcija3 = new Reakcija("lajk","Jova Jovanovic");
        Reakcija reakcija4 = new Reakcija("smajli","Pera Peric");
        Reakcija reakcija5 = new Reakcija("srce","Ana Petrovic");


        FacebookPost srecanRodjendan = new FacebookPost("Pera Jovanovic", "Srecan rodjendan!");
        srecanRodjendan.dodajreakciju(reakcija1);
        srecanRodjendan.dodajIliPromeniReakciju(reakcija3);
        srecanRodjendan.dodajIliPromeniReakciju(reakcija5);

        FacebookPost saljemPozdrave = new FacebookPost("Ana Niketic", "Pozdrav sa putovanja.");
        saljemPozdrave.dodajreakciju(reakcija1);
        saljemPozdrave.dodajIliPromeniReakciju(reakcija3);
        saljemPozdrave.dodajIliPromeniReakciju(reakcija2);
        saljemPozdrave.dodajIliPromeniReakciju(reakcija4);



        saljemPozdrave.stampa();
    }
}
