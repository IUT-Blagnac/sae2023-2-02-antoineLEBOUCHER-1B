package exercice;

import java.util.ArrayList;
import java.util.List;

public class Exercice {
    public static List<String> solution(String str, List<Character> ordre) {
        ArrayList<String> solution = new ArrayList<>();
        if (!str.isEmpty()) {
            List<String> stringToWordList = new ArrayList<>();
            String current = "";
            for (char c : str.toCharArray()) {
                if (c == ' ' || c == '\'') {
                    stringToWordList.add(current);
                    current = "";
                } else {
                    if (Character.isAlphabetic(c) || Character.isDigit(c))
                        current += c;
                }
            }
            stringToWordList.add(current);
            List<String> unsortedWords = new ArrayList<>();
            for(String s : stringToWordList){
                unsortedWords.add(s);
            }
            System.out.println(stringToWordList);
            for (char c : ordre) {
                for (String s : stringToWordList) {
                    if (Character.toLowerCase(s.toCharArray()[0]) == Character.toLowerCase(c)) {
                        solution.add(s);
                        unsortedWords.remove(s);
                    }
                }
            }
            for(String s : unsortedWords){
                solution.add(s);
            }
        } else{
            solution.add("");
        }
        return solution;
    }

    /*
    FEUJ GAY FADE
    FHJGD
     */
}
