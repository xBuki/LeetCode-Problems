package org.leetcode.TreesAndGraphs.DFS;

import org.leetcode.TreesAndGraphs.TreeNode;

public class MaximumDepthOfABinaryTree {
    public int maxDepth(TreeNode root) {
        // Base Case
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
