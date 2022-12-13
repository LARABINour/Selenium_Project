import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exo04 {


    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Dev\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softeaminstitute.fr/");
        driver.manage().window().maximize();
        WebElement fpop = driver.findElement(By.className("paoc-close-popup"));
        fpop.click();
        WebElement Formations= driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[3]/ul/li[1]/div[1]"));
        String nbrfor = Formations.getText();
        System.out.println(nbrfor);
        WebElement FAtlas= driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[3]/ul/li[2]/div[1]"));
        String nbrFAtlas = FAtlas.getText();
        System.out.println(nbrFAtlas);
        WebElement FCPF= driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[3]/ul/li[3]/div[1]"));
        String nbrFCPF = FCPF.getText();
        System.out.println(nbrFCPF);
        WebElement HFor= driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[3]/ul/li[4]/div[1]"));
        String nbrHFor = HFor.getText();
        System.out.println(nbrHFor);
        WebElement SC= driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[3]/ul/li[5]/div[1]"));
        String PSC = SC.getText();
        System.out.println(PSC);
        driver.close();
    }

}