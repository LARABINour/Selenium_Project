package Testclassscommune;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class ClasseCommune {
    protected WebDriver driver;


    @BeforeMethod
    public void Beforetest() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.softeaminstitute.fr/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void monAfter() {

        driver.close();
    }

}
