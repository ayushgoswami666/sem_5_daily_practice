// Last updated: 4/11/2026, 10:49:18 PM
1class Solution 
2{
3    public int fun(int[] nums,int mid)
4    {
5        int ans=0;
6        for(int i=0;i<nums.length;i++)
7        {
8            ans+=Math.ceil((double) nums[i]/mid);
9        }
10        return ans;
11    }
12    public int smallestDivisor(int[] nums, int threshold) 
13    { 
14        int l=1;
15        int r=Integer.MAX_VALUE;
16        for(int i=0;i<nums.length;i++)
17        {
18            r=Math.max(r,nums[i]);
19            l=Math.min(l,nums[i]);
20        }
21        while(l<=r)
22        {
23            int mid=l+(r-l)/2;
24            int x=fun(nums,mid);
25            if(x<=threshold)
26            {
27                r=mid-1;
28            }
29            else
30            {
31                l=mid+1;
32            }
33        }
34        return l;
35    }
36//please upvote...
37}