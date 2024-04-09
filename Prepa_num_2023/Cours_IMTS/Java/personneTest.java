import personne.Persone;
import org.junit.jupiter.api.Test;


public class personneTest {
    @Test
    void createNewUser() {
        Persone persone = new Persone();

        persone.setMaile("test@gamil.com");
        persone.setName("Julien");

        persone.setPassword("hidhidhidhi");
        persone.setAge(2300);
        System.out.println(" nom " + persone.getName() + " age " + persone.getAge() + " mail "+ persone.getMail()+ " password "+ persone.getPassword());
    }
}
