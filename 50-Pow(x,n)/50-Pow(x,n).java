// Last updated: 10/13/2025, 11:11:09 PM
class Solution {
    public double myPow(double x, int n) {
        double ans = 0;
        if(n>=0){
            long N =n;
         ans =  power(x,N);
        }
        else{
            long N = n;
            N = Math.abs(N);
            ans =1/power(x,N); 
        }
        return ans;
        
    }
    public static double power(double x,long n){
        if(n==0){
            return 1;

        }
       
        double ans = power(x,n/2);
        if(n%2==0){
         return ans*ans;
        }
        else{
            return ans*ans*x;
        }
        
        
    }
}