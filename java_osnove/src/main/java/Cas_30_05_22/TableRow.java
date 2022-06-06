package Cas_30_05_22;

import java.util.ArrayList;

public class TableRow {
    //Kreirati klasu TableRow koja ima:
    //niz celija u telu tabele. Niz je niz stringova

    private ArrayList<String> nizCelijaRed = new ArrayList<>();

    //metodu addRowCell, koja dodaje polje u niz

    public void dodajCelijuURed(String celijaRed) {
        this.nizCelijaRed.add(celijaRed);
    }


    //metodu za stampu koja stampa celije kao u primeru:
    //celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)

    //metodu printHTML, koja sluzi da stampa red u HTML formatu.
    //red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
    //primer:
    //<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>


    public void stampa() {
        for (int i = 0; i < this.nizCelijaRed.size(); i++) {
            System.out.print(this.nizCelijaRed.get(i) + "//t//t|//t//");
        }
        System.out.println();
    }

    public void stampaHTMLRow() {
        System.out.println("<tr>");
        for (int i = 0; i < this.nizCelijaRed.size(); i++) {
            System.out.println("<td>" + this.nizCelijaRed.get(i) + "</td>");

        }
        System.out.println("</tr>");
        System.out.println();
    }
}
