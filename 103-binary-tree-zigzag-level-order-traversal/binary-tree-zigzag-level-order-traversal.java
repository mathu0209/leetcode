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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> res = new ArrayList<>();
      if(root == null) return res;
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);
      boolean flag = false;
      while(!q.isEmpty()){
        List<Integer> cur = new ArrayList<>();
        int num = q.size();

        for(int i=0; i<num; i++){
            TreeNode node = q.poll();
            cur.add(node.val);
            if(node.left != null) q.add(node.left);
            if(node.right !=null) q.add(node.right);
        }
        if(flag){
            Collections.reverse(cur);
        }
        res.add(cur);
        flag =!flag;
      }
      return res;
    }
}