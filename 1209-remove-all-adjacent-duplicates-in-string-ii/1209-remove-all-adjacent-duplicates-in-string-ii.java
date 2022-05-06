class Solution {
    class Node{
        char a;
        int count;
        
        Node(char a, int i){
            this.a=a;
            this.count=i;
        }
        
    }
    public String removeDuplicates(String s, int k) {
        Stack<Node> st= new Stack<>();
        
        st.push(new Node(s.charAt(0),1));
        
        for(int i=1;i<s.length();i++){
            if(!st.isEmpty() && s.charAt(i)==st.peek().a)
                st.peek().count++;
            else
                st.push(new Node(s.charAt(i),1));
            
            if(st.peek().count==k)  st.pop();               
        }
        String res="";
        
    StringBuilder sb = new StringBuilder();
    for(Node node : st){
        for(int i=0;i<node.count;i++){
            sb.append(node.a);
        }
    }
    return sb.toString();
      //  return res;
    }
}