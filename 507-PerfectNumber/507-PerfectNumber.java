// Last updated: 8/11/2025, 10:16:44 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0) sum+=i;
        }
        if(num==sum) return true;
        return false;
    }
}