package Cas_10_06_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zadatak_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "java_osnove/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url ="https://www.ebay.com/";
        driver.get(url);

        //WebElement s = driver.findElement(By.xpath("//*[@id='gh-cat']"));
        WebElement s = driver.findElement(By.name("_sacat"));
        Select selectObject = new Select(s);
        selectObject.selectByVisibleText("Crafts");
        Thread.sleep(3000);
        driver.quit();
    }
}
