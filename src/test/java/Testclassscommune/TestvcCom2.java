package Testclassscommune;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class TestvcCom2 extends ClasseCommune {

        @Test
        public void montest2() {
                WebElement fpop = driver.findElement(By.className("paoc-close-popup"));
                fpop.click();
                WebElement recherche = driver.findElement(By.className("s"));
                recherche.sendKeys("Selenium");
                WebElement vrecherche = driver.findElement(By.className("searchsubmit"));
                vrecherche.click();

        }


}
