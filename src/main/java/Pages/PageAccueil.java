package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PageAccueil{
    WebDriver driver;

    public PageAccueil (WebDriver driver) {
        this.driver = driver;
    }

public void saisirLogin(String val) {
            WebElement Username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
            Username.sendKeys (val);
        }
public void saisirMDP(String MDP) {
            WebElement Passeword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            Passeword.sendKeys(MDP);
        }
public void CliquerBoutonLogin (){
            WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
            Login.click();
        }
public void VerificationMsg(){
            WebElement verfmsg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]"));
            String MsgError= verfmsg.getText();
            System.out.println(MsgError);
            if (MsgError.equals("Epic sadface: Username and password do not match any user in this service")) {

                System.out.println("Le text est ok");
            } else {
                System.out.println("Le text est different");
            }
        }

    }

