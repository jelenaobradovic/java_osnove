package Cas_03_06_Atleticar;

public class Main {
    public static void main(String[] args) {
//    U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim
//    brojem učesnika,  (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

        Disciplina skokUDalj = new Disciplina("Skok u dalj", "skakacka");
        Disciplina prepone110m = new Disciplina("110m s preponama", "trkacka");

        skokUDalj.dodajAtleticara(new Skakac("JovanJovanovic", 6.2));
        skokUDalj.dodajAtleticara(new Skakac("Pera Peric", 5.8));

        // 2.nacin

        Trkac t1 = new Trkac("Ana Petrovic", 12.3);
        Trkac t2 = new Trkac("jovana Nikolic", 13.2);

        prepone110m.dodajAtleticara(t1);
        prepone110m.dodajAtleticara(t2);

        prepone110m.najboljiUDisciplini();
        System.out.println();
        skokUDalj.najboljiUDisciplini();
        System.out.println();

        t1.stampaj();

    }}
