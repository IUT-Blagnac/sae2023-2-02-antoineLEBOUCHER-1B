package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String texte = "Exemple de texte a classer";
        ResourceRecorder r = new ResourceRecorder();
        r.start();
        List<Character> ordre = List.of('c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');
        r.stop();
        System.out.println(r);
        System.out.println(Exercice.solution(texte,ordre));
        // output: [classer, texte, exemple, a, de]
    }
}
