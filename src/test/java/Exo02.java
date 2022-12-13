package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exo02 {


    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Dev\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softeaminstitute.fr/");
        driver.manage().window().maximize();

        WebElement fpop = driver.findElement(By.className("paoc-close-popup"));
        fpop.click();
        WebElement recherche= driver.findElement(By.className("s"));
        recherche.sendKeys("Selenium");
        WebElement vrecherche= driver.findElement(By.className("searchsubmit"));
        vrecherche.click();
        driver.close();

    }

}
