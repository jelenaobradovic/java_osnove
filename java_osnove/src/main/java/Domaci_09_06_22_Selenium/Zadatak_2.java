package Domaci_09_06_22_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "java_osnove/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Napisati program koji vrsi dodavanje 5 reda u tabelu.
        //Maksimizirati prozor
        //Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php
        //Dodati 5 redova sa istim podacima.Jedan red u jednoj iteraciji
        //Klik na dugme Add New
        //Unesite name,departmant i phone (uvek iste vrednost)
        //Trazenje po name atributu
        //Kliknite na zeleno Add dugme.
        //PAZNJA: Pogledajte strukturu stranice i videcete da se u svakom redu
        // poslednje kolone javljaju dugmici edit, add, delete ali zbog prirode
        // reda neki dugmici se vide a neki ne.
        //Morate da dohvatite uvek Add dugme iz poslednjeg reda tabele. Mozete
        // koristeci index iz petlje, a mozete koristeci i last() fukncionalnost
        // za xpath. Koristan link last mehnizma
        //Cekanje od 0.5s
        //Na kraju programa ugasite pretrazivac.

        String url = "https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php";
        driver.manage().window().maximize();
        driver.navigate().to(url);

        for (int i = 0; i <5 ; i++) {

            //driver.findElement(By.xpath("button[@class='btn btn-info add-new')]")).click();
            driver.findElement(By.xpath("//div[@class='col-sm-4']/button")).click();
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Jelena");
            driver.findElement(By.name("department")).sendKeys("Pharmacy");
            driver.findElement(By.name("phone")).sendKeys("065222222");
            //driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Pharmacy");
            //driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("065222222");
            driver.findElements(By.xpath("//a[@class = 'add']")).get(3 + i).click();
            Thread.sleep(500);
        }

        driver.quit();
    }
}