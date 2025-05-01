package org.leetcode.Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class SentenceIsPangramHashMap {
    public boolean checkIfPangram(String sentence) {
        Map<Integer, Character> registeredCharacters = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (!registeredCharacters.containsValue(c)) registeredCharacters.put(i, c);
        }
        if (registeredCharacters.size() == 26) return true;
        else return false;
    }
}
