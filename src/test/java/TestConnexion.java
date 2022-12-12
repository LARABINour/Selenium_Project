import PCommun.Hooks;

import Pages.PageAccueil;
import org.testng.annotations.Test;

public class TestConnexion extends Hooks {

    @Test
        public void Montestlogin() {


        PageAccueil Testlogin=new PageAccueil(driver);
        Testlogin.saisirLogin("standard_user");
        Testlogin.saisirMDP("abc123");
        Testlogin.CliquerBoutonLogin();
        Testlogin.VerificationMsg();


    }



}
