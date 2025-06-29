package org.leetcode.Greedy;

public class Maximum69Number {
    public int maximumNumber(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);

        for (int i = 0; i < sb.length(); i++) {

            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break;
            }
        }
        int maxNumber = Integer.parseInt(sb.toString());
        return maxNumber;
    }
}
