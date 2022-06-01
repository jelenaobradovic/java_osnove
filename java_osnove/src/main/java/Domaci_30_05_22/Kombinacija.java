//package Domaci_30_05_22;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Kombinacija {
//    //Kreirati klasu Kombinacija koja ima:
//    //id kombinacije (String)
//    //niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//
//    private String idKombinacije;
//    private ArrayList<Integer> kombinacija=new ArrayList<>();
//
//    //konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//
//    public Kombinacija() {
//    }
//
//    public Kombinacija(String idKombinacije, int prviBroj, int drugiBroj, int treciBroj, int cetvrtiBroj,
//                       int petiBroj, int sestiBroj, int sedmiBroj) {
//        this.idKombinacije = idKombinacije;
//
//       this. kombinacija=new ArrayList<>();
//        kombinacija.add(prviBroj);
//        kombinacija.add(drugiBroj);
//        kombinacija.add(treciBroj);
//        kombinacija.add(cetvrtiBroj);
//        kombinacija.add(petiBroj);
//        kombinacija.add(sestiBroj);
//        kombinacija.add(sedmiBroj);
//    }
//    //gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//
//    public String getIdKombinacije() {
//        return idKombinacije;
//    }
//
//    public ArrayList<Integer> getKombinacija() {
//        return kombinacija;
//    }
//
//
//    //metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//    //Zaglavlje metode je:
//    //public boolean daLiJeIstaKombinacija( Kombinacija k)
//    //metoda vraca true ako su svi elementi na istim pozicija isti
//    //npr: this [0] == k [0], this [1] == k [1] ….
//
//    public boolean daliJeIstaKombinacija(Kombinacija dobitnaKombinacija) {
//
//
//        Collections.sort(dobitnaKombinacija);
//        Collections.sort(kombinacija);
//
//        for (int i = 0; i < this.kombinacija.size(); i++) {
//
//            if (this.kombinacija.get(i) == dobitnaKombinacija.getKombinacija().get(i))
//                return true;
//
//
//        }
//        return false;
//    }
//
//
//    //metodu za stampu koja stampa podatke u formatu
//    //ID: id kombinacije
//    //brojevi: 1, 3, 5, 14, 15, 21, 23





