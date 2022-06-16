package Domaci_14_06_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

import static org.testng.TestRunner.PriorityWeight.priority;

public class Bootstrap_Table_Tests {


    private WebDriver driver;
    private String baseURL = "https://s.bootsnipp.com";



        @BeforeClass
        public void beforeClass() {
            System.setProperty("webdriver.chrome.driver",
                    "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }


    @BeforeMethod
    public void beforeMethod() {
        driver.
                get(baseURL + "/iframe/K5yrx");
    }

    @Test(priority=10)
    public void editRow() {

        //Podaci:
        //First Name: ime polaznika
        //Last Name: prezime polaznika
        //Middle Name: srednje ime polanzika
        //Koraci:
        //Ucitati stranu /iframe/K5yrx
        //Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
        //Klik na Edit dugme prvog reda
        //Sacekati da dijalog za Editovanje bude vidljiv
        //Popuniti formu podacima.
        //Bice potrebno da pre unosa tekst pobrisete tekst koji vec postoji,
        // za to se koristi metoda clear. Koristan link
        //Klik na Update dugme
        //Sacekati da dijalog za Editovanje postane nevidljiv
        //Verifikovati da se u First Name celiji prvog reda tabele javlja uneto ime
        //Verifikovati da se u Last Name celiji prvog reda tabele javlja uneto prezime
        //Verifikovati da se u Middle Name celiji prvog reda tabele javlja uneto srednje ime
        //Za sve validacije ispisati odgovarajuce poruke u slucaju greske



        Assert.assertTrue(driver
                        .getTitle()
                        .equals("Table with Edit and Update Data - Bootsnipp.com"), "Invalid title");

        driver.findElement(
                        By.xpath("//button[contains (@class, 'update btn btn-warning btn-sm')]"))
                        .click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.
                        presenceOfElementLocated(By.className("modal-content")));

        driver.findElement(By.id("fn")).clear();
        driver.findElement(By.id("ln")).clear();
        driver.findElement(By.id("mn")).clear();

        driver.findElement(By.id("fn")).sendKeys("Jelena");
        driver.findElement(By.id("ln")).sendKeys("Obradovic");
        driver.findElement(By.id("mn")).sendKeys("Radica");

        driver.findElement(By.id("up")).click();

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className("modal-content"))));

        String ime = driver.findElement(By.id("f1")).getText();
        String prezime = driver.findElement(By.id("l1")).getText();
        String srednjeIme = driver.findElement(By.id("m1")).getText();


        Assert.assertEquals(ime,
                "Jelena",
                "Incorrect first name");

        Assert.assertEquals(prezime,
                "Obradovic",
                "Incorrect last name");

        Assert.assertEquals(srednjeIme,
                "Jovan",
                "Incorrect middle name");



    }


   @Test (priority = 20)
   public void checkInputTypes() {


        //Test #2: Delete Row
        //Podaci:
        //First Name: ime polaznika
        //Last Name: prezime polaznika
        //Middle Name: srednje ime polanzika
        //Koraci:
        //Ucitati stranu /iframe/K5yrx
        //Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
        //Klik na Delete dugme prvog reda
        //Sacekati da dijalog za brisanje bude vidljiv
        //Klik na Delete dugme iz dijaloga
        //Sacekati da dijalog za Editovanje postane nevidljiv
        //Verifikovati da je broj redova u tabeli za jedan manji
        //Za sve validacije ispisati odgovarajuce poruke u slucaju greske



       Assert.assertTrue(driver.getTitle()
                       .equals("Table with Edit and Update Data - Bootsnipp.co"),
               "Incorrect title");

       driver.findElement(
               By.xpath("//button[contains(@class, 'delete')]"))
               .click();



       driver.findElement(
               By.id("del"))
               .click();

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(
               ExpectedConditions.presenceOfElementLocated(By.id("delete")));

       driver.findElement(By.id("del")).click();

       wait.until(
               ExpectedConditions.invisibilityOf(driver.findElement(By.id("delete"))));

       List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

       Assert.assertTrue(rows.isEmpty(), " Row is not deleted");


   }

    @Test (priority = 30)
    public void test3() {
        //Test #3: Take a Screenshot
        //Koraci:
        //Ucitati stranu  /iframe/K5yrx
        //Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
        //Kreirati screenshot stranice. Koristan link https://www.guru99.com/take-screenshot-selenium-webdriver.html
        //Fajl cuvajte na putanji gde su vam bile slike od proslog domaceg. Na putanji: src/main/resources/nazivslike.png

    }

    @AfterMethod
    public void after() {
        this.driver.quit();
    }

    @AfterClass

    public void afterClass() {

        System.out.println("AFTER CLASS");
    }


}


