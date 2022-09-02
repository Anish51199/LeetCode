class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int[] P= {-1,1};
       // int smallest=0;
        int res=0;
        int n=arr1.length;
        
        for(int p:P){
            for(int q:P){
                int smallest= p*arr1[0] + q*arr2[0] + 0;
                for(int i=0;i<n;i++){
                    int curr= p*arr1[i] + q*arr2[i] + i;
                    res= Math.max(res, curr-smallest);
                    smallest= Math.min(smallest,curr);
                }
            }
        }
        return res;
    }
}