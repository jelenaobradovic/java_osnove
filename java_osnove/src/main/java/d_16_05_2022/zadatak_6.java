package d_16_05_2022;

public class zadatak_6 {
    public static void main(String[] args) {
        //(Za vezbanje)Napisati funkciju koja za tri
        // prosledjena broja vraca najmanji od ta 3.
        // U glavnom programu iskoristi funkciju i
        // ispisti odgovarajucu poruku.

        int x = 66;
        int y = 200;
        int z = 25;

        System.out.println("Najmanji od 3 uneta broja je: " + najmanjiBroj(x, y, z));
    }

    static Integer najmanjiBroj(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }


}
