package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class demoqaTest {
    public static void main(String[] args) throws InterruptedException {
        //Zadatak 3 - Ulogovati se na sajt https://demoqa.com/ preko kolacica, izlogovati se i asertovati da je korisnik izlogovan

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");


        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("lokaVukovic");
       // username.sendKeys("ENTER");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Qwerty123!@#");

        WebElement button= driver.findElement(By.id("login"));
        button.click();

        //  Cookie kolacic = new Cookie("")

        Cookie kolacic= new Cookie("Jovana", "je unela kolacic"); //Ovo znam da dodam i ok mi je, za ostale kolacice ne garantujem da je dobro uradjeno,nisu mi bas jasni
        driver.manage().addCookie(kolacic);
       Cookie kolacic1= new Cookie("cookie-domain:.demoqa.com cookie-name:__gads","ID=ae74a9dd4ad7080a-22a317a421cd0051:T=1642356702:RT=1642356705:S=ALNI_MbCih2jlZlJbqH2L_sBnBnoR70FOg" );
        driver.manage().addCookie(kolacic1);
        Cookie kolacic2= new Cookie("expires","2022-01-23T15%3A13%3A32.643Z");
        driver.manage().addCookie(kolacic2);
        Cookie kolacic3= new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InRpbmFiOTkyIiwicGFzc3dvcmQiOiJRd2VydHkxMjMhQCMiLCJpYXQiOjE2NDIzNDYwMTJ9.07Dz3ogpFBPCTM7lVy-xyZr-KUcrFmremKhsIVICy-0");
        driver.manage().addCookie(kolacic3);


        Thread.sleep(2000);
        driver.navigate().to("https://demoqa.com/profile");
        Thread.sleep(2000);

        WebElement logout=driver.findElement(By.id("submit"));
        logout.click();
        Thread.sleep(2000);

        String actualURL= driver.getCurrentUrl();
        System.out.println(actualURL);

        String expectedURl= "https://demoqa/login";
        Assert.assertEquals(actualURL,expectedURl);
        Thread.sleep(2000);
        driver.quit();
    }

}
