// Last updated: 10/10/2025, 11:14:12 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l1 = new ArrayList<>();
        Parenthesis(n,0,0,"",l1);
        return l1;

        
    }
    public static void Parenthesis(int n,int closed,int open,String ans,List<String> l1){
        if(open == n && closed == n){
            l1.add(ans);
            return ;
        }


        if(open>n || closed>n){
            return;
        }
        Parenthesis(n,closed,open+1,ans+"(",l1);
        if(closed<open){
        Parenthesis(n,closed+1,open,ans+")",l1);
        }
    }
}