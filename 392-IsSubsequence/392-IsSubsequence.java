// Last updated: 8/1/2025, 10:19:06 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int tp = 0;
        int  sp = 0;
        while(sp < s.length()  && tp < t.length()){
            if(s.charAt(sp) == t.charAt(tp)){
                sp++;
            }
            tp++;
             
           
        }
          return sp == s.length();

        
    }

}