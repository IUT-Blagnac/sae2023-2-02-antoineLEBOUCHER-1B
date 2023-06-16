package exercice;

import java.util.List;
import java.util.ArrayList;

public class Exercice {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> result = new ArrayList<>();
        
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (ordre.contains(c)) {
                if (word.length() > 0) {
                    result.add(word.toString());
                    word.setLength(0);
                }
                result.add(String.valueOf(c));
            } else {
                word.append(c);
            }
        }
        
        if (word.length() > 0) {
            result.add(word.toString());
        }
        
        return result;
    }
}
