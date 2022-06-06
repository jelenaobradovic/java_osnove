package Slack_URL;

import java.util.ArrayList;

public class URLBuilder {

    //Kreirati klasu UrlBuilder koja ima:
    //baseUrl
    //niz key value parova
    //Konstuktor koji setuje baseUrl
    //getter za baseUrl

        private String baseURL;
        private ArrayList <KeyValue> nizKeyValueParova=new ArrayList<>();

    public URLBuilder() {
        this.baseURL = "http://www.example.com/somepage/index.html";
    }

    public String getBaseURL() {
        return baseURL;
    }
//metodu za dodavanje key value para

    public void dodajKeyValuePar (KeyValue par)
    {nizKeyValueParova.add(par);}


    //metodu za brisanje key value para, metoda kao parametar key vrednost po kojoj se
    // izvrsi pretraga u nizu i izbaci par koji ima prosledjen key


    public void brisanjeKeyvaluepara(String key)
    {
        for (int i = 0; i < nizKeyValueParova.size(); i++) {
            if (this.nizKeyValueParova.get(i).generateParamString().contains(key)
            ) {
            this.nizKeyValueParova.remove(i);}
            }

        }


    //metodu za generianje linka. Metoda generise String i vraca ga u formatu:
    //baseUrl?key1=value1&key2=value2
    //Ukoliko UrlBuilder nema nijedan par, metoda vraca samo baseUrl (bez ?)

public void stampaj () {
    System.out.print(this.baseURL);
    if (this.nizKeyValueParova.size() > 0) {
        System.out.print("?");
        for (int i = 0; i < nizKeyValueParova.size(); i++) {


            System.out.print(this.nizKeyValueParova.get(i).generateParamString());
        }
    }
}}
