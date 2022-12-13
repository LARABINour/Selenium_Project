package Testclassscommune;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class TestvcCom1 extends ClasseCommune {

    @Test
    public void montest1() {



        System.out.println(driver.getTitle());
        driver.get("https://www.softeaminstitute.fr/nos-formations");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
