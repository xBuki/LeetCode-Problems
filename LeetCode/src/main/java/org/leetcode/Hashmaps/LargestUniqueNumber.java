package org.leetcode.Hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) counts.put(num, counts.getOrDefault(num, 0) + 1);

        int largestUnique = -1;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) largestUnique = Math.max(largestUnique, entry.getKey());
        }
        return largestUnique;
    }
}
