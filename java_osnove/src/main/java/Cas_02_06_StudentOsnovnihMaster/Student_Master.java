package Cas_02_06_StudentOsnovnihMaster;

public class Student_Master extends Student {

    public Student_Master(String imeIPrezime, int brojIndexa, int godinaStudija) {
        super(imeIPrezime, brojIndexa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean daLiJeStudentNaBudzetu() {
        if (this.godinaStudija<2)
        {return true;}
        return false;
    }
    //
//    Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//    koja za cenu skolarine vraca 100000
//    za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija



}
