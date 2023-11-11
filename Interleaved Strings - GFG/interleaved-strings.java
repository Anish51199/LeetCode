//{ Driver Code Starts
//initial code
import java.util.*;
import java.lang.*;
class InterLeaveString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            Solution g=new Solution();
        
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
            t--;
        }
    }
}


// } Driver Code Ends


/*you are required to complete this method */
class Solution {
	public boolean isInterLeave(String a,String b,String c)
	{
            //Your code here
            
            int n= a.length();
            int m= b.length();
            int o= c.length();
            
            if(n+m!=o) return false;
            
            
            boolean[][] dp = new boolean[n+1][m+1];
            
            dp[0][0] = true;
            
            for(int i=1; i<dp.length; i++)
                dp[i][0] = dp[i-1][0] || (a.charAt(i-1) == c.charAt(i-1));
                
            for(int i=1; i<dp[0].length; i++)
                dp[0][i] = dp[0][i-1] || (b.charAt(i-1) == c.charAt(i-1));
            
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    
                    char p=a.charAt(i-1);
                    char q=b.charAt(j-1);
                    char r=c.charAt(i+j-1);
                    
                    dp[i][j] = (dp[i-1][j] && p==r) || (dp[i][j-1] && q==r);
                }
            }
            
            return dp[n][m];
	}
}

