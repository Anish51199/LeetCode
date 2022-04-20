class Solution {
    public int jump(int[] nums) {
        int jump=0, currJump=0, curr_farthest=0;
        int n= nums.length;
        
        for(int i=0;i<n-1;i++){
            currJump=Math.max(currJump,i+nums[i]);
            if(i==curr_farthest){
                jump++;
                curr_farthest=currJump;
            }
        }
        return jump;
    }
}