// Last updated: 1/21/2026, 11:55:52 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int n = nums1.length;
4        int m = nums2.length;
5        if(n%2==0 & m%2==0){
6            return 0;
7        }
8        int xor1 = Bitwise_xor(nums1);
9        int xor2 = Bitwise_xor(nums2);
10        if(n%2==1 & m%2==1){
11            return xor1^xor2;
12           
13        }
14         else if(n%2== 1){//odd wale pair ka even pair hoga inka xor 0 hogga
15                return xor2;//isliye yaha se even wala return kra hai kyuki inka
16
17            }
18            else{
19                return xor1;
20            }
21
22        
23    }
24     public static int Bitwise_xor(int[] derived) {
25        int xor =0;
26        for(int num :derived){
27            xor ^=num;
28        }
29        return xor;
30        
31    }
32}