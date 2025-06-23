package org.leetcode.TreesAndGraphs.DFS;

import org.leetcode.TreesAndGraphs.TreeNode;

public class DiameterOfBinaryTree {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        getLongestPath(root);
        return diameter;
    }

    private int getLongestPath(TreeNode node) {
        // Base Case
        if (node == null) return -1;
        // Case
        int left = getLongestPath(node.left);
        int right = getLongestPath(node.right);
        diameter = Math.max(diameter, left + right + 2);
        return Math.max(left, right) + 1;
    }
}
