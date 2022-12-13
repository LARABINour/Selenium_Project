package OneTestOneclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass02 {

        WebDriver driver;

        @BeforeMethod
        public void Beforetest() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.softeaminstitute.fr/");
            driver.manage().window().maximize();
        }
    @Test
    public void montest2() {
        WebElement fpop = driver.findElement(By.className("paoc-close-popup"));
        fpop.click();
        WebElement recherche = driver.findElement(By.className("s"));
        recherche.sendKeys("Selenium");
        WebElement vrecherche = driver.findElement(By.className("searchsubmit"));
        vrecherche.click();

        }
    @AfterMethod
    public void monAfter() {
        driver.close();
    }


}
