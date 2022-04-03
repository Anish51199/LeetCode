class Solution {
    public void nextPermutation(int[] nums) {
        ArrayList<Integer> permutation= new ArrayList<>();
        for(int i: nums)
            permutation.add(i);
        int k=-1;
        int n=permutation.size();
        for(int i=n-2;i>=0;i--){
            if(permutation.get(i+1)>permutation.get(i)){
                k=i;
                break;
            }
        }

        if(k==-1){
            Collections.reverse(permutation);
            int s=0;
            for(int i: permutation){
            nums[s]=i;
            s++;
            }
            return;
        }

        for(int i=n-1;i>=0;i--){
           if(permutation.get(i)> permutation.get(k)){
               int temp= permutation.get(k);
               permutation.set(k,permutation.get(i));
               permutation.set(i,temp);
               break;
           }
        }

        int p=k+1, q= n-1;

        while (p<=q){
            int temp= permutation.get(p);
            permutation.set(p,permutation.get(q));
            permutation.set(q,temp);
            p++;
            q--;
        }
        int s=0;
        for(int i: permutation){
            nums[s]=i;
            s++;
        }
        
    }
}