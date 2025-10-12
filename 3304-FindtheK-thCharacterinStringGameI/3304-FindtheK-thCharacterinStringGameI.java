// Last updated: 10/12/2025, 10:59:51 PM
class Solution {
    public char kthCharacter(int k) {
        return addnext("a",k);
        

        
    }
    public static char addnext(String str ,int k){
        if(str.length()>=k){
            return str.charAt(k-1);

        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            char next = (char) (c + 1);
            sb.append(next);
        }

        // recursive call with the updated string
        return addnext(sb.toString(), k);
   }
}