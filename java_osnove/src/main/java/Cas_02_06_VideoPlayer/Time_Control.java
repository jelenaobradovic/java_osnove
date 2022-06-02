package Cas_02_06_VideoPlayer;

public class Time_Control extends Control {

    //Kreirati klasu TimeControl koja nasledjuje klasu Control i
    //konstruktore

    //ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)

    private boolean vremeVideaPlus;

    public Time_Control(boolean vremeVideaPlus) {
        this.vremeVideaPlus = vremeVideaPlus;
    }

    //implementira metodu izvrsi akciju tako sto pomeri trenutno
    // vreme videa za 15s unapred ili unazad u zavisnosti od atributa.
    // Veoma je bitno da se ne izadje van granica videa.

    @Override
    public void izvrsiAkciju(VideoPlayer vp) {
        if (this.vremeVideaPlus) {
            if (vp.getTrenutnoVremeVidea() + 15 < vp.getDuzinaVidea()) {
                vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea() + 15);
            } else {
                vp.setTrenutnoVremeVidea(vp.getDuzinaVidea());
            }
        } else if (vp.getTrenutnoVremeVidea() - 15 > 0) {
            vp.setTrenutnoVremeVidea(vp.getTrenutnoVremeVidea() - 15);

        }
        vp.setTrenutnoVremeVidea(0);
    }
}
