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
    static int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans=0;
        len(root);
        return ans;
        
    }
    
    public static int len(TreeNode root){
        if(root== null) return 0;
        int left= len(root.left);
        int right= len(root.right);
        
        if(root.left!=null && root.val==root.left.val)
            left +=1;
        else
            left=0;
        if(root.right!=null && root.val==root.right.val)
            right +=1;
        else
            right=0;
        ans= Math.max(ans,left+right);
        return Math.max(left,right);
        
    }
}