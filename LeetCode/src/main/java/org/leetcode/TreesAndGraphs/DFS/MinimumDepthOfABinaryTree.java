package org.leetcode.TreesAndGraphs.DFS;

import org.leetcode.TreesAndGraphs.TreeNode;

public class MinimumDepthOfABinaryTree {
    public int minDepth(TreeNode root) {
        // Base Case
        if (root == null) return 0;

        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return Math.min(left, right) + 1;
    }
}
