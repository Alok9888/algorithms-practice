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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> level = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        List<Integer> curr = new ArrayList<>();
        level.offer(root);

        while(!level.isEmpty()){
            int levelSize = level.size();
            for(int i=0; i<levelSize; i++){
                TreeNode element = level.poll();
                curr.add(element.val);

                if(element.left != null) level.offer(element.left);
                if(element.right != null) level.offer(element.right);
            }
            ans.add(new ArrayList<>(curr));
            curr.clear();
        }
        return ans;
    }
}