//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine();
            String[] S = s1.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            int ans = ob.editDistance(s, t);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    
    static int min(int x, int y, int z)
    {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }
    
    public int editDistance(String s, String t) {
        // Code here
        
        int n= s.length();
        int m= t.length();
        
        // return editDisatnceHelper1(n,m,s,t);
        
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                
                if (i == 0)
                    dp[i][j] = j; // Min. operations = j
 
                // If second string is empty, only option is
                // to remove all characters of second string
                else if (j == 0)
                    dp[i][j] = i;
                
                else if(s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                    
                else
                    dp[i][j] = 1+ min(dp[i-1][j-1], dp[i][j-1], dp[i-1][j]);
            }
        }
        
        return dp[n][m];
        
    }
    
    
    public int editDisatnceHelper1(int n, int m, String s, String t ){
        
        if(n==0) return m;
        if(m==0) return n;
        
        if(s.charAt(n-1) == t.charAt(m-1))
            return editDisatnceHelper1(n-1, m-1, s, t);
            
        else
            return (1 + min(editDisatnceHelper1(n-1, m-1, s, t)
            ,editDisatnceHelper1(n-1, m, s, t), editDisatnceHelper1(n,m-1,s,t)));
    }
}