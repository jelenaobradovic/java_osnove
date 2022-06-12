package Cas_10_06_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Zadatak_3 {
    public static void main(String[] args) throws InterruptedException {


//Napisati program koji:
//Ucitava stranicu  https://www.ebay.com/
//Zatim iz selekta za kategoriju povlaci sve opcije. Koristan link
//Zatim bira random element iz niza opcija koristeci Random.
// Vodite racuna da random element bude u opsegu broja elemenata niza. Random podsetnik
//Selektuje random kategoriju izabranu u koraku iznad
//Zatvara pretrazivac

     System.setProperty("webdriver.chrome.driver", "java_osnove/src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    String url ="https://www.ebay.com/";
        driver.get(url);

    //WebElement s = driver.findElement(By.xpath("//*[@id='gh-cat']"));
    WebElement s = driver.findElement(By.name("_sacat"));
    Select selectObject = new Select(s);
        Random r = new Random();
        int x = r.nextInt(36);
        selectObject.selectByIndex(x);
        Thread.sleep(3000);
        driver.quit();

}}
