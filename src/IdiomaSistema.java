import java.util.*;


public class IdiomaSistema {

    public static void main(String [] args) {
        Locale loc = Locale.getDefault();
        System.out.println("Seu Sistema está escrito em: " + loc.getDisplayLanguage());
        System.out.println("Seu Sistema está escrito em: " + loc.getLanguage());
    }
}