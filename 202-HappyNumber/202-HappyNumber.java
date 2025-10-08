// Last updated: 10/8/2025, 10:51:42 PM
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n ;
        do{
            slow = happy(slow);
            fast = happy(happy(fast));
        }
        while(slow!=fast);
        return slow==1;

        

            
        
        
    }
    public static int happy(int n){
        int ans =0;
        while(n>0){
            int remainder = n%10;
            ans+=remainder*remainder;
            n=n/10;
        }
        return ans;
    }
}