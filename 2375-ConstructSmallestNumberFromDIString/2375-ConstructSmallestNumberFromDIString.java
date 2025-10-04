// Last updated: 10/4/2025, 3:48:15 PM
class Solution {
    public String smallestNumber(String s) {
        int[] ans = new int[s.length()+1];
        Stack<Integer> st = new Stack<>();
        int c =1;
        for(int i =0;i<=s.length();i++){
            if(s.length()==i || s.charAt(i)=='I'){
                ans[i] = c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()] = c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String str ="";
        for(int i =0;i<ans.length;i++){
            str+=ans[i];
        }
        return str;
        
    }
}