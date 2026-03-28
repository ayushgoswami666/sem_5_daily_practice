// Last updated: 3/28/2026, 11:09:12 PM
1class Solution {
2    public int length(int[] arr,int n)
3    {
4        int sum=0,i=0;
5        for(i=0;i<arr.length;i++)
6        {
7            if(sum+arr[i]>n)
8            return i;
9            sum+=arr[i];
10        }
11        return i;
12    }
13    public int[] answerQueries(int[] nums, int[] queries) {
14        Arrays.sort(nums);
15        for(int i=0;i<queries.length;i++)
16        {
17            int n=length(nums,queries[i]);
18            queries[i]=n;
19        }
20        return queries;
21    }
22}