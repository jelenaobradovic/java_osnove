package Domaci_09_06_22_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "java_osnove/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Maksimizirati prozor
        //Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
        //Dohvatite dugmice za rejting kao listu. XPath za trazenje
        // treba da bude preko id atributa i za ovo trebace vam contains u xpath-u
        //Od korisnika ucitati broj (preko scannera) na koju zvezdicu
        // je potrebno kliknuti (u rasponu od 1 do 5)
        //I izvrsite akciju klik na odgovarajuci element preko indeksa
        //Na kraju programa ugasite pretrazivac.

        String url="https://s.bootsnipp.com/iframe/WaXlr";

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj od 1-5: ");
        int x = s.nextInt();

        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://s.bootsnipp.com/iframe/WaXlr");

        List<WebElement> niz =
                driver.findElements(By.xpath("//button[contains (@id,'rating-star-')]"));



        niz.get(x-1).click();
        Thread.sleep(3000);
        driver.quit();

    }}
