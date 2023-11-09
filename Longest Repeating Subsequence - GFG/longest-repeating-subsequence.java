//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        // return lcs(0,0,str,str);
        
        int n=str.length();
        int m=str.length();
        
        int dp[][] = new int[n+1][m+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str.charAt(i-1) == str.charAt(j-1) && i!=j)
                    dp[i][j] = dp[i-1][j-1] +1;
                else
                    dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);;
            }
        }
        return dp[n][m];

    }
    
    
    public int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        if(x==0 || y==0) return 0;
        
        if(s1.charAt(x-1) == s2.charAt(y-1) && x!=y)
            return  1+ lcs(x-1,y-1, s1,s2);
        else
            return Math.max(lcs(x-1,y,s1,s2), lcs(x,y-1,s1,s2));
    }
}