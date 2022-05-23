package Domaci_18_05_22;

public class SmartAirConditioningMain {
    public static void main(String[] args) {


        SmartAirConditioning samsung = new SmartAirConditioning();
        samsung.marka="Samsung";
        samsung.temperatura= 21;
        samsung.mode="hladi";


        samsung.stampa();

        SmartAirConditioning lg = new SmartAirConditioning();

        lg.marka= "LG";
        lg.temperatura=28;
        lg.mode="greje";

        lg.stampa();
    }
}
