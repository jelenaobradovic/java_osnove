package Cas_02_06_VideoPlayer;

public class VideoPlayer {
    //Kreirati klasu VideoPlayer koja ima:
    //duzinu videa
    //trenutno vreme videa
    //jacinu zvuka
    //Kvalitet videa (144, 240, 360, 480, 720, 1080)

    private double duzinaVidea;
    private double trenutnoVremeVidea;
    private int jacinaZvuka;
    private String kvalitetVidea;

    //gettere, settere i konstruktore


    public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, int jacinaZvuka, String kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public double getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public String getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(String kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }


    //metodu stampaj koja stampa podatke u formatu:
    //trenutno vreme videa
    //jacina zvuka
    //kavlitet videa

    public void stampaj()
    {
        System.out.println("Trenutno vreme:"+ this.trenutnoVremeVidea);
        System.out.println("Jacina zvuka: "+ this.jacinaZvuka);
        System.out.println("Kvalitet videa: " +this.kvalitetVidea);

    }


}
