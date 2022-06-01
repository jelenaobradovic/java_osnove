package Cas_30_05_22;

public class InstagramUser {
    //Kreirati klasu InstagramUser koja ima:
    //username
    //Ime i prezime
    //email
    //Sve sto vam dalje zatreba dopunite klasu.

    private String userName;
    private String imeIPrezime;
    private String email;

    public InstagramUser(String userName, String imeIPrezime, String email) {
        this.userName = userName;
        this.imeIPrezime = imeIPrezime;
        this.email = email;
    }

    public InstagramUser() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
