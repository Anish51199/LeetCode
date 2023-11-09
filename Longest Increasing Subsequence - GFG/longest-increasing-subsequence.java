//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[])
    {
        // code here
        // if(n==1) return 1;
        // int res =0, max=0, global_max=1;;
        
        
        // for(int i=1;i<n;i++){
        //     res = longestSubsequence(i, arr);
            
        //     if(arr[i-1]<arr[n-1] && res+1>max)
        //         max= res+1;
        // }
        
        // global_max = Math.max(global_max,max);
        
        // return global_max;
            
        int gloabl_max=0;
        int[] dp = new int[n];
        //Arrays.fill(dp,1);
        dp[0]=1;
        for(int i=1;i<n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i])
                    max= Math.max(max, dp[j]);
            }
            dp[i]= max+1;
            gloabl_max= Math.max(gloabl_max,dp[i]);
        }
        return gloabl_max;
        
    }
} 