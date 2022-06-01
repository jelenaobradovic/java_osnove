package Cas_30_05_22;

import java.util.ArrayList;

public class TableHeader {
    //Kreirati klasu TableHeader koja ima:
    //niz celija u headeru tabele.
    // Niz je niz stringova
    //metodu addHeaderCell, koja dodaje polje u niz
    //metodu za stampu koja stampa celije kao u primeru:
    //celija1\t\t|\t\tcelija2\t\t|\t\tcelija3\t\t|    (itd)
    //(Objasnjenje \t je specijalan karakter tab koji ce da sluzi da lakse poravnate kolone)
    //metodu printHTML, koja sluzi da stampa header u HTML formatu.
    //header se stampa izmedju <tr></tr>, a svaka celija mora da se nelazi u <th></th>
    //primer:
    //<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
    private ArrayList<String> nizCelijaHeader = new ArrayList<>();

    public void addheaderCell(String poljeHeader) {
        nizCelijaHeader.add(poljeHeader);
    }

    public ArrayList<String> getNizCelijaHeader() {
        return nizCelijaHeader;
    }




    public void printHeader() {
        for (int i = 0; i < this.nizCelijaHeader.size(); i++) {
            System.out.print(this.nizCelijaHeader.get(i) + "/t/t|/t");

        }
        System.out.println();
    }


    public void printHTML() {
        System.out.print("<tr>");
        for (int i = 0; i < this.nizCelijaHeader.size(); i++) {

            System.out.print("<th>" + this.nizCelijaHeader.get(i) + "</th>");
        }
        System.out.println("</tr>");
        System.out.println();
    }
}
