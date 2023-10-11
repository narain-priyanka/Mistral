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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> adjlist = new ArrayList<>();
        inorderTraversalHelper(root, adjlist);
        return adjlist;
    }

    private void inorderTraversalHelper(TreeNode node, List<Integer> result) {
        if (node != null) {
            inorderTraversalHelper(node.left, result);
            result.add(node.val);
            inorderTraversalHelper(node.right, result);
        }
    }
}