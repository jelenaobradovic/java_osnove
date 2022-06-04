package Cas_03_06_Atleticar;

public class Skakac extends Atleticar {

  //Kreirati i klase Trkac i Skakac izvedene iz
  //klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
  public Skakac() {
  }

  public Skakac (String imeIPrezime, double rezultat) {
    super(imeIPrezime, rezultat);
  }

  @Override
  public boolean daLiJeRezultatBolji(Atleticar a) {
    if (this.rezultat > a.rezultat) {
      return true;
    } else {
      return false;
    }
  }
}



