import org.junit.jupiter.api.Test;

import java.util.Scanner;


public class paiments {
    @Test
    public static void main(String[] args) {
    Scanner paiments = new Scanner(System.in);

    System.out.print("Entrez le nombre de paiments effectués par Carte Blue : ");
    double CarteBlue = paiments.nextDouble();
        System.out.println("Entrez le nombre de paiments effectués par chèque : ");
    double chèque = paiments.nextDouble();
     System.out.print("Entrez le nombre de paiments effectués par virement: ");
    double virement = paiments.nextDouble();

    double totalPaiment = CarteBlue + chèque+ virement ;

    double pourcentage_CarteBlue = CarteBlue /totalPaiment *100;
    double pourcentage_chèque = chèque /totalPaiment *100;
    double pourcentage_virement = virement /totalPaiment *100;

    System.out.println("Total des paiments effectués : " +totalPaiment);
    System.out.println("Utilisation de la Carte Blue : " +pourcentage_CarteBlue + "%");
    System.out.println("Utilisation du chéquier: " +pourcentage_chèque + "%");
     System.out.println("Utilisation du virement: " +pourcentage_virement + "%");


}
}
