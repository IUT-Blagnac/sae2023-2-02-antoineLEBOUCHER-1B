package exercice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ResourceRecorder resourceRecorder = new ResourceRecorder();
        String texte = "Exemple de texte a classer";
        List<Character> ordre = List.of('c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd');
        resourceRecorder.start();
        System.out.println(Exercice.solution(texte,ordre));
        resourceRecorder.stop();
        System.out.print(resourceRecorder.toString());
        // output: [classer, texte, exemple, a, de]
    }
}
