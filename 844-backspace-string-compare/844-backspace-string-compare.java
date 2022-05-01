class Solution {
    public boolean backspaceCompare(String s, String t) {
        return back(s).equals(back(t));
    }
    
    public static String back(String s){
        String ans="";
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty() && s.charAt(i)=='#') continue;
            if(s.charAt(i)=='#') st.pop();
            else
                st.add(s.charAt(i));
        }
        
        while(!st.isEmpty())
            ans+=st.pop();
        
        System.out.println(ans);
        
        return ans;
    }
}