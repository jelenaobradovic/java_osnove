package Domaci_20_05;

public class FacebookPostMain {
    public static void main(String[] args) {

        FacebookPost pozdrav = new FacebookPost();
        pozdrav.imeIPrezimeKoPostuje = "Jelena Obradovic";
        pozdrav.imeIPrezimeKomeJePOstovano= "Nenad Obradovic";
        pozdrav.tekstObjave= "Dobro dosao na Facebook";
        pozdrav.brojDeljenja= 2;
        pozdrav.brojLajkova=20;


        pozdrav.like();
        System.out.println(pozdrav.brojLajkova);
        pozdrav.dislike();
        System.out.println(pozdrav.brojLajkova);
        pozdrav.share();
        System.out.println(pozdrav.brojDeljenja);
        pozdrav.print();

        System.out.println();

        FacebookPost rodjendan = new FacebookPost();
        rodjendan.imeIPrezimeKoPostuje = "Jelena Obradovic";
        rodjendan.imeIPrezimeKomeJePOstovano= "Nenad Obradovic";
        rodjendan.tekstObjave= "Srecan rodjendan!!!";
        rodjendan.brojDeljenja= 4;
        rodjendan.brojLajkova=45;


        rodjendan.like();
        System.out.println(rodjendan.brojLajkova);
        rodjendan.dislike();
        System.out.println(rodjendan.brojLajkova);
        rodjendan.share();
        System.out.println(rodjendan.brojDeljenja);
        rodjendan.print();


    }
}
