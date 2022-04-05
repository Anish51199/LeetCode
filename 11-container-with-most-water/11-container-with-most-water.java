class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        
        int area= Math.min(height[left],height[right])*(right-left);
        while(left<right){
            if(height[left]> height[right])
                right--;
            else
                left++;
            
            int area1= Math.min(height[left],height[right])*(right-left);
            area=Math.max(area,area1);
        }
        
        return area;
    }
}