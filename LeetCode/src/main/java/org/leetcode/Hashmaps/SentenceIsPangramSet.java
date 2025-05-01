package org.leetcode.Hashmaps;

import java.util.HashSet;
import java.util.Set;

public class SentenceIsPangramSet {
    public boolean checkIfPangram(String sentence) {
        Set<Character> seen = new HashSet<>();

        for (char currentChar : sentence.toCharArray()) {
            seen.add(currentChar);
        }

        return seen.size() == 26;
    }
}
