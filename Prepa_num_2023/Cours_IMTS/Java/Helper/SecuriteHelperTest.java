package Helper;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SecuriteHelperTest {


    @Test
    public void testMotDePasseTropCourt() {
        SecuriteHelper.isMotDePasseValide("aaa");

    }
    @Test
    public void testMotDePasseTropLong() {
        assertFalse("le mot de passe et trop long ",
                SecuriteHelper.isMotDePasseValide("aaaaaaaaaaaaaaaaaaaaaaaaaaaa"));


    }
    @Test
    public void testMotDePasseContientUnChiffreEnDernierePosition(){
        assertFalse("Le mot de passe contient un chiffre en derniere position",
        SecuriteHelper.isMotDePasseValide("aaaaa6"));
    }
    @Test
    public void testMotDePasseNeContientPasDeChiffre(){
        assertFalse("Le mot de passe ne contient pas de chiffre",
        SecuriteHelper.isMotDePasseValide("aaaaa"));

    }
    @Test
    public void testMotDePasseEstValide(){
        assertTrue("Le mot de passe est valide",
        SecuriteHelper.isMotDePasseValide("abc456def"));
    }
}// Fin de la class SecuriteHelperTest