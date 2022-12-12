package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Products {
    WebDriver driver;

    public Products(WebDriver driver) {
        this.driver = driver;

    }


    public void TitreProduit(){
        WebElement VerifTP = driver.findElement(By.xpath("//*[contains(text(), 'Products')]"));
        String TProduct= VerifTP.getText();
        System.out.println(TProduct);
        if (TProduct.equals("Products")) {

            System.out.println("Le text est ok");
        } else {
            System.out.println("Le text est different");
        }
    }
    public void AjouterProduit1(){
        WebElement Produit1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        Produit1.click();

    }
    public void AjouterProduit2(){
        WebElement Produit2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        Produit2.click();
    }
    public void Panierclic(){
        WebElement Panier = driver.findElement(By.className("shopping_cart_link"));
        Panier.click();
    }


}

