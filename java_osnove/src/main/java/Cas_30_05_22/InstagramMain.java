package Cas_30_05_22;

public class InstagramMain {
    public static void main(String[] args) {


        InstagramUser user1 = new InstagramUser("JovanJ","Jovan Jovanovic",
                "jjovanovic@gmail.com");
        InstagramUser user2 = new InstagramUser("Jana", "Jana Jovanovic",
                "janaj@gmail.com");
        InstagramUser user3 = new InstagramUser("Jox", "Jovana Jankovic",
                "jovanajank@gmail.com");

        InstagramTag tagUser1 = new InstagramTag(12, 16, "Ana Petrovic");
        InstagramTag tagUser2 = new InstagramTag(22,123,"Petar Petrovic");

        InstagramImage image1 = new InstagramImage("720x720", "afhgagf/jkahjkahg/jhakhja");
        InstagramImage nizTagova1 = new InstagramImage();
        nizTagova1.dodajTag(tagUser1);
        nizTagova1.dodajTag(tagUser2);

        InstagramPost post1 = new InstagramPost("Birthday party!");
        InstagramPost nizSlika1 = new InstagramPost();
        nizSlika1.dodajSliku(image1);
    }
}
