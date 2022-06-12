package Cas_10_06_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadtaka_4 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "java_osnove/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath(
                "//input[@id='userName']")).sendKeys("itbootcamp");

        driver.findElement(By.xpath(
                "//input[@placeholder='Password']")).sendKeys("ITBootcamp2021!");
        driver.findElement(By.xpath("//form[@id='userForm']/div[4]/div[1]")).click();


        driver.quit();

    }}
