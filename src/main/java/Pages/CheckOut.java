package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class CheckOut {

    WebDriver driver;

    public CheckOut (WebDriver driver) {
        this.driver = driver;
    }


        public void SaisirNom (String Val1){
            WebElement Name= driver.findElement(By.id("first-name"));
           Name.sendKeys(Val1);
        }

    public void saisirPrenom(String Val2) {
        WebElement Prenom = driver.findElement(By.id("last-name"));
        Prenom.sendKeys(Val2);
    }
    public void saisirCP(String Val3) {
        WebElement CP = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
        CP.sendKeys(Val3);
    }

    public void VerifYrInfo() {
        WebElement YourInfo = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));

        String expectedTitle = "Checkout: Your Information";
        String originalTitle = YourInfo.getText();
        Assert.assertEquals(originalTitle, expectedTitle, "incorrect");
    }

    public void BtnContinue(){
        WebElement Continue = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        Continue.click();
    }



}
