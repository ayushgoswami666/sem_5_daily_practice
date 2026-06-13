// Last updated: 6/13/2026, 10:38:38 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length-1;
5        while(low<=high){
6            int mid = (low+ high)/2;
7            // if left part of the array is sorted
8            if(nums[mid]== target){
9                return true;
10            }
11            if(nums[low]== nums[mid] && nums[mid] == nums[high]){
12                low++;
13                high--;
14                continue;
15            }
16            if(nums[low]<= nums[mid]){
17
18                if(nums[low]<=target && target <nums[mid]){
19                    high = mid -1;
20
21                }
22                else{
23                    low = mid +1;
24                }
25
26            }
27            else{
28                if(nums[mid]<target && target <= nums[high]){
29                    low = mid+1;
30                }
31                else{
32                    high = mid -1;
33                }
34            }
35        }
36        return false;
37        
38    }
39}