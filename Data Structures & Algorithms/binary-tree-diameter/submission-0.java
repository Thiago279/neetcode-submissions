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
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        //determine length
        //my intuition: calculate furthest height left, then furthest 
        //height right , than add both
        // dfs (stack?)

        getHeight(root);
        return maxDiameter;

    
    
    
    }

    private int getHeight(TreeNode node){
        if(node == null)return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        int myDiameter = leftHeight + rightHeight;
        maxDiameter = Math.max(myDiameter, maxDiameter);

        return Math.max(leftHeight, rightHeight) + 1;

    }


}
