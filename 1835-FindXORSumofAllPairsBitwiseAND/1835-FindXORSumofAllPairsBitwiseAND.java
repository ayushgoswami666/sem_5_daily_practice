// Last updated: 1/21/2026, 12:13:37 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1 = Bitwise_xor(arr1);
4        int xor2 = Bitwise_xor(arr2);
5        int result = xor1 & xor2;
6       return result;
7        
8    }
9    public static int Bitwise_xor(int[] arr) {
10        int xor = 0;
11        for (int num : arr) {
12            xor ^= num;
13        }
14        return xor;
15    }
16}