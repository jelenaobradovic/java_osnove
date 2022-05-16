package c16_05_22_metode;

public class zadatak_8 {
    public static void main(String[] args) {
        //8. Zadatak
        //Napisati metodu koja proverava da li je
        // trougao pravougli. Metoda prima stranice trougla
        // i hipotenuzu trougla. Ako je trougao pravougli onda
        // vraca true, u suptrotnom vraca false.
        //Trougao je pravougli ukoliko je a*a+b*b=c*c

        int a = 6;
        int b = 3;
        int c = 7;
        if (daLIJePravougli(a,b,c)== true) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }
    }


    static boolean daLIJePravougli(int x, int y, int z) {
        if (x * x + z * z == z * z) {
            boolean trougao = true;
            return trougao;
        } else {
            boolean trougao = false;
            return trougao;
        }
    }
}