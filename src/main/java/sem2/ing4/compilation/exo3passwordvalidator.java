package sem2.ing4.compilation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exo3passwordvalidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern p;
        Matcher m;
        //compilqtion du regex
        p = Pattern.compile("^(?=.*[~!@#$%^&*|])[a-zA-Z0-9~!@#$%^&*|]{8,}$");

        //Entrez un mot d passe longueur supérieure ou égal à 8 et contiennent au moins l'un des caractères suivants ~ ! @ # $ % ^ & * |
        System.out.println("Bien vouloir entrer votre mot de passe svp  :");
        String nigword = scanner.nextLine();

        m = p.matcher(nigword);

        if(m.find()) {
            System.out.println("mot de passe valide");
        }
        else{
            System.out.println("mot de passe invalide");
        }
    }

}
