package org.leetcode.Hashmaps;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int [] arr) {
        Set<Integer> numSet = new HashSet<>();
        int count = 0;
        for (int num : arr) numSet.add(num);

        for (int num : arr) {
            if (numSet.contains(num + 1)) {
                count = count + 1;
            }
        }
        return count;
    }
}
