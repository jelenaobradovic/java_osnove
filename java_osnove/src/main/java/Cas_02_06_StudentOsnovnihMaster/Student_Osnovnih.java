package Cas_02_06_StudentOsnovnihMaster;

public class Student_Osnovnih extends Student{


    public Student_Osnovnih(String imeIPrezime, int brojIndexa, int godinaStudija) {
        super(imeIPrezime, brojIndexa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean daLiJeStudentNaBudzetu() {
        if (this.godinaStudija<5)
        {return true;}
        return false;
    }


    //koja za cenu skolarine vraca 90000



    //za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija

    //stampajte podatke po izboru



}
