class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat= new int[n][n];
        
        int count=0;
        int left=0, right=n-1,top=0,bottom=n-1;
        
        while(count<n*n){
            for(int i=left;i<=right && count<n*n;i++) mat[top][i]=++count;
            for(int j=top+1;j<bottom && count<n*n;j++) mat[j][right]=++count;
            for(int i=right;i>=left && count<n*n;i--) mat[bottom][i]=++count;
            for(int j=bottom-1;j>top && count<n*n;j--) mat[j][left]=++count;
            
            left++;right--;top++;bottom--;
        }
        
        return mat;
    }
}