package Domaci_02_06_22_Sektor;

public class Menadzer extends Radnik{
    //Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
    // override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.



    @Override
    public double plataRadnika() {
        double suma=0;
        for (int i = 0; i < this.nizSektora.size() ; i++) {

            suma = suma+ this.nizSektora.get(i).getPlata();

        }
        return suma;
    }


}
