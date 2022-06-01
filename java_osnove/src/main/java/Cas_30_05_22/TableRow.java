package Cas_30_05_22;

import java.util.ArrayList;

public class TableRow {
    //Kreirati klasu TableRow koja ima:
    //niz celija u telu tabele. Niz je niz stringova
    //metodu addRowCell, koja dodaje polje u niz
    //metodu za stampu koja stampa celije kao u primeru:
    //celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
    //metodu printHTML, koja sluzi da stampa red u HTML formatu.
    //red se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <td></td>
    //primer:
    //<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>

    public ArrayList <String> nizcelijaRow = new ArrayList<>();

    public void addRowCell (String celijaRed)
    {this.nizcelijaRow.add(celijaRed);}

    public ArrayList<String> getNizcelijaRow() {
        return nizcelijaRow;
    }

    public void setNizcelijaRow(ArrayList<String> nizcelijaRow) {
        this.nizcelijaRow = nizcelijaRow;
    }

    public void stampa ()
    {
        for (int i = 0; i < this.nizcelijaRow.size(); i++) {

            System.out.print( this.nizcelijaRow.get(i)+ " /t/t|/t/");

        }
        System.out.println();
    }

    public void stampaHTMLRow ()
    {
        System.out.println("<tr>");
        for (int i = 0; i < this.nizcelijaRow.size(); i++) {

            System.out.println("<td>"+ this.nizcelijaRow.get(i)+ "</td>");

        }
        System.out.println("</tr>");
        System.out.println();
    }
}
