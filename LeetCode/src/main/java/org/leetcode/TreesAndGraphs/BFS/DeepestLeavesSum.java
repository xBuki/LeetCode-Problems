package org.leetcode.TreesAndGraphs.BFS;

import org.leetcode.TreesAndGraphs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        // Base Case
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                sum += current.val;
                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
        return sum;
    }
}
