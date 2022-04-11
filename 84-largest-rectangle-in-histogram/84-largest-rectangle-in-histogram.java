class Solution {
    public int largestRectangleArea(int[] height) {
      int n=height.length;
        int[] left= LSE(height,n);
        int[] right=RSE(height,n);

        int area=0;
        for(int i=0;i<n;i++){
            area= Math.max(area,height[i]*Math.abs(right[i]-left[i]-1));
            System.out.println(left[i]+" "+right[i]+" "+height[i]);
        }
        return area;
        }
        public static int[] LSE(int[] arr, int n){
        Stack<Integer> st= new Stack<>();
        st.push(0);

        int[] span=new int[n];
        span[0]=-1;
        for (int i=1;i<n;i++){
            while (!st.isEmpty() && arr[i]<=arr[st.peek()])
                st.pop();
            span[i]= (st.isEmpty())?-1:st.peek();
            st.push(i);
        }
        return span;
        }

    public static int[] RSE(int[] arr, int n){
        Stack<Integer> st= new Stack<>();
        st.push(n-1);

        int[] span=new int[n];
        span[n-1]=n;
        for (int i=n-2;i>=0;i--){
            while (!st.isEmpty() && arr[i]<=arr[st.peek()])
                st.pop();
            span[i]= (st.isEmpty())?n:st.peek();
            st.push(i);
        }
        return span;
    }
}