package sem2.ing4.compilation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exo2adresseip {

    //^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$
    // Cette expression régulière utilise les groupes de capture pour capturer les parties a, b, c
    // et d de l'adresse IP. Chaque groupe de capture est représenté par (\\d{1,3}),
    // qui signifie "1 à 3 chiffres".
    // Les points sont également inclus dans l'expression régulière pour s'assurer qu'ils sont présents.

    public static void main(String[] args) {
        Matcher alveus;
        Pattern bahr;

        //compilation du regex
        bahr = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");

        //entrez votre adresseIP
        System.out.println("Entrez votre adresseip svp : ");
        Scanner scanner = new Scanner(System.in);
        String nigword = scanner.nextLine();

        alveus = bahr.matcher(nigword);
        if(alveus.find()) {
            System.out.println("addresse ip valide");
        }
        else{
            System.out.println("Adresse invalide");
        }
    }
}
