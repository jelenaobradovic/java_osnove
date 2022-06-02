package Cas_30_05_22;

public class TableMain {
    public static void main(String[] args) {
        //U mainu kreirati jednu tabelu sa 3x3 (3 kolone i 3 reda)
        // i odstampajte je obicno i u html-u.


        TableHeader headerTabela1 = new TableHeader();
        headerTabela1.addheaderCell("Ime");
        headerTabela1.addheaderCell("Prezime");
        headerTabela1.addheaderCell("e-mail");

        TableRow red1Tabela1 = new TableRow();
        red1Tabela1.dodajCelijuURed("Jovana");
        red1Tabela1.dodajCelijuURed("Petrovic");
        red1Tabela1.dodajCelijuURed("jpetrovic@gmail.com");

        TableRow red2Tabela1 = new TableRow();
        red2Tabela1.dodajCelijuURed("Jovan");
        red2Tabela1.dodajCelijuURed("Jovanovic");
        red2Tabela1.dodajCelijuURed("jjovanovic@gmail.com");


//
//        Table tabela1 = new Table(headerTabela1);
//        tabela1.dodavanjeReda(red1Tabela1);
//        tabela1.dodavanjeReda(red2Tabela1);
//
//
//        tabela1.stampaHeaderaIRedova();
    }
}
