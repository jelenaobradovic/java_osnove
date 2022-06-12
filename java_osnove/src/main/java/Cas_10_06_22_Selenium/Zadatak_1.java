package Cas_10_06_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "java_osnove/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url ="http://cms.demo.katalon.com/my-account/";
        driver.get(url);

        driver.findElement(By.xpath("//input[ @name='rememberme']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
