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
    public boolean isBalanced(TreeNode root) {
        // at every given node, im looking at their sons height
        //if diff ever > 1 -> return false
        int h = getHeight(root);
        return h != -1;

    }
    private int getHeight(TreeNode node){
        if(node == null)return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        if(rightHeight == -1 || leftHeight == -1){
            return -1;
        }
        int diff;
        if(leftHeight >= rightHeight){
            diff = leftHeight - rightHeight;
        }else{
            diff = rightHeight - leftHeight;
        }

        if(diff > 1){
            return -1;
        }

        return Math.max(leftHeight,rightHeight) + 1;
        

    }
}
