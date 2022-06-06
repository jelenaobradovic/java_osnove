package Slack_URL;

public class KeyValue {
    //Kreirati klasu KeyValuePair koja ima:
    //key - string
    //value - string
    //Konstuktor sa parametrima
    //Defaultni konstuktor


    private String key;
    private String value;

    public KeyValue() {
    }

    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
//Metodu generateParamString koja generise i vraca String u formatu (OVA METODA NE STAMPA)
    //key=value

    public String generateParamString ()
    {return this.key.concat("="+this.value);}
}
