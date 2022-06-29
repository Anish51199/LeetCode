// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");

            int input[] = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(str[i]);
            }

            // int x = Integer.parseInt(read.readLine());
            Get obj = new Get();
            obj.reverseArray(input, n);

            for (int i = 0; i < n; i++) System.out.print(input[i] + " ");

            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Get {
    
        static void reverse( int[] arr, int n, int low, int high){
        //low=0; high=n-1;
        
        while(low<high){
            int temp= arr[low];
            arr[low]= arr[high];
            arr[high]= temp;
            low++;
            high--;
        }
    }
    public static void reverseArray(int arr[], int n) {
        // Your code here
        reverse(arr,n,0,n-1);
    }
}
