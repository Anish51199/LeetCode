class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list= new ArrayList<>();
        String str="";
        generateParenthesishelper(n,0,str,list);
        return list;
    }
    
    public void generateParenthesishelper(int open,int close,String str, List<String> list) {
        if(open==0 && close==0){
            list.add(str);
            return;
        }
        if(open>0) generateParenthesishelper(open-1, close+1, str+'(', list);
        if(close>0) generateParenthesishelper(open,close-1,str+')', list);
    }
}