package Cas_30_05_22;

import java.util.ArrayList;

public class Table {
    //Kreirati klasu Table koja ima:
    //header tabele
    //niz redova. Niz je niz TableRow elementa
    //setter za header
    //metodu za dodvanje novog reda u tablu
    //metodu za stampu koja stampa header i redove tabele


    private TableHeader headerTable;
    private ArrayList<TableRow> nizRedova = new ArrayList<>();


    public void setHeaderTable(TableHeader headerTable) {
        this.headerTable = headerTable;
    }

    public void dodavanjeReda(TableRow red) {
        this.nizRedova.add(red);
    }

    public void stampaHeaderaIRedova() {
        this.headerTable.printHeader();
        for (int i = 0; i < this.nizRedova.size(); i++) {
            nizRedova.get(i).stampa();
        }
    }

    //metodu za stampu HTML-a tabele.Primer
    //<table>
    //<thead>
    //<tr><th>First Name</th><th>Last Name</th><th>Age</th></tr>
    //</thead>
    //<tbody>
    //<tr><td>Milan</td><td>Jovanovic</td><td>27</td></td>
    //<tr><td>Petar</td><td>Petrovic</td><td>29</td></td>
    //<tr><td>Darko</td><td>Darkovic</td><td>30</td></td>
    //</tbody>
    //</table>


}



