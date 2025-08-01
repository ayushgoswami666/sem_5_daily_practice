// Last updated: 8/1/2025, 10:28:50 PM
class Solution {
    public void reverseString(char[] s) {
        int i =0;
        int j = s.length-1;
        while(j>i){
            char a= s[i];
            s[i] =  s[j];
            s[j] = a;
            i++;
            j--;
        }
        
        

        
    }
}