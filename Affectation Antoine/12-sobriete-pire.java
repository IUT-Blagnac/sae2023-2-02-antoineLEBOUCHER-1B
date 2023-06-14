package exercice;

import java.util.ArrayList;
import java.util.List;

public class Exercice {
    public static List<String> solution(String str, List<Character> ordre) {
        if (str.length() == 0) {
            List<String> chaineVide = List.of();
            return chaineVide;
        }

        List<String> listeTrier = new ArrayList<>();

        String regex = "[^a-zA-Z0-9]+";

        String[] tabMots = str.split(regex);

        List<String> listeMots = new ArrayList<>();

        for (String mot : tabMots) {
            listeMots.add(mot);
        }

        for (Character caractere : ordre) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < tabMots.length; i++) {
                if (tabMots[i].charAt(0) == caractere) {
                    temp.add(tabMots[i]);
                    listeMots.remove(tabMots[i]);
                }
            }

            listeTrier.addAll(temp);

        }

        if (!listeMots.isEmpty()) {
            listeTrier.addAll(listeMots);
        }

        return listeTrier;
    }
}