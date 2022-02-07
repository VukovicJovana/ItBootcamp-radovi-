package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;

public class DomaciItBootcamp {

    public static void main(String[] args) throws InterruptedException {

       // Postoji pesma koja je himna ITBootcampa: https://www.youtube.com/watch?v=dQw4w9WgXcQ
        // Vas domaci zadatak je da otvorite pretrazivac, odete na youtube i pustite Rick Astley-a


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.cssSelector("input"));
        searchBox.click();
        searchBox.sendKeys("Rick Astley-a");
       searchBox.sendKeys(ENTER);

       WebElement video= driver.findElement(By.id("hover-overlays"));
       Thread.sleep(2000);
       video.click();


        }
    }






