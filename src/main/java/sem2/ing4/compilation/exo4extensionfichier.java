package sem2.ing4.compilation;


import java.util.Scanner;

public class exo4extensionfichier {

    public static void main(String[] args) {
        //Entrez votre nom de fichier et son extension
        System.out.println("Entrez le nom de votre fichie suivi de son extension. (Ex: Raouf.nig) : ");
        Scanner scanner = new Scanner(System.in);
        String nigword = scanner.nextLine();


        String[] tab = new String[1];
        tab[0]=nigword;
        String _fileName = tab[0];

        String[] parts = _fileName.split("\\.");
        String extension = parts[parts.length - 1];
        System.out.println("Son extenion est : " + extension);
    }
}
