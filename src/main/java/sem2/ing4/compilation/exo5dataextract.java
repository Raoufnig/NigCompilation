package sem2.ing4.compilation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exo5dataextract {
    public static void main(String[] args) {
        Pattern html = Pattern.compile("<(.+?)>", Pattern.DOTALL);
        String balise = "<html><head><title>Raouf</title></head><body><h1>Extraction de Donnees</h1></body></html>";

        Matcher correspondance = html.matcher(balise);
        while (correspondance.find()) {
            System.out.println("Expression correspondante au motif: " + correspondance.group(0));
            System.out.println("Nom du tag: " + correspondance.group(1));
        }
    }
}
