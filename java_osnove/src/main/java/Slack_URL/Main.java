package Slack_URL;

public class Main {
    public static void main(String[] args) {
        ////U mainu kreirati url
        //    //http://www.example.com/somepage/index.html?fullName=Milan&lastName=Jovanovic&age=27
        //    //Naravno probajte i brisanje :smile: (edited)

        KeyValue first = new KeyValue("key1","value1");
        KeyValue second = new KeyValue("key2", "key2");

        KeyValue milan = new KeyValue("fullName", "Milan");
        KeyValue age = new KeyValue("age", "27");

        URLBuilder example = new URLBuilder();
        example.dodajKeyValuePar(first);
        example.dodajKeyValuePar(second);
        example.dodajKeyValuePar(milan);
        example.dodajKeyValuePar(age);

        example.stampaj();
    }
}
