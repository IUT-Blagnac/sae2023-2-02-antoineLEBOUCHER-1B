package exercice;

import java.util.*;

public class SimplicitePire {
    public static List<String> solution(String texte, List<Character> ordre) {
        List<String> mots = new ArrayList<>(Arrays.asList(texte.split(" ")));

        mots.sort((a, b) -> {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++) {
                    char charA = a.charAt(i);
                    char charB = b.charAt(j);
                    int indexA = ordre.indexOf(charA);
                    int indexB = ordre.indexOf(charB);

                    if (indexA != indexB) {
                        return indexA - indexB;
                    }
                }
            }

            return a.length() - b.length();
        });

        return mots;
    }
}