// Last updated: 1/14/2026, 12:47:15 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int xor = 0;
4        for(int i =0;i<nums.length;i++){
5            xor = xor^nums[i];
6        }
7        int mask = (xor&(-1*xor));//(xor&(~(xor-1)))
8        int a= 0;
9        for(int i =0;i<nums.length;i++){
10            if((mask & nums[i])!=0){
11                a = a^ nums[i];
12            }
13
14        }
15        int b = xor^a;
16        return new int[] {a,b};
17        
18    }
19}