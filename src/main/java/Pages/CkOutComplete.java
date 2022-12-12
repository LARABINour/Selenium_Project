package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CkOutComplete {
    WebDriver driver;
    public CkOutComplete (WebDriver driver) {
        this.driver = driver;

    }

    public void Verifmsg() {
        WebElement Vmsg = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));

        String expectedTitle = "THANK YOU FOR YOUR ORDER";
        String originalTitle = Vmsg.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");
    }
}
