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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = root;
        TreeNode insert = new TreeNode(val);
        if(root == null){
            root = insert;
            return root;
        }
        while(true){
            if(insert.val > temp.val){
                if(temp.right == null){
                    temp.right = insert;
                    return root;
                }
                temp = temp.right;
            }
            else{
                if(temp.left == null){
                    temp.left = insert;
                    return root;
                }
                temp = temp.left;
            } 
        }
    }
}