package org.leetcode.ArraysAndStrings.SlidingWindow;

import static java.lang.Math.max;

public class MaximumAverageSubarrayI {
   public double findMaxAverage(int[] nums, int k) {
       // Count up to the first k elements.
       int sum = 0;
       for (int i = 0; i < k; i++) {
           sum += nums[i];
       }
       // Sliding the window
       int maxSum = sum;
       for (int i = k; i < nums.length; i++) {
           sum += nums[i] - nums[i - k];
           maxSum = Math.max(maxSum, sum);
       }
       // Returning the average.
       return (double) maxSum / k;
   }
}