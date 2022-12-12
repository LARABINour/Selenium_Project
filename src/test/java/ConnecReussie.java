import PCommun.Hooks;
import Pages.*;
import org.testng.annotations.Test;

public class ConnecReussie extends Hooks{

        @Test
        public void TloginReussie() {


            PageAccueil pAccueil = new PageAccueil(driver);
            pAccueil.saisirLogin("standard_user");
            pAccueil.saisirMDP("secret_sauce");
            pAccueil.CliquerBoutonLogin();
            Products Pproduct= new Products(driver);
            Pproduct.TitreProduit();
            Pproduct.AjouterProduit1();
            Pproduct.AjouterProduit2();
            Pproduct.Panierclic();

            YourCart VPanier= new YourCart(driver);
            VPanier.TitrePanier();
            VPanier.PresenceP1();
            VPanier.PresenceP2();
            VPanier.checkoutYC();

            CheckOut CkOut = new CheckOut(driver);
            CkOut.SaisirNom("LARABI");
            CkOut.saisirPrenom("Nour-Eddine");
            CkOut.saisirCP("59370");
            CkOut.BtnContinue();

            CheckOutOverview CkOvervieuw = new CheckOutOverview(driver);
            CkOvervieuw.VerifOvervieuw();
            CkOvervieuw.VerifTotal();
            CkOvervieuw.BtnFinish();



            CkOutComplete CkOutcompl = new CkOutComplete(driver);
            CkOutcompl.Verifmsg();

        }

    }




