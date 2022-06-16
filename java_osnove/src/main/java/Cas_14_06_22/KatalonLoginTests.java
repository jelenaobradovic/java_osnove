package Cas_14_06_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Zadatak_1 {


    //

    private WebDriver

    @BeforeClass

    public void beforeClass (){
        //System.out.println("BEFORE CLASS");
        System.setProperty("webdriver.chrome.driver",
                "java_osnove/src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
    }


    @BeforeMethod

    public void before()
    {
        //ystem.out.println("BEFORE METHOD");
        //home strana bilo kog sajta
        this.driver.get("https://www.google.com/");
    }

    @Test
    public void googleTitleTest(){
        //System.out.println("TITLE TESt");/
        if (driver.getTitle().equals("Google"))
        {
            System.out.println("ok");
        }else {
            System.out.println("Nije ok");
        }
    }

    @Test
    public void googleURLTest(){
        System.out.println("URL TESt");
    }

    @AfterMethod
    public void after()
    {
        System.out.println("AFTER");
    }

    @AfterClass

    public void afterClass()
    {

        System.out.println("AFTER CLASS");
    }}
