package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test01 {

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

    @Test
    public void montest2() {
        WebElement fpop = driver.findElement(By.className("paoc-close-popup"));
        fpop.click();
        WebElement recherche = driver.findElement(By.className("s"));
        recherche.sendKeys("Selenium");
        WebElement vrecherche = driver.findElement(By.className("searchsubmit"));
        vrecherche.click();


    }

    @Test
    public void montest3() {

        WebElement fpop = driver.findElement(By.className("paoc-close-popup"));
        fpop.click();
        WebElement verftext = driver.findElement(By.className("title"));
        String text = verftext.getText();
        System.out.println(text);
        if (text.equals("Trouvez votre prochaine formation")) {
            ;
            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
        WebElement verfforma = driver.findElement(By.id("mega-menu-item-124348"));
        String Forma = verfforma.getText();
        System.out.println(Forma);
        if (Forma.equals("Nos formations")) {
            ;
            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
        WebElement verfSolo = driver.findElement(By.id("mega-menu-item-124385"));
        String Solo = verfSolo.getText();
        System.out.println(Solo);
        if (Solo.equals("Nos solutions")) {
            ;
            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
        WebElement verfAppro = driver.findElement(By.id("mega-menu-item-124393"));
        String Appro = verfAppro.getText();
        System.out.println(Appro);
        if (Appro.equals("Nos approches")) {
            ;
            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
        WebElement verffinance = driver.findElement(By.id("mega-menu-item-124397"));
        String Finance = verffinance.getText();
        System.out.println(Finance);
        if (Finance.equals("Financement")) {
            ;
            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
    }

    @AfterMethod
    public void monAfter() {
        driver.close();
    }

}


