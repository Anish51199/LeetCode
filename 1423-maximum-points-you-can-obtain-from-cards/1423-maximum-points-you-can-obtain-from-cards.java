class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
      //  int dp[] = new int[n];
        int curr_sum=0;
                           
        for(int i=n-1;i>=n-k;i--)
           // dp[0]+= cardPoints[i];
            curr_sum += cardPoints[i]; 
        
         int max=curr_sum;
          

       if(n!=k) 
        for(int i=1;i<k+1;i++){
           // dp[i]= dp[i-1]+cardPoints[i-1]-cardPoints[n-k+i-1];
            int sum=curr_sum+cardPoints[i-1]-cardPoints[n-k+i-1];
            curr_sum=sum;
            max= Math.max(sum,max);
        }
        
        return max;
    }
}