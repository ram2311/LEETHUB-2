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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        visit(root,"");
        return sum;
    }
    
    public void visit(TreeNode node, String value){
        if(node == null){
            return;
        }
        String currentValue = value + String.valueOf(node.val);
        if(node.left == null && node.right == null){

            sum += Integer.parseInt(currentValue, 2);
 
            return;
        }
    
        visit(node.left,currentValue);
        visit(node.right,currentValue);
        
    }
    
    
}