package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class YourCart {
    WebDriver driver;

    public YourCart (WebDriver driver) {
        this.driver = driver;

    }

    public void TitrePanier(){
        WebElement VerifTPan = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String TPanier= VerifTPan.getText();
        System.out.println(TPanier);
        if (TPanier.equals("YOUR CART")) {

            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
    }
    public void PresenceP1(){
        WebElement VerifProd1 = driver.findElement(By.xpath("//*[contains(text(), 'Sauce Labs Backpack')]"));
        Assert.assertTrue(VerifProd1.isDisplayed(), "Non OK");

    }
    public void PresenceP2(){
        WebElement VerifProd2 = driver.findElement(By.xpath("//*[contains(text(), 'Sauce Labs Bike Light')]"));
        Assert.assertTrue(VerifProd2.isDisplayed(), "Non OK");

    }

  public void checkoutYC(){
      WebElement CheckOut = driver.findElement(By.id("checkout"));
      CheckOut.click();
  }
}
