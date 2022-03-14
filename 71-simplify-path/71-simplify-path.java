class Solution {
    public String simplifyPath(String path) {
        String[] string= path.split("/");
        
        Stack<String> st= new Stack<>();
       // StringBuilder sb= new StringBuilder();
        String res="";
        for(String str: string){
            if(!st.isEmpty() && str.equals("..")) st.pop();
            else if(!str.equals("") && !str.equals(".") && !str.equals(".."))
                st.push(str);
        }
        
        if(st.isEmpty()) return "/";
        
        while(!st.isEmpty()){
            res = "/"+st.pop()+res;
        }
        return res;
    }
}