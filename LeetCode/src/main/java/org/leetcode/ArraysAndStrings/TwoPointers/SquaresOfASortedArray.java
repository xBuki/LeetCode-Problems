package org.leetcode.ArraysAndStrings.TwoPointers;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
       int left = 0;
       int right = nums.length - 1;
       int[] numbers = new int[nums.length];
       int i = right;

       while (left <= right) {
           if (Math.abs(nums[left]) < Math.abs(nums[right])) {
               numbers[i--] = nums[right] * nums[right];
               right--;
           } else {
               numbers[i--] = nums[left] * nums[left];
               left++;
           }
       }
       return numbers;
    }
}
