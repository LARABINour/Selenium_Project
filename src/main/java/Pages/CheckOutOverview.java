package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckOutOverview {
    WebDriver driver;
    public CheckOutOverview (WebDriver driver) {
        this.driver = driver;

    }

    public void VerifOvervieuw() {
        WebElement OverVieuw = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

        String expectedTitle = "CHECKOUT: OVERVIEW";
        String originalTitle = OverVieuw.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");
    }
    public void VerifTotal() {
        WebElement Vtotal = driver.findElement(By.cssSelector("div.summary_total_label"));

        String expectedTitle = "43.18";
        String originalTitle = Vtotal.getText();
        System.out.println(originalTitle.contains(expectedTitle));
        //Assert.assertEquals(originalTitle, expectedTitle, "incorrect");
    }

    public void BtnFinish (){
        WebElement BFinish = driver.findElement(By.id("finish"));
        BFinish.click();
    }



}
