class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = Arrays.stream(A).sum();
        int avg= sum/3;
        if(sum%3!=0) return false;
        int count=0;
        int part=0;
        
        for(int a:A){
            part +=a;
            if(part==avg){
                count++;
                part=0;
            }
        } 
        if (count >=3 && sum%3==0) return true;
        return false;
    }
}