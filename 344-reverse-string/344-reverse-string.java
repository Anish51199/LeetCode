class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st= new Stack<>();
        for(char ch: s){
            st.push(ch);
        }
       // String str="";
        int i=0;
        while(!st.isEmpty()){
            s[i++] =st.pop();
        }
       // return str;
    }
}