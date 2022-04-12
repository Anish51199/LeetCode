class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans= new int[2];
        ans[0]=firstOccurence(nums,target);
        ans[1]=LastOccurence(nums,target);
        return ans;
    }
    
    public int firstOccurence(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int index=-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
        
           if(arr[mid]>target)
                high=mid-1;
            else if(arr[mid]<target)
                low=mid+1;
            else{
                index=mid;
                high=mid-1;
            }
        }
        
        return index;
    }
    
        public int LastOccurence(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int index=-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
        
           if(arr[mid]>target)
                high=mid-1;
            else if(arr[mid]<target)
                low=mid+1;
            else{
                index=mid;
                low=mid+1;
            }
        }
        
        return index;
    }
}