// Last updated: 10/6/2025, 1:06:05 PM
class Solution {
    public String decodeString(String s) { 
        Stack<StringBuilder> st = new Stack<>();
        Stack<Integer> stt = new Stack<>();
        int k =0;
        StringBuilder str = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10 +(c -'0');
               
            }
            else if(c=='['){
                st.push(str);
                stt.push(k);
                str = new StringBuilder();
                k=0;
            }
           else if(c==']'){
                int m = stt.pop();
                StringBuilder sub = st.pop();
                for(int i=0;i<m;i++){
                    sub.append(str);
                }
                str = sub;
                
            }
            else{
                str.append(c);
            }

        }
        return str.toString();

        
        
       
       
        
    }
}