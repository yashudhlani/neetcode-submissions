/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private boolean isSameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if ((a == null && b != null) || (a != null && b == null) || (a.val != b.val)) return false;
        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) return false;

        if (root.val == subRoot.val) {
            if(isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right)) return true;
        }

        if (isSubtree(root.left, subRoot)) return true;
        return isSubtree(root.right, subRoot);
    }
}
