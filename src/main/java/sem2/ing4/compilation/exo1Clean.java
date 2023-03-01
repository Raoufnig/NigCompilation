package sem2.ing4.compilation;
import java.util.Scanner;

public class exo1Clean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String nigword = scanner.nextLine();

            // remplace les tabs par 4 espaces
            nigword = nigword.replaceAll("\t", "    ");

            // supprime les espaces entre les mots
            nigword = nigword.replaceAll("\\s", "");
            System.out.println(nigword);
        }
        scanner.close();
    }
}
