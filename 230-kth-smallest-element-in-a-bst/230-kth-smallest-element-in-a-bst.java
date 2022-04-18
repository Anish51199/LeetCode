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
   // static ArrayList<Integer> list;
    static int count=0;
    static int ans=0;
    public int kthSmallest(TreeNode root, int k) {
      //  list= new ArrayList<>();
        count=k;
        Inorder(root);
        return ans;
    }
    
    
    public void Inorder(TreeNode root){
        if(root==null) return ;
        Inorder(root.left);
        count--;
        if(count==0){
            ans=root.val;
            return;
        }
       // list.add(root.val);
        Inorder(root.right);
    }
}