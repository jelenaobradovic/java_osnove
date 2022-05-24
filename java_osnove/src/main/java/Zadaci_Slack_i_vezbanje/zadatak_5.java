package Zadaci_Slack_i_vezbanje;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class zadatak_5 {
    //Napisati program koji simulira
    // iscrtavanje bookmarkova u Google Chrome-u prilikom
    // resajzovanja aplikacije. (Pogledaj video)
    //Koliko ce se bookmarkova iscrtati zavisi od sirine pretrazivaca.
    //Sirina jednog bookmarka je broj karaktera u nazivu bookmarka.
    //Izmedju svaka dva bookmarka postoji razmak od 5 karaktera.
    //Sirina svih bookmarkova ne sme da predje sirinu pretrazivaca,
    // racunajuci i razmake izmedju bookmarkova
    //Niz bookmarkova na pocetku programa definisati fiksno
    // (ne unosi ih korisnik) a zatim iscrtati bookmarkove
    // na stranici u zavisnosti od sirine pretrazivaca.
    //Primer izvrsenja 1:
    //Unesite sirinu pretrazivaca:100
    //Apps     YouTube     Google     Gmail     Miro | Online Whiteboard for Visual Collaboration
    //Primer izvrsenja 2:
    //Unesite sirinu pretrazivaca:90
    //Apps     YouTube     Google     Gmail
    //Primer izvrsenja 3:
    //Unesite sirinu pretrazivaca:800
    //Apps     YouTube     Google     Gmail     Miro | Online Whiteboard for Visual Collaboration     Confluence     JIRA     Bitbucket     Google Calendar     Timesheet     Google Drive     IX CIKLUS

    public static void main(String[] args) {
        ArrayList<String> bookmarks = new ArrayList<>();
        bookmarks.add("Apps");
        bookmarks.add("YouTube");
        bookmarks.add("Google");
        bookmarks.add("Gmail");
        bookmarks.add("Miro | Online Whiteboard for Visual Collaboration");
        bookmarks.add("Confluence");
        bookmarks.add("JIRA");
        bookmarks.add("Bitbucket");
        bookmarks.add("Google Calendar");
        bookmarks.add("Timesheet");
        bookmarks.add("Google Drive");
        bookmarks.add("IX CIKLUS");
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite sirinu pretrazivaca:");
        int sirina = s.nextInt();
        int ukupno =0;
        int i = 0;
        boolean stampa= true;
        while (stampa==true)
        {String bookmark= bookmarks.get(i);

            ukupno=ukupno + 5+ bookmark.length();
            i++;
            if (ukupno < sirina){System.out.println(bookmark);}
            else{stampa=false;}
        }




}}
