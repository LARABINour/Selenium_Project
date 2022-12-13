package OneTestOneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass01 {

    WebDriver driver;

    @BeforeMethod
    public void Beforetest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.softeaminstitute.fr/");
        driver.manage().window().maximize();
    }

    @Test
    public void montest1() {

        System.out.println(driver.getTitle());
        driver.get("https://www.softeaminstitute.fr/nos-formations");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    @AfterMethod
    public void monAfter() {

        driver.close();
    }
}