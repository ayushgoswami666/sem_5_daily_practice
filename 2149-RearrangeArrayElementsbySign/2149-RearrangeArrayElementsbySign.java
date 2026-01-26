// Last updated: 1/27/2026, 12:52:26 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int[] pos  = new int[n/2]; 
5        int[] neg = new int[n/2];
6        int k =0;
7        int j = 0;
8        for(int i =0;i<nums.length;i++){
9            if(nums[i]>0){
10                pos[k] = nums[i];
11                k=k+1;
12            }
13            else{
14                neg[j]= nums[i];
15                j = j+1;
16            }
17
18        }
19        k =0;
20        j =0;
21        for(int i =0;i<n;i++){
22            if(i%2==0){
23                nums[i] = pos[k];
24                k+=1;
25            }
26            else{
27                nums[i] = neg[j];
28                j+=1;
29            }
30        }
31        return nums;
32        
33    }
34}