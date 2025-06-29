package org.leetcode.Heaps;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int minimumCost = 0;

        for (int i = 0; i < sticks.length; i++) {
            heap.add(sticks[i]);
        }

        while (heap.size() > 1) {
            int firstStick = heap.remove();
            int secondStick = heap.remove();

            int sticksTogther = firstStick + secondStick;
            minimumCost += sticksTogther;

            heap.add(sticksTogther);
        }
        return minimumCost;
    }
}
