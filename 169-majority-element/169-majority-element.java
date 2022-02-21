class Solution {
    public int majorityElement(int[] nums) {
       //ap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int index=0,count=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]==nums[index])
                count++;
            else if (nums[i]!=nums[index]){
                count--;
            }
            if(count==0){
                count=1;
                index=i;
            }
        }
        return nums[index];
    }
    
    }
