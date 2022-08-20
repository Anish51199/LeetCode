class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int dp[] = new int[n];
                           
        for(int i=n-1;i>=n-k;i--)
            dp[0]+= cardPoints[i];
        
         int max=dp[0];

       if(n!=k) 
        for(int i=1;i<k+1;i++){
            dp[i]= dp[i-1]+cardPoints[i-1]-cardPoints[n-k+i-1];
            max= Math.max(dp[i],max);
        }
        
        return max;
    }
}