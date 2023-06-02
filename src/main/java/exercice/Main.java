package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String texte = "Exemple de texte a classer";
        List<Character> ordre = List.of('c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');
        System.out.println(Exercice.solution(texte,ordre));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        double durationMillis = (double) duration / 1_000_000.0;
        System.out.println("Temps d'exécution : " + durationMillis);
        // output: [classer, texte, exemple, a, de]
    }
}
