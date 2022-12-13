package Testclassscommune;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class TestvcCom3 extends ClasseCommune {

    public void montest3() {

        WebElement fpop = driver.findElement(By.className("paoc-close-popup"));
        fpop.click();
        WebElement verftext = driver.findElement(By.className("title"));
        String text = verftext.getText();
        System.out.println(text);
        if (text.equals("Trouvez votre prochaine formation")) {

            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
        WebElement verfforma = driver.findElement(By.id("mega-menu-item-124348"));
        String Forma = verfforma.getText();
        System.out.println(Forma);
        if (Forma.equals("Nos formations")) {

            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
        WebElement verfSolo = driver.findElement(By.id("mega-menu-item-124385"));
        String Solo = verfSolo.getText();
        System.out.println(Solo);
        if (Solo.equals("Nos solutions")) {

            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
        WebElement verfAppro = driver.findElement(By.id("mega-menu-item-124393"));
        String Appro = verfAppro.getText();
        System.out.println(Appro);
        if (Appro.equals("Nos approches")) {

            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
        WebElement verffinance = driver.findElement(By.id("mega-menu-item-124397"));
        String Finance = verffinance.getText();
        System.out.println(Finance);
        if (Finance.equals("Financement")) {

            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
    }

}
