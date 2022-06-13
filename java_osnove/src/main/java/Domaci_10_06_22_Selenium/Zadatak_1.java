package Domaci_10_06_22_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Zadatak_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "java_osnove/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //Napisati program koji:
        //Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
        //Klikce na svaki iks da ugasi obavestenje i proverava da li
        // se nakon klika element obrisao sa stranice i ispisuje
        // odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
        //POMOC: Brisite elemente odozdo.
        //(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


        String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.navigate().to(url);
        String button = "//div[@class='col-md-12']/div/button";
        List<WebElement> nizXButton = driver.
                findElements(By.xpath(button));

        for (int i = nizXButton.size()-1; i >=0; i--) {
            nizXButton.get(i).click();
            Thread.sleep(1000);
            try {nizXButton.get(i);
                System.out.println("Element postoji");}
            catch(Exception e){
                System.out.println("Element ne postoji");
            }

            }





        driver.quit();
    }
}