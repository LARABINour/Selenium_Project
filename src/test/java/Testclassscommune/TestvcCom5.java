package Testclassscommune;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class TestvcCom5 extends ClasseCommune {
        @Test
        public void montest5() {

            WebElement verftext = driver.findElement(By.className("title"));
            String text = verftext.getText();
            System.out.println(text);
            if (text.equals("Trouvez votre prochaine formation")) {

                System.out.println("Le text est ok");
            } else {
                System.out.println("Le text est different");
            }
            WebElement Nosforma = driver.findElement(By.id("mega-menu-item-124348"));
            Nosforma.click();

            WebElement VerifT = driver.findElement(By.className("title"));
            String Tit = VerifT.getText();
            System.out.println(Tit);
            if (Tit.equals("Trouvez votre prochaine formation")) {

                System.out.println("Le text est ok");
            } else {
                System.out.println("Le text est different");

            }
            WebElement VerifNosfor = driver.findElement(By.className("titlepageformattion"));
            String Nosfor = VerifNosfor.getText();
            System.out.println(Nosfor);
            if (Nosfor.equals("Nos Formations")) {

                System.out.println("Le text est ok");
            } else {
                System.out.println("Le text est different");
            }

            WebElement VerifDev = driver.findElement(By.xpath("//*[@id=\"liste_categories\"]/li[1]/h2/a"));
            String Dev = VerifDev.getText();
            System.out.println(Dev);
            if (Dev.equals("Développement et développement Web")) {

                System.out.println("Le text est ok");
            } else {
                System.out.println("Le text est different");
            }

        }
    }

