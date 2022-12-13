import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exo01 {


    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Dev\\Driver\\chromedriver.exe");

                WebDriver driver = new ChromeDriver();
                 driver.get("https://www.softeaminstitute.fr/");
                 driver.manage().window().maximize();
                 System.out.println(driver.getTitle());
                 driver.get("https://www.softeaminstitute.fr/nos-formations");
                 driver.navigate().back();
                 driver.navigate().forward();
                 driver.navigate().refresh();
                 driver.close();
    }

}
