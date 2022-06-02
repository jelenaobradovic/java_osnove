package Cas_31_05_Kartica_master_visa;

public class KarticaMain {
    public static void main(String[] args) {

        Master_kartica mk1 = new Master_kartica(12000, "235-23568-56", 2023, 12);
        Visa_kartica vk1 = new Visa_kartica (20000, "124565",2024,
                2, "ana Petrovic");

        mk1.stampaj();
        mk1.izvrsiTransakciju(2000);
        mk1.stampaj();
    }
}
